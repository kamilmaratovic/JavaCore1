package lesson9_10_Selenium_PageObjects2_BasePage_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmailField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginPageLocators.cssEmailLocator)));
        return driver.findElement(By.cssSelector(LoginPageLocators.cssEmailLocator));
    }

    private WebElement getPasswordField(){

        return driver.findElement(LoginPageLocators.byPassword);
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }



    public MainPage login (String username, String password){
        driver.get("https://bbb.testpro.io/");
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }

    public void open(){
        driver.get("https://bbb.testpro.io/");
    }

    public boolean isErrorState() {

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error")));
        } catch (NoSuchElementException | TimeoutException ignored){};

        return driver.findElements(By.className("error")).size()==1;
    }
}
