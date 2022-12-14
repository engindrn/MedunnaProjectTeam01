package stepDefinitions.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US019API.CountryPojo;
import pojos.US019API.StaffPojo;
import pojos.US019API.UserPojo;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US019ApiStepDef {
    Response response;

    @Given("Kullanici19 Request gönderir Response alir")
    public void kullaniciRequestGönderirResponseAlir() {

        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).
                when().get("https://medunna.com/api/staff/362807");

       // response.prettyPrint();


    }

    @Then("Kullanici19 status kodunun 200 oldugunu dogrular")
    public void kullaniciStatusKodununDogrular() {

        assertEquals(200, response.getStatusCode());


    }


    @Then("Kullanici19 staff in  bilgilerini dogrular")
    public void kullaniciStaffInTümBilgileriDogrular() {

        UserPojo userPojo = new UserPojo("anonymousUser", "2022-11-16T13:09:23.275248Z", 302649, "personelteam01.", "PersonelTeam01", "PersonelTeam01", "personeteam0001@gmail.com", true, "en", null, null, "600-60-6001");
        CountryPojo countryPojo = new CountryPojo(43952, "Germany");

        StaffPojo expectedData = new StaffPojo("team01", "2022-12-01T20:40:26.342041Z", 362807, "PersonelTeam01", "PersonelTeam01", "2022-11-30T23:00:00Z", "0123456798", "MALE", "Apositive", "2247 Ed Turnpike, Andresberg, MD 25421-0885", "Pediatri", userPojo, countryPojo, null);
        StaffPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), StaffPojo.class);


        assertEquals(expectedData.getCreatedBy(), actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(), actualData.getCreatedDate());
        assertEquals(expectedData.getId(), actualData.getId());
        assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        assertEquals(expectedData.getLastName(), actualData.getLastName());

        assertEquals(expectedData.getBirthDate(), actualData.getBirthDate());
        assertEquals(expectedData.getPhone(), actualData.getPhone());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getBloodGroup(), actualData.getBloodGroup());
        assertEquals(expectedData.getAdress(), actualData.getAdress());
        assertEquals(expectedData.getDescription(), actualData.getDescription());

        assertEquals(userPojo.getCreatedBy(), actualData.getUser().getCreatedBy());
        assertEquals(userPojo.getCreatedDate(), actualData.getUser().getCreatedDate());
        assertEquals(userPojo.getId(), actualData.getUser().getId());
        assertEquals(userPojo.getLogin(), actualData.getUser().getLogin());
        assertEquals(userPojo.getFirstName(), actualData.getUser().getFirstName());
        assertEquals(userPojo.getLastName(), actualData.getUser().getLastName());
        assertEquals(userPojo.getEmail(), actualData.getUser().getEmail());
        assertEquals(userPojo.isActivated(), actualData.getUser().isActivated());
        assertEquals(userPojo.getLangKey(), actualData.getUser().getLangKey());
        assertEquals(userPojo.getImageUrl(), actualData.getUser().getImageUrl());
        assertEquals(userPojo.getResetDate(), actualData.getUser().getResetDate());
        assertEquals(userPojo.getSsn(), actualData.getUser().getSsn());

        assertEquals(countryPojo.getId(), actualData.getCountry().getId());
        assertEquals(countryPojo.getName(), actualData.getCountry().getName());

        assertEquals(expectedData.getCstate(), actualData.getCstate());


    }
}
