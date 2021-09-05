package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import z_helpers.TestObjectGenerator;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.MainPage;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTest extends BaseTest{

    @Test
    public void playlistTest_createPlayList_playlistCreated(){
        String playlistName = TestObjectGenerator.randomString(12);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId= mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, playlistName));


    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed() {
        String playlistName = TestObjectGenerator.randomString(10);
        String newPlaylistName = faker.animal().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId= mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(newPlaylistName, playlistId);
        Assert.assertTrue(mainPage.isNewPlaylistExist(playlistId, newPlaylistName));
//        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, newPlaylistName));
    }

    @Test
    public void playlistTest_deletePlaylists_playlistDeleted() {
        String playlistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.deletePlaylist(playlistId, playlistName);
        Assert.assertTrue(mainPage.isPlaylistDeleted(playlistId, playlistName));
    }

//    @Test
//    public void playlistTest_addSongs_songsAdded()  {
//        String playlistName = "KAMZIK111";
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
//        String playlistId = mainPage.createPlaylist(playlistName);
//        mainPage.addSongs(playlistName);
//    }
    @Test
    public void songTest_addSongToFavorites_songAdded() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        boolean xx = mainPage.addSongToFavorites();
        Assert.assertTrue(xx);
    }

    @Test
    public void playlistTest_createPlayList_playlistCreated1(){
        String playlistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId= mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, playlistName));


    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed1() {
        String playlistName = TestObjectGenerator.randomString(9);
        String newPlaylistName = faker.animal().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId= mainPage.createPlaylist(playlistName);
        mainPage.renamePlaylist(newPlaylistName, playlistId);
        Assert.assertTrue(mainPage.isNewPlaylistExist(playlistId, newPlaylistName));
//        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, newPlaylistName));
    }

    @Test
    public void playlistTest_deletePlaylists_playlistDeleted1() {
        String playlistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.deletePlaylist(playlistId, playlistName);
        Assert.assertTrue(mainPage.isPlaylistDeleted(playlistId, playlistName));
    }

    @Test
    public void songTest_addSongToFavorites_songAdded1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        boolean xx = mainPage.addSongToFavorites();
        Assert.assertTrue(xx);
    }
}
