package lesson9_10_Selenium_PageObjects2_BasePage_Locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final String cssEmailLocator = "[type='email']";
    public static final By byPassword = By.cssSelector(("[type='password']"));
}
