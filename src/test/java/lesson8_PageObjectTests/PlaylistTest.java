package lesson8_PageObjectTests;

import com.github.javafaker.Faker;
import z_helpers.TestObjectGenerator;
import lesson8_PageObjects.LoginPage;
import lesson8_PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaylistTest {
    WebDriver driver;
    Faker faker;
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        this.faker = new Faker();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void playlistTest_createPlayList_playlistCreated(){
        String playlistName = "ZZZ";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        String playlistId= mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, playlistName));


    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed() {
        String playlistName = TestObjectGenerator.randomString(8);
        String newPlaylistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
        String playlistId= mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(newPlaylistName, playlistId);
        Assert.assertTrue(mainPage.isNewPlaylistExist(playlistId, newPlaylistName));
//        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, newPlaylistName));
    }
}
