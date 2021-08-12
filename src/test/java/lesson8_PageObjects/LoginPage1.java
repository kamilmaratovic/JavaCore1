package lesson8_PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage1 {
    private WebDriverWait wait;
    private WebDriver driver;

    public LoginPage1(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 10, 100);
        this.driver = driver;
    }

    private WebElement getEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.cssSelector("[type='password']"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("button"));
    }

    public MainPage1 login(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();

        return new MainPage1(driver);
    }

    public boolean errorFrame() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("error"))));
        } catch (NoSuchElementException | TimeoutException ignored) {
        };
        return driver.findElements(By.className("error")).size() == 1;
    }

    public void open(){
        driver.get("https://bbb.testpro.io/");
    }
}




