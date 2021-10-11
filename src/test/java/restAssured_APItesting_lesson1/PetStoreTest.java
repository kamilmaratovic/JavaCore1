package restAssured_APItesting_lesson1;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import models_restAssured_APItesting.Pet;
import z_helpers.TestObjectGenerator;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PetStoreTest {
    private long petId;
    String baseUri = "https://petstore.swagger.io/v2/";
    Pet pet;
    Pet updatedPet;
    private Map<String, String> getFormParamsMap() {
        Map<String, String> formParams = new HashMap<>();
        formParams.put("name", updatedPet.getName());
        return formParams;}
    @BeforeMethod
    public void startUp() throws InterruptedException {
        pet = TestObjectGenerator.genarateRandomPet();

            Response response =
                    given()
                            .baseUri(baseUri)
                            .basePath("pet")
                            .header("Content-Type","application/json")
                            .body(pet)
                            .when()
                            .post()
                            .then()
                            .statusCode(200)
                            .extract()
                            .response();
        JsonPath jsonPath = response.jsonPath();
        petId = jsonPath.getLong("id");
        System.out.println(petId);

    }
    @AfterMethod
    public void tearDown(){
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("pet/"+petId)
                        .header("Content-Type","application/json")
                        .when()
                        .delete()
                        .then()
                        .extract()
                        .response();

    }
    @Test
    public void getPetById() {
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("pet/"+petId)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(petResponse.getName(), pet.getName());
        Assert.assertEquals(petResponse.getStatus(),pet.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(), pet.getCategory().getName());
    }
    @Test

    public void updatePet(){
       Pet updatedPet = TestObjectGenerator.genarateRandomPet();
       updatedPet.setId(petId);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("pet")
                        .header("Content-Type","application/json")
                        .body(updatedPet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(petResponse.getName(), updatedPet.getName());
        Assert.assertEquals(petResponse.getStatus(),updatedPet.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(), updatedPet.getCategory().getName());
    }

    @Test

    public void updatePet_formData(){
        updatedPet = TestObjectGenerator.genarateRandomPet();
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("pet/"+petId)
                        .header("Content-Type","application/x-www-form-urlencoded")
                        .body(getFormParamsMap())
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(petResponse.getId(), updatedPet.getId());
        Assert.assertEquals(petResponse.getName(),updatedPet.getName());
//        Assert.assertEquals(petResponse.getCategory().getName(), updatedPet.getCategory().getName());
    }

}
