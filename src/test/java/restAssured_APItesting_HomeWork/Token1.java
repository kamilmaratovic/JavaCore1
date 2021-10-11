package restAssured_APItesting_HomeWork;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Token1 {
    public static String get(){
        Credentials1 credentials1 = new Credentials1("koeluser06@testpro.io", "te$t$tudent");
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/me")
                .header("Content-Type","application/json")
                .header("Accept", "application/json")
                .body(credentials1)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer "+jsonPath.getString("token");
    }

}
