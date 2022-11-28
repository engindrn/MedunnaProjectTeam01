package stepDefinitions.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Patient;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US009ApiStepDef {

    Response response;

    Patient patient;
    @Given("Kullanici09 Get request gonderir ve response ile hasta bilgilerini alir")
    public void kullanici09_get_request_gonderir_ve_response_ile_hasta_bilgilerini_alir() {

        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).
                when().get("https://medunna.com/api/patients/16093");

        response.prettyPrint();

        //patient=new Patient("");

    }
    @Given("Kullanici09 Status kodunun {int} oldugunu dogrular")
    public void kullanici09_status_kodunun_oldugunu_dogrular(Integer int1) {


    }
    @Then("Kullanici09 hasta bilgilerini dogrular")
    public void kullanici09_hasta_bilgilerini_dogrular() {


    }
}
