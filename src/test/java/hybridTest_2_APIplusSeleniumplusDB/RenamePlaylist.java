package hybridTest_2_APIplusSeleniumplusDB;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lesson11_Selenium_BrowserFabric.enums.BrowserFabric;
import lesson11_Selenium_BrowserFabric.enums.BrowserType;
import lesson9_10_Selenium_PageObjects2_BasePage_Locators.LoginPage;
import models_restAssured_APItesting_DB.CreatePlaylistRequest;
import models_restAssured_APItesting_DB.CreatePlaylistResponse;
import models_restAssured_APItesting_DB.Token;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import z_helpers.DbAdapter;

import static io.restassured.RestAssured.given;

public class RenamePlaylist {
    private String token;
    private int playlistId;
    private Faker faker;
    private String playlistName;
    private WebDriver driver;

    @BeforeClass
    public void runOnce() {
        token = Token.get();
    }

    @BeforeMethod
    public void startUp() {
        driver = BrowserFabric.getWebdriver(BrowserType.CHROME);
        faker = new Faker();
        playlistName = faker.funnyName().name();
        var createPlaylistRequest = new CreatePlaylistRequest(playlistName);
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist")
                .header("Authorization", token)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(createPlaylistRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createPlaylistResponse = jsonPath.getObject("$", CreatePlaylistResponse.class);
        playlistId = createPlaylistResponse.getId();
//        Assert.assertEquals(createPlaylistResponse.getName(), playlistName);
        System.out.println(playlistId);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/" + playlistId)
                .header("Authorization", token)
                .when()
                .delete()
                .then()
                .extract()
                .response();
    }
    @Test
    public void renamePlaylist() throws InterruptedException {
        String newPlaylistName = faker.artist().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        var mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
//            Thread.sleep(5000);
        mainPage.renamePlaylist(newPlaylistName, playlistId+"");
        var playlist = DbAdapter.getPlaylistById1(playlistId);
        Assert.assertNotNull(playlist);
        Assert.assertEquals(newPlaylistName, playlist.getName());

    }
}