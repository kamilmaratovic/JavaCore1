package restAssured_APItesting_HomeWork;

import com.github.javafaker.Faker;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistTest1 {

    private String token;
    private Faker faker;
    private int playlistId;
    private String playlistName;

    @BeforeClass
    public void runOnce(){
        token = Token1.get();
    }

    @BeforeMethod
    public void startUp(){
        faker = new Faker();
        playlistName = faker.artist().name();
        CreatePlaylistRequest1  createPlaylistRequest1= new CreatePlaylistRequest1(playlistName);
//        token = Token1.get();
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist")
                .header("Authorization", token)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(createPlaylistRequest1)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse1 createPlaylistResponse1 = jsonPath.getObject("$", CreatePlaylistResponse1.class);
        playlistId = createPlaylistResponse1.getId();
        Assert.assertEquals(createPlaylistResponse1.getName(), playlistName);

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
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist")
                .header("Authorization", token)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse1[] createPlaylistResponse1 = jsonPath.getObject("$", CreatePlaylistResponse1[].class);
        boolean found = false;
        for (CreatePlaylistResponse1 v : createPlaylistResponse1){
            if(v.getId() == playlistId){
                Assert.assertEquals(v.getName(), playlistName);
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);


    }

    @Test
    public void renamePlaylist(){
        faker = new Faker();
        String newName = faker.funnyName().name();
        RenamePlaylistRequest1 renamePlaylistRequest1 = new RenamePlaylistRequest1(newName);
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization", token)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(renamePlaylistRequest1)
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse1 createPlaylistResponse1 = jsonPath.getObject("$", CreatePlaylistResponse1.class);
        Assert.assertEquals(createPlaylistResponse1.getName(), newName);

    }


}
