package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import lesson9_10_Selenium_PageObjects2_BasePage_Locators.MainPage;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test (enabled = false)
    public void loginTest_correctCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test (enabled = false)
    public void loginTest_wrongCridentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());

    }

    @Test
    public void loginTest_correctCredentials1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginTest_wrongCridentials1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());

    }
    @Test
    public void loginTest_correctCredentials2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginTest_wrongCridentials2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());

    }


}
