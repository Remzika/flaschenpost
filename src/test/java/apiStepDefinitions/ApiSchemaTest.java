package apiStepDefinitions;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class ApiSchemaTest {
    Response response;
    RequestSpecification requestSpecification;
    @Before
    public void setUp(){
        RestAssured.baseURI = "https://flapotest.blob.core.windows.net/test/ProductData.json";

    }

    @Test
    /**
     * in this Test we check the status code.
     */
    public void statusCodeTest(){
        response= given().when().get();
        Assert.assertEquals(200, response.getStatusCode());
        //response.getBody().prettyPrint();
    }
    @Test
    /**
     * In this Test we check the JsonSchema.
     */
    public void jsonSchemaTest(){
        requestSpecification= RestAssured.given();

        requestSpecification.given().when().get().then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("artikel.json"));
    }

}
