package stepDefinitions.Api;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.junit.Assert;
import pojos.Physician;
import pojos.Registrant1;
import pojos.User;
import utilities.Authentication2;
import utilities.ConfigReader;
import utilities.JsonUtil;


import java.io.IOException;
import java.util.HashMap;


import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantApiData;


public class US001ApiStepDef {

    Registrant1 register = new Registrant1();
    Faker faker = new Faker();
    Response response;
    RequestSpecification spec;
    Physician physicianApi=new Physician();

    @When("Kullanici pathparams ayarlamasini yapar")
    public void kullanici_pathparams_ayarlamasini_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunna_url")).build();
        spec.pathParams("first", "api", "second", "user", "third", "ssn=600-60-6001");


    }

    @Then("Kullanici kayitlarin bilgilerini alir")
    public void kayitlarin_bilgilerini_alir() {

        response = given().spec(spec).contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + generateToken())
                .when()
                .get("/{first}/{second}/" + "?" + "{third}");
        System.out.println(response.asString());
    }

    @Then("Kullanici alinan bilgilerin dogrulamasini yapar")
    public void alinan_bilgilerin_dogrulamasini_yapar() {
        response.then().assertThat().statusCode(200);
        User expectedPojo = new User(302649, "personelteam01.", "PersonelTeam01", "PersonelTeam01", "600-60-6001", "personeteam0001@gmail.com",
                null, false, null, null, null, null, null, null);


        User actualPojo = JsonUtil.convertJsonToJavaObject(response.asString(), User.class);
        assertEquals(expectedPojo.getId(), actualPojo.getId());
        assertEquals(expectedPojo.getLogin(), actualPojo.getLogin());
        assertEquals(expectedPojo.getFirstName(), actualPojo.getFirstName());
        assertEquals(expectedPojo.getLastName(), actualPojo.getLastName());
        assertEquals(expectedPojo.getSsn(), actualPojo.getSsn());
        assertEquals(expectedPojo.getEmail(), actualPojo.getEmail());

    }


    @When("Kullanici gerekli path params ayarlar")
    public void kullanici_gerekli_path_params_ayarlar() {
       /* spec = new RequestSpecBuilder().setBaseUri(ConfigReader1.getProperty("medunna_url")).build();
        spec.pathParams("first", "api", "second", "register");

        */
    }

    @Then("Kullanici expected datalari girer")
    public void expected_datalari_girer() {


        register = new Registrant1(faker.name().firstName(), faker.name().lastName(), faker.idNumber().ssnValid(), faker.name().username(), "123", faker.internet().password(), faker.internet().emailAddress());


    }

    @Then("Kullanici request gonderir ve response alir")
    public void kullanici_request_gonderir_ve_response_alir() {

        response = given().body(register).contentType(ContentType.JSON).when()
                .post(ConfigReader.getProperty("medunnaRegister"));

    }

    @Then("Kullanici api kayitlarini dosyaya kaydeder")
    public void kullamici_api_kayitlarini_dosyaya_kaydeder() {
        saveRegistrantApiData(register);
    }

    @Then("Kullanici  api kayitlarini dogrular")
    public void kullanici_api_kayitlarini_dogrular() throws IOException {


        Registrant1 actual = response.as(Registrant1.class);
        System.out.println("actual:" + response.asString());

        assertEquals(201, response.getStatusCode());
        assertEquals(register.getFirstName(), actual.getFirstName());
        assertEquals(register.getLastName(), actual.getLastName());
        assertEquals(register.getLogin(), actual.getLogin());
        assertEquals(register.getEmail(), actual.getEmail());


    }



    @Given("Kullanici {string} id'li doktor verileri icin bir get request gonderir")
    public void kullanici_id_li_doktor_verileri_icin_bir_get_request_gonderir(String id) {
        String endpoint = "https://medunna.com/api/physicians/";
        response = given().headers("Authorization", "Bearer " + Authentication2.generateToken()).when().get("https://medunna.com/api/physicians/15014");
        response.prettyPrint();


    }

    @Given("Doktorun {string}, {string},{string},{string}, {string} Datalarina Sahip Oldugunu Dogrular.")
    public void doktorun_datalarina_sahip_oldugunu_dogrular(String firstName, String lastName, String ssn, String examFee, String speciality) {
        HashMap<String, Object> actualData = response.as(HashMap.class);
        System.out.println("actualData = " + actualData);


        Assert.assertEquals(physicianApi.getFirstname(), actualData.get(firstName));
        Assert.assertEquals(physicianApi.getLastname(), actualData.get(lastName));
        Assert.assertEquals(physicianApi.getExamfee(), actualData.get(examFee));
        Assert.assertEquals(physicianApi.getSpeciality(), actualData.get(speciality));
    }
}





