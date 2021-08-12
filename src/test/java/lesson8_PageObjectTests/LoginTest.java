package lesson8_PageObjectTests;

import lesson8_PageObjects.LoginPage;
import lesson8_PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void loginTest_correctCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginTest_wrongCridentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io", "te$t$tudent1");
        Assert.assertTrue(loginPage.isErrorState());

    }
}
