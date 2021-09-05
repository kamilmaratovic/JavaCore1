package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import z_helpers.TestObjectGenerator;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.LoginPage;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTest_A extends BaseTest{

    @Test
    public void playlistTest_createPlayList_playlistCreatedA(){
        String playlistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId= mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, playlistName));


    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamedA() {
        String playlistName = TestObjectGenerator.randomString(11);
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
    public void playlistTest_deletePlaylists_playlistDeletedA() {
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
    public void songTest_addSongToFavorites_songAddedA() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        boolean xx = mainPage.addSongToFavorites();
        Assert.assertTrue(xx);
    }

    @Test
    public void playlistTest_createPlayList_playlistCreated1A(){
        String playlistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId= mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playlistId, playlistName));


    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed1A() {
        String playlistName = TestObjectGenerator.randomString(8);
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
    public void playlistTest_deletePlaylists_playlistDeleted1A() {
        String playlistName = faker.funnyName().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
        mainPage.deletePlaylist(playlistId, playlistName);
        Assert.assertTrue(mainPage.isPlaylistDeleted(playlistId, playlistName));
    }

    @Test
    public void songTest_addSongToFavorites_songAdded1A() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        boolean xx = mainPage.addSongToFavorites();
        Assert.assertTrue(xx);
    }
}
