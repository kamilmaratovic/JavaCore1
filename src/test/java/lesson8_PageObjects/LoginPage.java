package lesson8_PageObjects;

import lesson9_Selenium_PageObjects2_Locators.LoginPageLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait =new WebDriverWait (driver, 10, 100);
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
