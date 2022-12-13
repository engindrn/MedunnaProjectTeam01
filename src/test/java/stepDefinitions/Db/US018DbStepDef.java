package stepDefinitions.Db;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class US018DbStepDef {
    static String query;
    static String fileList;
    @Given("Kullanici database baglanir")
    public void kullanici_database_baglanir() {
        DatabaseUtility.createConnection();


    }
    @When("Kullanici databese query gonderir ve gerekli columnu alir")
    public void kullanici_databese_query_gonderir_ve_gerekli_columnu_alir() {
        query = "select * from physician";
        DatabaseUtility.executeQuery(query);

    }
    @When("Kullanici doktorun bilgilerini dogrular")
    public void kullanici_doktorun_bilgilerini_dogrular() {

        String query = "select * from physician";
        System.out.println(DatabaseUtility.getColumnNames(query)  + "\n");

        System.out.println("==ID LIST==");
        List<Object> idList = getColumnData(query, "id");
        System.out.println(idList + "\n");
        String fileName = "src/test/resources/Test Data/Physician.txt";
        WriteToTxt.savePhysician(fileName, idList);

        List<Object> actualPhysicianIDs = ReadTxt.returnPhysicianIDsList(fileName);
        List<Object> expectedPhysicianIDs = new ArrayList<>();
        expectedPhysicianIDs.add(362070);


        Assert.assertTrue("IDLER UYUSMUYOR", actualPhysicianIDs.containsAll(expectedPhysicianIDs));

    }
    @Then("Kullanici database baglantisini kapatir")
    public void kullanici_database_baglantisini_kapatir() {
        DatabaseUtility.closeConnection();

    }

}
