package myPackage;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestTest {
    @Test
    public void getName(){
        given()
                .baseUri("https://swapi.dev/api/starships")
                .basePath("/9/")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .body("name", equalTo("Death Star"));
    }
}
