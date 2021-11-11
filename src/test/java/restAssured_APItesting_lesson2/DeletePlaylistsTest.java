package restAssured_APItesting_lesson2;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import listeners.RetryAnalyzer;
import models_restAssured_APItesting_DB.CreatePlaylistRequest;
import models_restAssured_APItesting_DB.CreatePlaylistResponse;
import models_restAssured_APItesting_DB.Token;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeletePlaylistsTest {
    String token;
    CreatePlaylistResponse[] playlists;
    @BeforeClass
    public void runOnce(){
        token = Token.get();
    }

    @BeforeMethod
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
            playlists = jsonPath.getObject("$", CreatePlaylistResponse[].class);
        }

        @Test
        public void purge_AllPlaylists(){
            for (CreatePlaylistResponse pl : playlists){
                given()
                        .baseUri("https://bbb.testpro.io/api/playlist/" + pl.getId())
                        .header("Authorization", token)
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
            }
}}
