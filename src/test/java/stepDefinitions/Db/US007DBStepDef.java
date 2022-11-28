package stepDefinitions.Db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class US007DBStepDef {

    Map<String, Object> randevuBilgileri;

    @Given("USYEDI Kullanici Database baglanir")
    public void kullaniciDatabaseBaglanir() {
        DatabaseUtility.createConnection();

    }

    @And("USYEDI Kullanici randavu bilgilerini ceker")
        public void kullaniciRandavuBilgileriniCeker() {

        String quary="select * from appointment where id=345716";
        randevuBilgileri=DatabaseUtility.getRowMap(quary);
        System.out.println("randevu bilgileri :"+randevuBilgileri);



    }

    @Then("USYEDI Kullanici randevu bilgilerini dogrular")
    public void kullaniciRandevuBilgileriniDogrular() {
        String actualId=randevuBilgileri.get("id").toString();      //bu sekilde diger bilgilerde alinabilir
        System.out.println("actualId = " + actualId);  //345716

        String expectedID= "345716";

        assertEquals(expectedID, actualId);

     

    }
}
