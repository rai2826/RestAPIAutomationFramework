package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;

public class CreateAirlineData {

    @Test
    public void insertairlinedata(){
        String endPoint = "https://api.instantwebtools.net/v1/airlines";
        String payload = payloads.getCreateAirlinePayload("167100","Gaura airlines","gaurav states","GRV","Hail gaurav","Ghazipur","sample","1990");

        Response response=RestUtils.performPost(endPoint,payload,new HashMap<>());

        Assert.assertEquals(response.statusCode(),200);

        //lets test the merge
    }
}
