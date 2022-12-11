package stepDefinitions.Db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.DatabaseUtility;

import java.util.Map;

public class US016DbStepDef {

    Map<String, Object> odaBilgileri;

    @Given("Admin16 connection kurar")
    public void adminConnectionKurar() {

        DatabaseUtility.createConnection();

    }

    @Then("Admin16 kayitli oda bilgilerini databaseden ceker")
    public void adminKayitliOdaBilgileriniDatabasedenCeker() {

        String query = "select * from room where id=367109";
        odaBilgileri = DatabaseUtility.getRowMap(query);

    }

    @And("Admin16 oda bilgilerini dogrular")
    public void adminOdaBilgileriniDogrular() {

        String actualID = odaBilgileri.get("id").toString();
        String actualPrice = odaBilgileri.get("price").toString();
        String actualRoomnumber = odaBilgileri.get("room_number").toString();
        String actualRoomType = odaBilgileri.get("room_type").toString();
        String actualStatus = odaBilgileri.get("status").toString();
        String actualDescription = odaBilgileri.get("description").toString();
        String actualCreatedDate = odaBilgileri.get("created_date").toString();

        String expectedID = "367109";
        String expectedPrice = "444.00";
        String expectedRoomnumber = "20542054";
        String expectedRoomType = "TWIN";
        String expectedStatus = "false";
        String expectedDescription = "10 gun ";
        String expectedCreatedDate = "2022-12-03 13:54:24.550113";


        Assert.assertEquals(actualID, expectedID, "ID eslesmedi");
        Assert.assertEquals(actualPrice, expectedPrice, "Price eslesmedi");
        Assert.assertEquals(actualRoomnumber, expectedRoomnumber, "Room number eslesmedi");
        Assert.assertEquals(actualRoomType, expectedRoomType, "Room type eslesmedi");
        Assert.assertEquals(actualStatus, expectedStatus, "Status eslesmedi");
        Assert.assertEquals(actualDescription, expectedDescription, "Description eslesmedi");
        Assert.assertEquals(actualCreatedDate, expectedCreatedDate, "Create date eslesmedi");

        DatabaseUtility.closeConnection();

    }
}
