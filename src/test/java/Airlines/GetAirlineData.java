package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.URIParameter;

public class GetAirlineData {

    @Test
    public void GetAirlineRequest(){

       Response response= RestAssured.given()
                .baseUri("https://api.instantwebtools.net/v1/airlines/153183")
                .contentType(ContentType.JSON)
                .get()
                .then().log().all()
                .extract().response();

        Assert.assertEquals(response.statusCode(),200);



    }
}
