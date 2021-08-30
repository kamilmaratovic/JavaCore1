package lesson9_10_Selenium_PageObjects2_BasePage_Locators;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected FluentWait<WebDriver> fluentWait;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait =new WebDriverWait (driver, 50, 30);
        this.fluentWait = new FluentWait<>(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring (StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10));
    }
}
