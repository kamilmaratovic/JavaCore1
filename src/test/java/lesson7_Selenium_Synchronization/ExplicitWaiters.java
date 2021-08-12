package lesson7_Selenium_Synchronization;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExplicitWaiters {
    //There are 3 types of Explicit Waits:
    // - Thread sleep
    // - Wait (WebDriverWait)
    // - Fluent Wait

    WebDriver driver;
    WebDriverWait wait;
    FluentWait <WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        wait = new WebDriverWait(driver,20, 100);
        fluentWait = new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring (StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test

    public void loginTest_correctCredentials_loggedToApp() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.sendKeys("koeluser06@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
//        passwordField.sendKeys("te$t$tudent", Keys.ENTER);
        passwordField.sendKeys("te$t$tudent");
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();

        //   1 way to asserte test

//        boolean logged = false;
//        try{
//            driver.findElement(By.className("home"));
//            logged = true;
//        } catch (NoSuchElementException ignored){}
//
//        Assert.assertTrue(logged);

        //2 way to assert test

//        boolean logged = driver.findElement(By.className("home")).isDisplayed();
//        Assert.assertTrue(logged);

        //3 way to assert test
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
        Assert.assertEquals(1, homes.size());

    }

    @Test
    public void loginTest_wrongCredentials_errorFrame() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")));
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.sendKeys("koeluser06@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//*[@type='password']"));
        passwordField.sendKeys("te$t$tudent1");
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();

        fluentWait.until(x->x.findElement(By.className("error")));
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


