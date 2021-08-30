package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import com.github.javafaker.Faker;
import lesson11_Selenium_BrowserFabric.enums.BrowserFabric;
import lesson11_Selenium_BrowserFabric.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
   protected WebDriver driver;
   protected Faker faker;
   protected String username;
   protected String password;
   protected String wrongPassword;
   @Parameters
           ({"email", "password", "wrongPassword"})
    @BeforeMethod
    public void startUp(String email, String password, String wrongPassword) {
        username = email;
        this.password = password;
        this.wrongPassword = wrongPassword;
        BrowserType browserType = BrowserType.CHROME;
        driver = BrowserFabric.getWebdriver(browserType);
        this.faker = new Faker();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
