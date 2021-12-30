package lesson5_Selenium_SimpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleTests_3AssertWays {
    @Test

    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.sendKeys("koeluser06@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
//        passwordField.sendKeys("te$t$tudent", Keys.ENTER);
        passwordField.sendKeys("te$t$tudent");
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();
        Thread.sleep(3000);

     //   1 way to asserte test

        boolean logged1 = false;
        try{
            driver.findElement(By.className("home"));
            logged1 = true;
        } catch (NoSuchElementException ignored){}

        Assert.assertTrue(logged1);

        //2 way to assert test

//        boolean logged = driver.findElement(By.className("home")).isDisplayed();
//        Assert.assertTrue(logged);

        //3 way to assert test

        List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
        Assert.assertEquals(1, homes.size());

        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void loginTest_wrongCredentials_errorFrame() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.sendKeys("koeluser06@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        passwordField.sendKeys("te$t$tudent1");
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();
        Thread.sleep(1000);
        boolean frame = false;
        try{
            driver.findElement(By.className("error"));
            frame = true;
        } catch (NoSuchElementException ignored){}

        Assert.assertTrue(frame);

        Thread.sleep(3000);
        driver.quit();
    }

    @Test public void loginTest_wrongCredentials_errorFrame1() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[placeholder='Email Address']")).sendKeys("koeluser06@testpro.io");
        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("te$t$tudent1", Keys.ENTER);
        Thread.sleep(1000);
        List<WebElement> frames = driver.findElements(By.className("error"));
        Assert.assertEquals(1, frames.size());

        Thread.sleep(3000);
        driver.quit();
    }
}
