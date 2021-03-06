package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import lesson9_10_Selenium_PageObjects2_BasePage_Locators.LoginPage;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.MainPage;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_A extends BaseTest{

    @Test
//            (retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_correctCredentialsA(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen());
//        boolean pass = false;
//        if (error_count==2){
//            pass=true;
//        } error_count++;
//        Assert.assertTrue(pass);
    }
    @Test
    public void loginTest_wrongCridentialsA(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());

    }

    @Test
    public void loginTest_correctCredentials1A(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginTest_wrongCridentials1A(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());

    }
    @Test
    public void loginTest_correctCredentials2A(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test(enabled = false)
    public void loginTest_wrongCridentials2A(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());

    }


}
