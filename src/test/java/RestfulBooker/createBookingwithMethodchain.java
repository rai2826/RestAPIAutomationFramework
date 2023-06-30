package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createBookingwithMethodchain {

    public static void main(String[] args) {

        //build request

        //RequestSpecification requestSpecification=RestAssured.given().log().all();
        //RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");
        RestAssured.
                given().
                log().all().
                baseUri("https://restful-booker.herokuapp.com/").
                basePath("booking")
                .body("{\n" +
                "    \"firstname\" : \"Gaurav\",\n" +
                "    \"lastname\" : \"Rai\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2023-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}")
                .contentType(ContentType.JSON).
                post().
                then().
                log().all().
                statusCode(200);


        //hit request and get response

        //Response response =requestSpecification.post();


        //validate response

        //ValidatableResponse validatableResponse=response.then().log().all();
        //validatableResponse.statusCode(200);
    }
}
