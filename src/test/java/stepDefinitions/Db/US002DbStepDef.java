package stepDefinitions.Db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.sql.SQLException;

import static utilities.DatabaseUtility.createConnection;

public class US002DbStepDef {

    @When("DB ile tablodan gerekli sutunu alir")
    public void dbIleTablodanGerekliSutunuAlir() {
        createConnection();
        DatabaseUtility.executeQuery("Select * from jhi_user where first_name = 'team01'");
    }


    @Then("DB ile email dogrulamasini yapar")
    public void dbIleEmailDogrulamasiniYapar() throws SQLException {
        DatabaseUtility.getResultset().next();
        Object columnData = DatabaseUtility.getResultset().getObject("email");
        String actualData= (String) columnData;

        String expectedData="mihricanpurbudak5@gmail.com";
        Assert.assertEquals(expectedData,actualData);
        DatabaseUtility.closeConnection();
    }

}
