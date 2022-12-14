package stepDefinitions.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US009ApiStepDef {

    Response response;


    @Given("Kullanici09 Get request gonderir ve response ile hasta bilgilerini alir")
    public void kullanici09_get_request_gonderir_ve_response_ile_hasta_bilgilerini_alir() {

        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).
                when().get("https://medunna.com/api/patients/290799");

        response.prettyPrint();


    }
    @Given("Kullanici09 Status kodunun {int} oldugunu dogrular")
    public void kullanici09_status_kodunun_oldugunu_dogrular(Integer int1) {
        Assert.assertEquals(200,response.getStatusCode());


    }
    @Then("Kullanici09 hasta bilgilerini dogrular")
    public void kullanici09_hasta_bilgilerini_dogrular() {

        JsonPath json = response.jsonPath();
        Assert.assertEquals(290799,json.getInt("id"));
        Assert.assertEquals("Mustafa",json.getString("firstName"));
        Assert.assertEquals("Api",json.getString("lastName"));
        Assert.assertEquals("0176700800",json.getString("phone"));
        Assert.assertEquals("MALE",json.getString("gender"));
        Assert.assertEquals("jonathan",json.getString("user.login"));
        Assert.assertEquals("128-65-1234",json.getString("user.ssn"));
        Assert.assertEquals("Hasta Api Test",json.getString("description"));
        Assert.assertEquals("mustafaapi@gmail.com",json.getString("email"));


    }
}
