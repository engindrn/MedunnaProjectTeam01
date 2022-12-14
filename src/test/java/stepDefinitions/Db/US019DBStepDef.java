package stepDefinitions.Db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DatabaseUtility;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.getRowMap;

public class US019DBStepDef {


    Map<String, Object> actualMap;

    @Given("Kullanici19 connection kurar")
    public void kullaniciConnectionKurar() {

        DatabaseUtility.createConnection();


    }

    @When("Kullanici19 query olusturur")
    public void kullaniciQueryOlusturur() {

        String query = "select *from staff where id=362807";
        actualMap = getRowMap(query);


    }

    @Then("Kullanici19 staff bilgileri dogrular")
    public void kullaniciBilgileriDogrular() {
        String expectedStaffID = "362807";
        String expectedFirstName = "PersonelTeam01";
        String expectedLastName = "PersonelTeam01";
        String expectedBirtDate = "2022-11-30 23:00:00.0";
        String expectedPhone = "0123456798";
        String expectedGender = "MALE";
        String expectedDescription = "Pediatri";
        String expectedUserID = "302649";


        assertEquals(expectedStaffID, actualMap.get("id").toString());
        assertEquals(expectedFirstName, actualMap.get("first_name"));
        assertEquals(expectedLastName, actualMap.get("last_name"));
        assertEquals(expectedBirtDate, actualMap.get("birth_date").toString());
        assertEquals(expectedPhone, actualMap.get("phone").toString());
        assertEquals(expectedGender, actualMap.get("gender"));
        assertEquals(expectedDescription, actualMap.get("description"));
        assertEquals(expectedUserID, actualMap.get("user_id").toString());


    }
}
