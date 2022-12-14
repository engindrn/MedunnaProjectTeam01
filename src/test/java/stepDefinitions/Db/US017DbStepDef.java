package stepDefinitions.Db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import utilities.DatabaseUtility;

import java.util.Map;



public class US017DbStepDef {
    SoftAssert softAssert = new SoftAssert();
        Map<String,Object> testItemBilgileri;

    @Given("Admin17 connection kurar.")
    public void adminConnectionKurar() {
        DatabaseUtility.createConnection();
    }


    @And("Admin17 yeni kayitli test bilgilerini databaseden ceker.")
    public void adminYeniKayitliTestBilgileriniDatabasedenCeker() {
        String query ="select * from public.c_test_item where id=364073";
        testItemBilgileri=DatabaseUtility.getRowMap(query);
        System.out.println("testItemBilgileri = " + testItemBilgileri);
    }


    @Then("Admin17 test bilgilerini dogrular.")
    public void adminTestBilgileriniDogrular() {
                String expectedTestID ="364073";
        String expectedTestName="Glukoz";
        String expectedTestDescription = "glukoz";
        String expectedPrice ="50";
        String expectedDefaultValMin="70";
        String expectedDefaulValMax ="110";


                String actualTestID = testItemBilgileri.get("id").toString();
                System.out.println("actualTestID = " + actualTestID);


        String actualTestName= testItemBilgileri.get("name").toString();
        System.out.println("actualTestName = " + actualTestName);


        String actualTestDescription = testItemBilgileri.get("description").toString();
        System.out.println("actualTestDescription = " + actualTestDescription);

        String actualPrice= testItemBilgileri.get("price").toString();
        System.out.println("actualPrice = " + actualPrice);


        String actualDefaultValMin = testItemBilgileri.get("default_val_min").toString();
        System.out.println("actualDefaultValMin = " + actualDefaultValMin);

        String actualDefaultValMax = testItemBilgileri.get("default_val_max").toString();
        System.out.println("actualDefaultValMax = " + actualDefaultValMax);


        softAssert.assertEquals(actualTestID,expectedTestID,"id uyusmadi");
        softAssert.assertEquals(actualTestName,expectedTestName,"name uyusmadi");
        softAssert.assertEquals(actualTestDescription,expectedTestDescription,"description uyusmadi");
        softAssert.assertEquals(actualPrice,expectedPrice,"price uyusmadi");
        softAssert.assertEquals(expectedDefaultValMin,actualDefaultValMin,"minValue uyusmadi");
        softAssert.assertEquals(expectedDefaulValMax,actualDefaultValMax,"max value uyusmadi");


    }
            }






