package lesson8_PageObjectTests;

import lesson8_PageObjects.LoginPage1;
import lesson8_PageObjects.MainPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaylistTest1 {
    WebDriver driver;
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void playlistTest_createPlayList_playlistCreated(){
        String name = "Kamzik";
        LoginPage1 loginPage1 = new LoginPage1(driver);
        loginPage1.open();
        MainPage1 playlist= loginPage1.login("koeluser06@testpro.io", "te$t$tudent");
//        MainPage1 playlist = new MainPage1(driver);
        String playlistId = playlist.createPlaylist(name);
//        Assert.assertTrue(playlist.successMessage());
        Assert.assertTrue(playlist.checkPlaylistExist(playlistId, name));

    }
}
