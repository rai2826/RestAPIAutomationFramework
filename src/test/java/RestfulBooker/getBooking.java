package RestfulBooker;

import io.restassured.RestAssured;

public class getBooking {
    public static void main(String[] args) {

        //Given - Build the request

        RestAssured
                .given()
                    .log().all()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/{id}")
                    .pathParam("id",10)

        //When - hit the request and get response
                .get()
        //Then - Validate the response
                .then()
                    .statusCode(200)
                    .log().all();
    }
}
