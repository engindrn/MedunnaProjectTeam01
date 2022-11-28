package stepDefinitions.Db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import utilities.DatabaseUtility;

import java.util.Map;

public class US005DbStepDef {

   SoftAssert softAssert = new SoftAssert();
    Map<String, Object> randevuBilgileri;


    @Given("Kullanici05 connection kurar")
    public void kullaniciConnectionKurar() {
        DatabaseUtility.createConnection();


    }

    @And("Kullanici05 yeni kayitli randevu bilgilerini database den ceker")
    public void kullaniciYeniKayitliRandevuBilgileriniDatabaseDenCeker() {

        String query = "select * from appointment where id=337001";
        randevuBilgileri = DatabaseUtility.getRowMap(query);
        System.out.println("Randevu bilgileri" + randevuBilgileri);

}


    @Then("Kullanici05 randevu bilgilerini dogrular")
    public void kullaniciRandevuBilgileriniDogrular() {

        String actualID = randevuBilgileri.get("id").toString();
        System.out.println("actualID = " + actualID);
        String actualName = randevuBilgileri.get("created_by").toString();
        System.out.println("actualName = " + actualName);
        String actualStart_date = randevuBilgileri.get("start_date").toString();
        System.out.println("actualStart_date = " + actualStart_date);
        String actualStatus = randevuBilgileri.get("status").toString();
        System.out.println("actualStatus = " + actualStatus);


        String expectedID = "337001";
        String expectedName = "hastateam01";
        String expectedStartDate = "2022-12-01 00:00:00.0";
        String expectedStatus = "UNAPPROVED";

        softAssert.assertEquals(actualName, expectedName, "Name uyusmadi");
        softAssert.assertEquals(actualStart_date, expectedStartDate, "Star Date uyusmadi");
        softAssert.assertEquals(actualID, expectedID, "Id uyusmadi");
        softAssert.assertEquals(actualStatus, expectedStatus, "Status uyusmadi");

        softAssert.assertAll();


    }
}
