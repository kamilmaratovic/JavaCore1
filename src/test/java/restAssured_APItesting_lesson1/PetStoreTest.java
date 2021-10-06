package restAssured_APItesting_lesson1;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import models.Pet;


import static io.restassured.RestAssured.given;

public class PetStoreTest {
    @Test
    public void getPetById(){
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2/")
                        .basePath("pet/100")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();

        Pet petResponse = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(petResponse.getName(), "Cat");
    }
}
