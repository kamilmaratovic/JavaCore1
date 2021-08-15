package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import helpers.TestObjectGenerator;
import lesson8_PageObjects.LoginPage;
import lesson8_PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTest extends BaseTest{

    @Test
    public void playlistTest_createPlayList_playlistCreated(){
        String playlistName = faker.funnyName().name();
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
