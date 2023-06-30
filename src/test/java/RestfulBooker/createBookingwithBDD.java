package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class createBookingwithBDD {

    public static void main(String[] args) {

        //Given - Build request

        RestAssured
                .given()
                     .log().all().
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
                        .contentType(ContentType.JSON)
        //When - hit the request

                .when()
                    .post()
                .then()
                        .statusCode(200);
        //Then

    }
}
