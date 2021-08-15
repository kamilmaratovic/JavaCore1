package lesson9_10_Selenium_PageObjects2_BasePage_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        } catch (NoSuchElementException | TimeoutException ignored) {
        }
        ;

        return driver.findElements(By.xpath("//*[@class='home active']")).size() == 1;
    }

    public void clickPlusButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'fa-plus-circle')]")));
        ;
        for (int i = 0; i < 10; i++) {
            try {
                driver.findElement(By.xpath("//*[contains(@class,'fa-plus-circle')]")).click();
                break;
            } catch (NoSuchElementException | ElementNotInteractableException | TimeoutException ignored) {
            }
            ;

        }
    }

    public void clickNewPlaylistField() {
        for (int i = 0; i < 10; i++) {
            try {
                driver.findElement(By.xpath("//*[text()='New Playlist']")).click();
                break;
            } catch (NoSuchElementException | ElementClickInterceptedException | TimeoutException ignored) {
            }
            ;

        }
    }

    public WebElement getPlaylistNameField() {
        for (int i = 0; i < 10; i++) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@placeholder, 'to save')]")));
            } catch (TimeoutException | ElementNotInteractableException ignored) {
            }
            ;
        }
        return driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
    }

    public String createPlaylist(String playlistName) {
        clickPlusButton();
        clickNewPlaylistField();
        getPlaylistNameField().sendKeys(playlistName, Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'success')]")));
        String url = driver.getCurrentUrl();
        String[] parts = url.split("/");
        String playlistId = parts[5];
        return playlistId;
    }

    public boolean checkPlaylistExist(String playlistId, String playlistName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/" + playlistId + "']")));
        WebElement createdPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        return createdPlaylist.getText().equals(playlistName);
    }

    public void renamePlaylist(String newPlaylistName, String playlistId) {
        Actions action = new Actions(driver);
        WebElement myPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myPlaylist);

        for (int i = 0; i < 10; i++) {
            try {
                action.doubleClick(myPlaylist).perform();
                wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[contains(@class, 'playlist editing')]/input"))));
                action.doubleClick(driver.findElement(By.xpath("//*[contains(@class, 'playlist editing')]"))).perform();
                action.sendKeys(newPlaylistName, Keys.ENTER).perform();

                break;
            } catch (TimeoutException | ElementNotInteractableException ignored) {
            }
            ;
        }
    }

    public boolean isNewPlaylistExist(String playlistId, String newPlaylistName) {
        List<WebElement> playlists = driver.findElements(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        for (int i = 0; i < 10; i++) {
            try {
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@href='#!/playlist/" + playlistId + "']")));

            } catch (NoSuchElementException | TimeoutException ignored) {
            }
            ;
        }


        return playlists.size() > 0 && playlists.get(0).getText().equals(newPlaylistName);

    }
}

