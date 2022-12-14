/*
package stepDefinitions.Api;

import io.cucumber.java.en.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Physician;
import utilities.Authentication;


import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static utilities.Authentication2.generateToken;

public class US018ApiStepDef {

    Response response;
    Physician physicianApi=new Physician();

    @Given("Kullanici {string} id'li doktor verileri icin bir get request gonderir")
    public void kullanici_id_li_doktor_verileri_icin_bir_get_request_gonderir(String id) {
        String endpoint = "https://medunna.com/api/physicians/";
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/physicians/15014");
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

 */

