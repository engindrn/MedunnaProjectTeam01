package stepDefinitions.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.Authentication;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US007ApiStepDef extends Authentication {

    Response response;

    @Given("USyedi kullanici url yi ayarlar")
    public void USyediKullaniciUrlYiAyarlar() {

     //   spec.pathParams("first","appointments","second", 345716);

    }

    @Then("USyedi kullanici icin ilgili endpointe request gonderir")
    public void USyediKullaniciIcinIlgiliEndpointeRequestGonderir() {
        response = given().header("Authorization","Bearer "+generateToken()).when().get("https://medunna.com/api/appointments/345716");
        response.prettyPrint();

    }

    @Then("USyedi status code {int} olmali")
    public void USyediStatusCodeOlmali(int statusCode) {
        assertEquals(statusCode,response.getStatusCode());
    }

    @Then("USyedi appointment icin id, {int} olmali")
    public void USyediAppointmentIcinIdOlmali(int id) {
        JsonPath jsonPath = response.jsonPath();
        assertEquals(id,jsonPath.getInt("id"));
    }


}
