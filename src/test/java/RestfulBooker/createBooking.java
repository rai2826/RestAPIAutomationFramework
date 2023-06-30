package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createBooking {

    public static void main(String[] args) {

        //build request

        RequestSpecification requestSpecification=RestAssured.given().log().all();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.body("{\n" +
                "    \"firstname\" : \"Gaurav\",\n" +
                "    \"lastname\" : \"Rai\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2023-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}");
        requestSpecification.contentType(ContentType.JSON);


        //hit request and get response

        Response response =requestSpecification.post();


        //validate response

        ValidatableResponse validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);
    }
}
