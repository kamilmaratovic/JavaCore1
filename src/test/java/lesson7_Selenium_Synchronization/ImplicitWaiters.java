package lesson7_Selenium_Synchronization;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWaiters {

    //It will wait for every element during a specific time period (it checks elements availability every 1/2 sec)

        WebDriver driver;

        @BeforeMethod
        public void startUp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            this.driver = new ChromeDriver();
            driver.get("https://bbb.testpro.io/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

        @Test

        public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.sendKeys("koeluser06@testpro.io");
            WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
//        passwordField.sendKeys("te$t$tudent", Keys.ENTER);
            passwordField.sendKeys("te$t$tudent");
            WebElement loginButton = driver.findElement(By.cssSelector("button"));
            loginButton.click();

            //   1 way to asserte test

            boolean logged = false;
            try{
                driver.findElement(By.className("home"));
                logged = true;
            } catch (NoSuchElementException ignored){}

            Assert.assertTrue(logged);

            //2 way to assert test

//        boolean logged = driver.findElement(By.className("home")).isDisplayed();
//        Assert.assertTrue(logged);

            //3 way to assert test

            List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
            Assert.assertEquals(1, homes.size());

        }

        @Test
        public void loginTest_wrongCredentials_errorFrame() throws InterruptedException {

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.sendKeys("koeluser06@testpro.io");
            WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
            passwordField.sendKeys("te$t$tudent1");
            WebElement loginButton = driver.findElement(By.cssSelector("button"));
            loginButton.click();
            boolean frame = false;
            try{
                driver.findElement(By.className("error"));
                frame = true;
            } catch (NoSuchElementException ignored){}

            Assert.assertTrue(frame);
        }

        @Test public void loginTest_wrongCredentials_errorFrame1() throws InterruptedException {
            driver.findElement(By.cssSelector("[placeholder='Email Address']")).sendKeys("koeluser06@testpro.io");
            driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("te$t$tudent1", Keys.ENTER);
            List<WebElement> frames = driver.findElements(By.className("error"));
            Assert.assertEquals(1, frames.size());
        }
    }

