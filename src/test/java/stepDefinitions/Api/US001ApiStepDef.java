package stepDefinitions.Api;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import pojos.Registrant1;
import pojos.User;
import utilities.ConfigReader1;
import utilities.JsonUtil;


import java.io.IOException;


import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static utilities.Authentication1.generateToken;
import static utilities.WriteToTxt.saveRegistrantApiData;


public class US001ApiStepDef {

    Registrant1 register = new Registrant1();
    Faker faker = new Faker();
    Response response;
    RequestSpecification spec;

    @When("Kullanici pathparams ayarlamasini yapar")
    public void kullanici_pathparams_ayarlamasini_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader1.getProperty("medunna_url")).build();
        spec.pathParams("first", "api", "second", "user", "third","ssn=600-60-6001" );


    }

    @Then("Kullanici kayitlarin bilgilerini alir")
    public void kayitlarin_bilgilerini_alir() {

        response = given().spec(spec).contentType(ContentType.JSON)
                .header("Authorization","Bearer "+generateToken())
                .when()
                .get("/{first}/{second}/"+"?"+"{third}");
        System.out.println(response.asString());
    }

    @Then("Kullanici alinan bilgilerin dogrulamasini yapar")
    public void alinan_bilgilerin_dogrulamasini_yapar() {
        response.then().assertThat().statusCode(200);
        User expectedPojo= new User(302649,"personelteam01.","PersonelTeam01","PersonelTeam01","600-60-6001","personeteam0001@gmail.com",
                null,false,null,null,null,null,null,null);


        User actualPojo = JsonUtil.convertJsonToJavaObject(response.asString(), User.class);
        assertEquals(expectedPojo.getId(),actualPojo.getId());
        assertEquals(expectedPojo.getLogin(),actualPojo.getLogin());
        assertEquals(expectedPojo.getFirstName(),actualPojo.getFirstName());
        assertEquals(expectedPojo.getLastName(),actualPojo.getLastName());
        assertEquals(expectedPojo.getSsn(),actualPojo.getSsn());
        assertEquals(expectedPojo.getEmail(),actualPojo.getEmail());

    }


    @When("Kullanici gerekli path params ayarlar")
    public void kullanici_gerekli_path_params_ayarlar() {
       /* spec = new RequestSpecBuilder().setBaseUri(ConfigReader1.getProperty("medunna_url")).build();
        spec.pathParams("first", "api", "second", "register");

        */
    }

    @Then("Kullanici expected datalari girer")
    public void expected_datalari_girer() {


        register = new Registrant1(faker.name().firstName(),faker.name().lastName(),faker.idNumber().ssnValid(),faker.name().username(),"123",faker.internet().password(), faker.internet().emailAddress());


    }

    @Then("Kullanici request gonderir ve response alir")
    public void kullanici_request_gonderir_ve_response_alir() {

        response = given().body(register).contentType(ContentType.JSON).when()
                .post(ConfigReader1.getProperty("medunnaRegister"));

    }

    @Then("Kullanici api kayitlarini dosyaya kaydeder")
    public void kullamici_api_kayitlarini_dosyaya_kaydeder() {
        saveRegistrantApiData(register);
    }

    @Then("Kullanici  api kayitlarini dogrular")
    public void kullanici_api_kayitlarini_dogrular() throws IOException {


        Registrant1 actual = response.as(Registrant1.class);
        System.out.println("actual:"+response.asString());

        assertEquals(201, response.getStatusCode());
        assertEquals(register.getFirstName(), actual.getFirstName());
        assertEquals(register.getLastName(), actual.getLastName());
        assertEquals(register.getLogin(), actual.getLogin());
        assertEquals(register.getEmail(), actual.getEmail());


    }




}
