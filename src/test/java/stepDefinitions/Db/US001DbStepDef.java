package stepDefinitions.Db;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.createConnection;

public class US001DbStepDef {

    Object columnData;


    @Given("Kullanici connetion kurar")
    public void kullanici_connetion_kurar() throws SQLException {
        createConnection();
        DatabaseUtility.executeQuery("Select * from  jhi_user where first_name='team01'");

    }
    @When("Kullanici SSN bilgisini ceker")
    public void kullanici_ssn_bilgisini_ceker() throws SQLException {
        DatabaseUtility.getResultset().next();
        columnData = DatabaseUtility.getResultset().getObject("ssn");


    }
    @Then("Kullanici SSN bilgisiri dogrular")
    public void kullanici_ssn_bilgisiri_dogrular() {
        String actualData= (String) columnData;
        System.out.println(actualData.toString());
        String expectedData="197-70-1010";
        Assert.assertEquals(expectedData,actualData);
        DatabaseUtility.closeConnection();

    }



    @Then("Kullanici ssn dogrulamasini yapar")
    public void kullanici_ssn_dogrulamasini_yapar() throws SQLException {



        List<Object> expectedSSN = new ArrayList<>();
        expectedSSN.add("600-60-6001");


    }


}


