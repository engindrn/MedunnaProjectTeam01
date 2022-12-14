package stepDefinitions.Api;


import baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Country;
import utilities.ConfigReader;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;


public class US028ApiStepDef extends MedunnaBaseUrl {

     /*
    "country": {
        "id": 0,
        "name": "string"
      },
     */

    static Response response;
    //RequestSpecification spec;
    Map<String,Object> expectedData;


    static Country country = new Country();


    @Given("yp Kullanici set the Base Url")
    public void yp_kullanici_set_the_base_url() {
        medunnaSetup();
        //spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","countries", "3", 216008);
    }

    @Given("yp Send the GET request and get the response")
    public void yp_send_the_get_request_and_get_the_response() {

        response = given().headers("Authorization", "Bearer " +generateToken(),
                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().
                get(ConfigReader.getProperty("country_endpoint"));

    }

    @Given("yp Set the expected data")
    public void yp_set_the_expected_data() {
        expectedData = new HashMap<>();
        expectedData.put("id",216008);
        expectedData.put("name","YeniDunya");
        expectedData.put("Status",200);

    }

    @Then("yp Make validation")
    public void yp_make_validation() {
        Map<String, String> actualData=response.as(HashMap.class);

        assertEquals(expectedData.get("id"),actualData.get("id"));
        assertEquals(expectedData.get("name"),actualData.get("name"));
        assertEquals(expectedData.get("Status"),response.getStatusCode());

    }
    /*
    {
    "id": 216008,
    "name": "YeniDunya"
}
     */

    @Given("Kullanici, ulke guncellemesi icin beklenen verileri girer")
    public void kullanici_ulke_guncellemesi_icin_beklenen_verileri_girer() {
        medunnaSetup();
        //spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","countries");


    }
    @Given("Kullanici, ulke guncellemesi icin istek gonderir ve yanit alir")
    public void kullanici_ulke_guncellemesi_icin_istek_gonderir_ve_yanit_alir() {
        expectedData = new HashMap<>();
        expectedData.put("id",216008);
        expectedData.put("name","EskiDunya16");
        //expectedData.put("Status",200);


    }
    @Given("Kullanici, ulke guncellemesi icin tum API bilgilerini kaydeder")
    public void kullanici_ulke_guncellemesi_icin_tum_api_bilgilerini_kaydeder() {
        response = given().spec(spec)
                .headers("Authorization", "Bearer " +generateToken(),
                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
                .body(expectedData)
                .when()
                .put("/{1}/{2}");

        try {
            response.then().statusCode(200);
        } catch (Exception e){
            kullanici_ulke_guncellemesi_icin_beklenen_verileri_girer();
            kullanici_ulke_guncellemesi_icin_istek_gonderir_ve_yanit_alir();
        }
        response.prettyPrint();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

    }
    @Then("Kullanici, ulke guncellemesi icin API kayitlarini dogrular")
    public void kullanici_ulke_guncellemesi_icin_api_kayitlarini_dogrular() {

        Map<String, String> actualData = response.as(HashMap.class);
        assertEquals(expectedData.get("name"), actualData.get("name"));


        /*
        {
    "id": 236455,
    "name": "Can",
    "country": {
        "id": 216008,
        "name": "EskiDunya16"
    }
}
         */

    }
    @Given("Kullanici Base Url i olusturur")
    public void kullaniciBaseUrlIOlusturur() {
        medunnaSetup();
        spec.pathParams("1","api","2","c-states");

    }
    @Given("Kullanici post istegini gonderir ve yanitini alir")
    public void kullanici_post_istegini_gonderir_ve_yanitini_alir() {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("id","216008");
        countryMap.put("name","EskiDunya16");
        expectedData = new HashMap<>();
        expectedData.put("name","Bursa");
        expectedData.put("country",countryMap);



        response = given().spec(spec)
                .headers("Authorization", "Bearer " +generateToken(),
                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
                .body(expectedData)
                .when()
                .post("/{1}/{2}");

        try {
            response.then().statusCode(201);
        } catch (Exception e){
            kullaniciBaseUrlIOlusturur();

        }
        response.prettyPrint();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

        System.out.println();

    }
    @Then("Kullanici APi kayitlarini dogrular")
    public void kullanici_a_pi_kayitlarini_dogrular() {
        Map<String, String> actualData = response.as(HashMap.class);

        Assert.assertEquals(expectedData.get("name"), actualData.get("name"));
        System.out.println(expectedData.get("name"));
        System.out.println(actualData.get("name"));

    }


}