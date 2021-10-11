package restAssured_APItesting_lesson2;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models_restAssured_APItesting.CreatePlaylistRequest;
import models_restAssured_APItesting.CreatePlaylistResponse;
import models_restAssured_APItesting.RenamePlaylistRequest;
import models_restAssured_APItesting.Token;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistTest {
    private Faker faker;
    private int playlistId;
    private String playlistName;
    private String token;
    @BeforeClass
    public void runOnce(){
        token = Token.get();
    }

    @BeforeMethod
    public void startUp(){
        faker = new Faker();
        token = Token.get();
        playlistName = faker.artist().name();
        CreatePlaylistRequest createPlaylistRequest = new CreatePlaylistRequest(playlistName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Accept", "application/json")
                        .header("Authorization", token)
                        .body(createPlaylistRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createPlaylistResponse = jsonPath.getObject("$", CreatePlaylistResponse.class);
        playlistId = createPlaylistResponse.getId();
        Assert.assertEquals(playlistName, createPlaylistResponse.getName());
        System.out.println(playlistId);
    }

    @AfterMethod

    public void tearDown(){
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("Authorization", token)
                        .when()
                        .delete()
                        .then()
                        .extract()
                        .response();


    }

    @Test
    public void getPlaylist(){
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Accept", "application/json")
                        .header("Authorization", token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse[] createPlaylistsResponse = jsonPath.getObject("$", CreatePlaylistResponse[].class);
        boolean found = false;
        for(CreatePlaylistResponse playlist : createPlaylistsResponse){
            if(playlist.getId() == playlistId){
                Assert.assertEquals(playlist.getName(), playlistName);
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);
    }

    @Test
    public void renamePlaylist(){
        String updatedName = faker.funnyName().name();
        RenamePlaylistRequest renamePlaylistRequest = new RenamePlaylistRequest(updatedName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("Content-Type","application/json")
                        .header("Accept", "application/json")
                        .header("Authorization", token)
                        .body(renamePlaylistRequest)
                        .when()
                        .patch()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createPlaylistResponse = jsonPath.getObject("$", CreatePlaylistResponse.class);
        Assert.assertEquals(createPlaylistResponse.getName(), updatedName);
    }



}
