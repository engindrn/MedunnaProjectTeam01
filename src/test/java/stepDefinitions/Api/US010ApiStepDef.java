package stepDefinitions.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.us010_Pojos.*;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US010ApiStepDef {


    Response response;
    PatientUserPojo patientUserPojo;
    PatientPojo patientPojo;
    PhysicianUserPojo physicianUserPojo;
    PhysicianPojo physicianPojo;
    AppointmentPojo expectedData;
    AppointmentPojo actualData;



    @Then("Kullanici status kodunu dogrular")
    public void kullaniciStatusKodunuDogrular() {

        assertEquals(200, response.getStatusCode());


    }

    @Given("Kullanici Request gönderir Response alir")
    public void kullaniciRequestGönderirResponseAlir() {
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).
                when().get("https://medunna.com/api/appointments/330384");

        response.prettyPrint();

        patientUserPojo = new PatientUserPojo("anonymousUser", "2022-11-23T23:18:38.368374Z", 330523, "hastaalpcan", "Hasta", "Alpcan", "hastaalpcan@gmail.com", true, "en", null, null, "335-69-4154");
        patientPojo = new PatientPojo("hastaalpcan", "2022-11-23T23:24:17.253237Z", 329900, "Hasta", "Alpcan", null, "0146487454", null, null, null, "hastaalpcan@gmail.com", null, patientUserPojo, null, null, null);
        physicianUserPojo = new PhysicianUserPojo("anonymousUser", "2022-11-23T22:53:44.818801Z", 330652, "doktoralpcan", "Doktor", "Alpcan", "doktoralpcan@gmail.com", true, "en", null, null, "568-22-5696");
        physicianPojo = new PhysicianPojo("team01", "2022-11-23T23:07:14.598646Z", 330652, "Doktor", "Alpcan", "1990-01-31T23:00:00Z", "0659754554", "MALE", "Apositive", "istanbul", "", physicianUserPojo, "NEUROLOGY", null, null, 250.00, "", null);

        expectedData = new AppointmentPojo("hastaalpcan", "2022-11-23T23:24:17.253498Z", 330384, "2022-11-24T01:00:00Z", "2022-11-24T02:00:00Z", "PENDING", "", null, null, null, null, physicianPojo, patientPojo, null);
        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), AppointmentPojo.class);

    }


    @Then("Kullanici patient ID yi dogrular")
    public void kullaniciPatientIDYiDogrular() {

        System.out.println(actualData.getPatient().getId());
       assertEquals(patientPojo.getId(), actualData.getPatient().getId());


    }

    @Then("Kullanici start date i dogrular")
    public void kullaniciStartDateIDogrular() {
        System.out.println(actualData.getStartDate());
        assertEquals(expectedData.getStartDate(), actualData.getStartDate());
    }

    @Then("Kullanici end date i dogrular")
    public void kullaniciEndDateIDogrular() {
        System.out.println(actualData.getEndDate());
        assertEquals(expectedData.getEndDate(), actualData.getEndDate());
    }

    @Then("Kullanici  status bilgisini dogrular")
    public void kullaniciStatusBilgisiniDogrular() {
        System.out.println(actualData.getStatus());
        assertEquals(expectedData.getStatus(), actualData.getStatus());


    }
}
