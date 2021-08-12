package lesson8_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait =new WebDriverWait (driver, 10, 100);
    }

    public boolean isOpen() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        } catch (NoSuchElementException | TimeoutException ignored){};

        return driver.findElements(By.xpath("//*[@class='home active']")).size()==1;
    }

    public void createPlaylist(String name){

    }
}
