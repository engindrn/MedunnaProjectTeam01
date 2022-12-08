package stepDefinitions.Api;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.TestItemsPojo;

import utilities.ObjectMapperUtils;
import utilities.ReusableMethods;




import static io.restassured.RestAssured.given;

import static utilities.Authentication2.generateToken;
import static utilities.ObjectMapperUtils.convertJsonToJava;

public class US017ApiStepDef {
    /*
{      https://medunna.com/api/c-test-items/364073
    "createdBy": "team01",
    "createdDate": "2022-12-02T19:39:30.680270Z",
    "id": 364073,
    "name": "Glukoz",
    "description": "glukoz",
    "price": 50.00,
    "defaultValMin": "70",
    "defaultValMax": "110"
}
 */
    Response response;
    TestItemsPojo actualData;
    TestItemsPojo expectedData;

    @Given("MP Admin Medunna for get request the Test Item")
    public void mp_admin_medunna() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/c-test-items/364073");
        response.prettyPrint();
    }

    @When("MP User send Get request")
    public void mp_user_send_get_request() {

        response.prettyPrint();
    }

    @Then("MP Status code is {int}")
    public void mp_status_code_is(int statuscode) {
        response.then().statusCode(statuscode);


    }

    @Then("MP Verify expected data equals to actual data")
    public void verify_expected_data_equals_to_actual_data() {



        expectedData = new TestItemsPojo("Glukoz", "glukoz", 50.00, "70", "110");
        System.out.println("expectedData = " + expectedData);
        TestItemsPojo actualData = convertJsonToJava(response.asString(), TestItemsPojo.class);
        System.out.println(actualData);

        Assert.assertEquals(expectedData.getName(), actualData.getName());
        Assert.assertEquals(expectedData.getDescription(), actualData.getDescription());
        Assert.assertEquals(expectedData.getPrice(), actualData.getPrice());
        Assert.assertEquals(expectedData.getDefaultValMax(), actualData.getDefaultValMax());
        Assert.assertEquals(expectedData.getDefaultValMin(), actualData.getDefaultValMin());

    }

    @Given("Admin MP goes to Medunna for post request the Test Item")
    public void adminMPGoesToMedunnaForPostRequestTheTestItem() {
        String name= ReusableMethods.getFaker().name().firstName();
        expectedData= new TestItemsPojo(name,"Catch a cold", 500.00,"200", "500");
        response=  given().headers("Authorization", "Bearer " + generateToken()).body(expectedData).
                contentType(ContentType.JSON).when().post("https://medunna.com/api/c-test-items");
        System.out.println("expectedData = " + expectedData);
    }


    @When("Admin MP sends Post request")
    public void adminMPSendsPostRequest() {
        response.prettyPrint();
    }

    @Then("Admin MP Status code is {int} oldugunu dogrular")
    public void adminMPStatusCodeIsOldugunuDogrular(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @And("Admin MP Verify expected data equals to actual data")
    public void adminMPVerifyExpectedDataEqualsToActualData() {
        TestItemsPojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),TestItemsPojo.class);
        System.out.println(actualData);
        Assert.assertEquals(expectedData.getName(), actualData.getName());
        Assert.assertEquals(expectedData.getDescription(), actualData.getDescription());
        Assert.assertEquals(expectedData.getPrice(), actualData.getPrice());
        Assert.assertEquals(expectedData.getDefaultValMax(), actualData.getDefaultValMax());
        Assert.assertEquals(expectedData.getDefaultValMin(), actualData.getDefaultValMin());

    }
}