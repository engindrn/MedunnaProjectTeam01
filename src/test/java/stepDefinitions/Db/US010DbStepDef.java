package stepDefinitions.Db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class US010DbStepDef {


    Map<String, Object> randevuBilgileri;


    @Given("Kullanici connection kurar")
    public void kullaniciConnectionKurar() {
        DatabaseUtility.createConnection();


    }

    @And("Kullanici  query olusturur")
    public void kullaniciQueryOlusturur() {
        String query = "select * from appointment where id=330384";
        randevuBilgileri = DatabaseUtility.getRowMap(query);


    }

    @Then("Kullanici  patient ID yi dogrular")
    public void kullaniciPatientIDYiDogrular() {
        String expectedPatientID = "329900";
        String actualPatientID = randevuBilgileri.get("patient_id").toString();
        assertEquals(expectedPatientID, actualPatientID);

    }

    @Then("Kullanici  start date i dogrular")
    public void kullaniciStartDateIDogrular() {
        String expectedStartDate = "2022-11-24 01:00:00.0";
        String actualStart_date = randevuBilgileri.get("start_date").toString();
        assertEquals(expectedStartDate,actualStart_date);

    }

    @Then("Kullanici  end date i dogrular")
    public void kullaniciEndDateIDogrular() {
        String expectedEndDate = "2022-11-24 02:00:00.0";
        String actualEnd_date = randevuBilgileri.get("end_date").toString();
        assertEquals(expectedEndDate,actualEnd_date);
    }

    @Then("Kullanici   status bilgisini dogrular")
    public void kullaniciStatusBilgisiniDogrular() {
        String expectedStatus = "PENDING";
        String actualStatus = randevuBilgileri.get("status").toString();
        assertEquals(expectedStatus,actualStatus);
    }
}


