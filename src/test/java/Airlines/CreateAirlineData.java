package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAirlineData {

    @Test
    public void insertairlinedata(){

       Response response= RestAssured.given()
                .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"id\": 153180,\n" +
                        "    \"name\": \"GRV Airways\",\n" +
                        "    \"country\": \"GRV\",\n" +
                        "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                        "    \"slogan\": \"From Rewathipur\",\n" +
                        "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                        "    \"website\": \"www.srilankaairways.com\",\n" +
                        "    \"established\": \"1987\"\n" +
                        "}")
                .post()
                        .then().log().all().extract().response();


        Assert.assertEquals(response.statusCode(),200);

    }
}
