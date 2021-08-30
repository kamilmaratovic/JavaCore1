package lesson9_10_Selenium_PageObjects2_BasePage_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage{
    List<String> names1 = new ArrayList<>();
    List<String> names2 = new ArrayList<>();
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
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'fa-plus-circle')]")));
        Actions actions = new Actions(driver);
        for (int p = 0; p < 10; p++) {
            try {
                WebElement plusButton = driver.findElement(By.xpath("//*[contains(@class,'fa-plus-circle')]"));
                actions.moveToElement(plusButton).perform();
                actions.click(plusButton).perform();
                break;
            } catch (NoSuchElementException | ElementNotInteractableException | TimeoutException ignored) {
            };

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
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/" + playlistId + "']")));
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

            } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException ignored) {
            }
            ;
        }


        return playlists.size() > 0 && playlists.get(0).getText().equals(newPlaylistName);

    }

    public void deletePlaylist(String playlistId, String playlistName) {
        Actions actions = new Actions(driver);
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        WebElement deleteButton = driver.findElement(By.xpath("//*[@class='active']/following-sibling::*/ul/li[2]"));

        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", playlist);
            actions.contextClick(playlist).perform();
            wait.until(ExpectedConditions.visibilityOf(deleteButton));
            actions.moveToElement(deleteButton).perform();
            deleteButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'success')]")));
            Thread.sleep(1000);

        } catch (StaleElementReferenceException | NoSuchElementException | ElementNotInteractableException | InterruptedException ignored) {
        }
        ;


    }


    public boolean isPlaylistDeleted(String playlistId, String playlistName) {
        List<WebElement> playlists = driver.findElements(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));

        for (WebElement v : playlists) {
            if (v.getText() == playlistName) {
                System.out.println("Playlist not deleted");
            } else System.out.println("Playlist deleted");
            ;
        }
        return playlists.size() == 0;
    }

//            public List<String> isSongsAddedToFavorites () {
//                WebElement favorites = driver.findElement(By.xpath("//*[@href='#!/favorites']"));
//                favorites.click();
//                List<WebElement> favoriteSongs = driver.findElements(By.xpath("//*[contains(@class,'scroll-wrap favorites')]/div[1]/div[1]/table[1]/tr/td[2]"));
//                for (WebElement t : favoriteSongs) {
//                    if (t.getText() == names1.)
//
//                }
//                System.out.println(names1);
//                return names1.containsAll();
//            }

    public boolean addSongToFavorites() {
        Actions actions = new Actions(driver);
        for (int i = 0; i < 50; i++) {
            try {
                WebElement allSongs = driver.findElement(By.xpath("//*[contains(@class,'songs') and @href='#!/songs']"));
                actions.moveToElement(allSongs).perform();
                allSongs.click();
                break;
            } catch (NoSuchElementException ignored) {
            }
            ;
        }
        List<WebElement> songRows = driver.findElements(By.xpath("//*[contains(@class, 'wrap all-songs')]/div[1]/div[1]/table[1]/tr/td[2]"));

        for (int g = 0; g < 10; g++) {
            String name = songRows.get(g).getText();
            names1.add(name);
        }
        for (int l = 0; l < 10; l++) {
            actions.doubleClick(songRows.get(l)).perform();
            for (int a = 0; a < 50; a++) {
                try {
                    WebElement likeButton = driver.findElement(By.xpath("//*[@title='Like current song']"));
                    actions.moveToElement(likeButton).perform();
                    likeButton.click();
                } catch (NoSuchElementException ignored) {
                }
                ;
            }
        }
        WebElement favorites = driver.findElement(By.xpath("//*[@href='#!/favorites']"));
        favorites.click();
        List<WebElement> favoriteSongs = driver.findElements(By.xpath("//*[contains(@class,'scroll-wrap favorites')]/div[1]/div[1]/table[1]/tr/td[2]"));
        for (int y = 0; y < 10; y++) {
            String name = favoriteSongs.get(y).getText();
            names2.add(name);
        }

        return names2.containsAll(names1) && favoriteSongs.size() == 10;
    }
    }


