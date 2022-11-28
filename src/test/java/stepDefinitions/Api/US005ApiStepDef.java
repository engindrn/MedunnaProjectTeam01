package stepDefinitions.Api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.us005_Pojos.*;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class US005ApiStepDef {
    Response response;


    @Given("Kullanici005 id numarali hastanin tum bilgilerini get request gonderir")
    public void kullaniciIdNumaraliHastaninTumBilgileriniGetRequestGonderir() {
        String token ="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXRjaDgxIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NzIwNjUxMTZ9.3lC4nabSE0pvb900v82-JiC2ua9Z-6Oz4HUhrnlIVJg9udqOCiS00-mYm_IBx8V7L2O0unhVl5MwJEsNVkP5OQ";
       // response=given().headers("Authorization","Bearer "+token).when().get("https://medunna.com/api/appointments/337001");
       // response.prettyPrint();

        response=given().contentType(ContentType.JSON).headers("Authorization","Bearer " + token).
                when().get("https://medunna.com/api/appointments/337001");

    }

    @Then("Kullanici005 status kodunu oldugunu dogrulamalidir")
    public void kullaniciStatusKoduOldugunuDogrulamalidir() {

        assertEquals(200,response.statusCode());
    }

    @And("Kullanici005 bilgilerin dogrulugunu kontrol eder")
    public void kullaniciBilgilerinDogrulugunuKontrolEder() {
        countryilk countryilk = new countryilk(1201,"Türkiye");
        cstatepojo cstatepojo = new cstatepojo(43520,"Istanbul",countryilk);
        country2 country2 = new country2(1201,"Türkiye");
        userpojo userpojo = new userpojo("anonymousUser","2022-11-15T21:20:58.397215Z",301530,"hastateam01","Hasta","Team01","hastateam01@gmail.com",true,"en",null,null,"500-10-5002");
        patientpojo patientpojo = new patientpojo("hastateam01","2022-11-16T11:05:14.475578Z",302408,"Hasta","Team01","2020-10-28T17:30:00Z","5555555555","MALE","ABpositive","Turkei","hastateam01@gmail.com","",userpojo,null,country2,cstatepojo);
        cretedpojo expectedData = new cretedpojo("hastateam01","2022-11-25T10:20:40.204531Z",337001,"2022-12-01T00:00:00Z","2022-12-01T01:00:00Z","UNAPPROVED",null,null,null,null,null,null,patientpojo,null);
        cretedpojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),cretedpojo.class);
        System.out.println(expectedData);

        System.out.println("actualData = " + actualData);


        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(),actualData.getCreatedDate());
        assertEquals(expectedData.getId(),actualData.getId());
        assertEquals(expectedData.getStartDate(),actualData.getStartDate());
        assertEquals(expectedData.getStatus(),actualData.getStatus());
        assertEquals(expectedData.getPhysician(),actualData.getPhysician());

    }
}
