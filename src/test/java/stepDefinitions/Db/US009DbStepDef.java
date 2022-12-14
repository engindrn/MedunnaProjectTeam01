package stepDefinitions.Db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;
import java.util.HashMap;
import java.util.Map;

public class US009DbStepDef {

    @Given("Personel09 Medunna database e baglanir")
    public void personel09_medunna_database_e_baglanir() {
        DatabaseUtility.createConnection();

    }

    @Then("Personel09 Database'den hasta bilgilerini alir ve dogrular")
    public void personel09_database_den_hasta_bilgilerini_alir_ve_dogrular() {

        //Actual Data
        Integer patientId = 328536;
        String query1 = "Select * from patient where id=307391";
        Map<String, Object> actualPatient = new HashMap<>(DatabaseUtility.getRowMap(query1));
        System.out.println("actualMap = " + actualPatient);

        System.out.println("+++++");

        // Expected Data
        Map<String,Object>expectedPatient=expectedData("Dadabase", "Hasta database testi","Central street  Nr:01","0112233445",
                3309,null,307391,"hasta", "hastadatabase@gmail.com");
        System.out.println("expectedPatient = " + expectedPatient);


        Assert.assertEquals(expectedPatient.get("last_name"), actualPatient.get("last_name"));
        Assert.assertEquals(expectedPatient.get("first_name"), actualPatient.get("first_name"));
        Assert.assertEquals(expectedPatient.get("email"), actualPatient.get("email"));
        Assert.assertEquals(expectedPatient.get("phone"), actualPatient.get("phone"));
        Assert.assertEquals(expectedPatient.get("adress"), actualPatient.get("adress"));



    }

    //Expected data methodu olustur

    public Map<String, Object> expectedData(String last_name,
                                            Object description,Object adress,
                                            String phone, Integer user_id,
                                            String blood_group, Integer id,  String first_name,
                                            String email) {
        Map<String, Object> expectedDataList = new HashMap<>();

        expectedDataList.put("last_name", last_name);
        expectedDataList.put("description", description);
        expectedDataList.put("adress", adress);
        expectedDataList.put("phone", phone);
        expectedDataList.put("user_id", user_id);
        expectedDataList.put("blood_group", blood_group);
        expectedDataList.put("id", id);
        expectedDataList.put("first_name", first_name);
        expectedDataList.put("email", email);

        return expectedDataList;


    }
}
