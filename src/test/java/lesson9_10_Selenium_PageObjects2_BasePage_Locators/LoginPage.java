package lesson9_10_Selenium_PageObjects2_BasePage_Locators;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.lang.model.element.Element;
import java.util.concurrent.ExecutionException;

public class LoginPage extends BasePage{
    private static Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmailField(){
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }

    private WebElement getPasswordField(){
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(("[type='password']"))));
        return driver.findElement(By.cssSelector(("[type='password']")));
    }

    private WebElement getLoginButton(){
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }



    public MainPage login (String username, String password) {
        logger.warn("Attempt to log in to app using "+username+" "+password);
//        driver.get("https://bbb.testpro.io/");
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        try{
            getLoginButton().click();
        }catch (NoSuchElementException | ElementClickInterceptedException ignored){logger.error("Login Button wasnt click"+ignored.getLocalizedMessage());};

        return new MainPage(driver);
    }

    public void open() {
        driver.get("https://bbb.testpro.io/");
    }

    public boolean isErrorState() {

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error")));
        } catch (NoSuchElementException | TimeoutException ignored){};

        return driver.findElements(By.className("error")).size()==1;
//        return driver.findElements(By.xpath("//*[@class='home active']")).size() == 0;
    }
}
