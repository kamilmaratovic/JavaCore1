package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import lesson8_PageObjects.LoginPage;
import lesson8_PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

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
