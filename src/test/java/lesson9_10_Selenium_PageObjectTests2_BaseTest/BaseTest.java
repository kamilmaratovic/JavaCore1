package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
   protected WebDriver driver;
   protected Faker faker;
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        this.faker = new Faker();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
