package lesson8_PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage1 {
    WebDriver driver;
    WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    public MainPage1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10, 100);
        this.fluentWait = new FluentWait(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100));
    }

    private WebElement getPlusButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'fa-plus-circle')]")));
        return driver.findElement(By.xpath("//*[contains(@class,'fa-plus-circle')]"));

    }
    //Additional way (custommade waiter)
    //private void clickPlusButton(){
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'fa-plus-circle')]")));
    // for (int i = 0;i<5; i++){
    // try{
    // driver.findElement(By.xpath("//*[contains(@class,'fa-plus-circle')]")).click();
    // break;
    // } catch (ElementClickInterceptedException ignored)
    // }
    // }

    private WebElement getNewPlaylistField() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='New Playlist']")));
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getPlaylistNameField() {
        return driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
    }

    public String createPlaylist(String playlistName) {
        getPlusButton().click();
        getNewPlaylistField().click();
        getPlaylistNameField().sendKeys(playlistName, Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'success')]")));
        String url = driver.getCurrentUrl();
//        System.out.println(url);
        String[] parts = url.split("/");
        return url.split("/")[5];
    }


    public boolean successMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'success')]")));
        } catch (NoSuchElementException | TimeoutException ignored) {
        }
        ;

        return driver.findElements(By.xpath("//*[contains(@class, 'success')]")).size() == 1;
    }


    public boolean checkPlaylistExist(String playlistId, String name) {
        WebElement newPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        return newPlaylist.getText().equals(name);
    }
}

