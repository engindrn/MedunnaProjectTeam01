package stepDefinitions.Api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Messages;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveTestDataMessage;

public class US027ApiStepDef {

    Response response;
    RequestSpecification spec;
    Messages expectedTest = new Messages();


    //Get
    @Given("yp Admin set path params for test items")
    public void yp_admin_set_path_params_for_test_items() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1", "api", "2", "c-messages","3","236980");
    }

    @Given("yp Admin enters expected data for test items")
    public void yp_admin_enters_expected_data_for_test_items() {
/*
{
    "id": 236980,
    "name": "Rick Kleiner",
    "email": "evelina.frami@yahoo.com",
    "subject": "Cyborg Boom Boom",
    "message": "This sounds like something The One True Morty might say."
}
 */

        expectedTest.setName("Rick Kleiner");
        expectedTest.setEmail("evelina.frami@yahoo.com");
        expectedTest.setSubject("Cyborg Boom Boom");
        expectedTest.setMessage("This sounds like something The One True Morty might say.");


    }

    @Given("yp Admin sends request and get response for test items")
    public void yp_admin_sends_request_and_get_response_for_test_items() {
        response=given() .spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when().get("/{1}/{2}/{3}/");

        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Given("yp Admin save all API information for test items")
    public void yp_admin_save_all_api_information_for_test_items() {
        saveTestDataMessage(expectedTest);
    }

    @Given("yp Admin verify API for test items")
    public void yp_admin_verify_api_for_test_items() throws JsonProcessingException {
        ObjectMapper object = new ObjectMapper();
        Messages actualData= object.readValue(response.asString(),Messages.class);

        Assert.assertEquals(expectedTest.getName(),actualData.getName());
        Assert.assertEquals(expectedTest.getEmail(),actualData.getEmail());
        Assert.assertEquals(expectedTest.getSubject(),actualData.getSubject());
        Assert.assertEquals(expectedTest.getMessage(),actualData.getMessage());
    }

    //Post
    @Given("yp Admin set path params for test item creation")
    public void yp_admin_set_path_params_for_test_item_creation() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","c-messages");
    }

    @Given("yp Admin enters expected data for test item creation")
    public void yp_admin_enters_expected_data_for_test_item_creation() {
/*
{
    "id": 236980,
    "name": "Rick Kleiner",
    "email": "evelina.frami@yahoo.com",
    "subject": "Cyborg Boom Boom",
    "message": "This sounds like something The One True Morty might say."
}
 */

        expectedTest.setName("Morty Raurer");
        expectedTest.setEmail("evelina.frami@yahoo.com");
        expectedTest.setSubject("Cyborg Boom Boom");
        expectedTest.setMessage("This sounds like something The One True Morty might say.");


    }

    @Given("yp Admin sends request and get response for test item creation")
    public void yp_admin_sends_request_and_get_response_for_test_item_creation() {
        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .body(expectedTest)
                .when()
                .post("/{1}/{2}");

    }

    @Given("yp Admin save all API information for test item creation")
    public void yp_admin_save_all_api_information_for_test_item_creation() {
        saveTestDataMessage(expectedTest);

    }

    @Given("yp Admin verify API for test item creation")
    public void yp_admin_verify_api_for_test_item_creation() throws JsonProcessingException {
        ObjectMapper object = new ObjectMapper();
        Messages actualData= object.readValue(response.asString(),Messages.class);

        Assert.assertEquals(expectedTest.getName(),actualData.getName());
        Assert.assertEquals(expectedTest.getEmail(),actualData.getEmail());
        Assert.assertEquals(expectedTest.getSubject(),actualData.getSubject());
        Assert.assertEquals(expectedTest.getMessage(),actualData.getMessage());

    }

}
