package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US024Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US024StepDef {

    US024Page us024Page = new US024Page();


    @Given("Hasta {string} adresine gider")
    public void hastaUrlAdresineGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @And("Hasta Giris simgesine tiklar")
    public void hastaGirisSimgesineTiklar() {

        us024Page.accountMenu.click();


    }

    @And("Hasta Sign in simgesine tiklar")
    public void hastaSignInSimgesineTiklar() {
        us024Page.signIn.click();


    }

    @And("Hasta Username alanina gecerli bir {string} girer")
    public void hastaUsernameAlaninaGecerliBirGirer(String username) {
        us024Page.username.sendKeys(username);
    }

    @And("Hasta Password alanina gecerli bir {string} girer")
    public void hastaPasswordAlaninaGecerliBirGirer(String password) {
        us024Page.password.sendKeys(password);
    }


    @And("Hasta Sign in butonuna tiklar")
    public void hastaSignInButonunaTiklar() {
        us024Page.signInButton.click();

    }

    @And("Hasta My Pages sekmesine tiklar")
    public void hastaMyPagesSekmesineTiklar() {
        us024Page.myPages.click();
    }

    @And("Hasta My Appointments sekmesine tiklar")
    public void hastaMyAppointmentsSekmesineTiklar() {
        us024Page.myAppointments.click();

        String date1 = "24";
        String date2 = "/11";
        String date3 = "/2022";
        us024Page.fromDate.sendKeys(date1);
        us024Page.fromDate.sendKeys(date2);
        us024Page.fromDate.sendKeys(date3);

        ReusableMethods.waitFor(1);

        String todate1 = "05";
        String todate2 = "/12";
        String todate3 = "/2022";
        us024Page.toDate.sendKeys(todate1);
        us024Page.toDate.sendKeys(todate2);
        us024Page.toDate.sendKeys(todate3);


    }

    @And("Hasta Show Tests butonuna tiklar")
    public void hastaShowTestsButonunaTiklar() {

        us024Page.showTests.click();
    }

    @And("Hasta View Results butonuna tiklar")
    public void hastaViewResultsButonunaTiklar() {
        us024Page.viewResults.click();
    }

    @Then("Hasta ID, Name,Default Min Value, Default Max Value, Test Date, Description bölümlerini görür")
    public void hastaIDNameDefaultMinValueDefaultMaxValueTestDateDescriptionBölümleriniGörür() {

        assertTrue(us024Page.testID.isDisplayed());
        assertTrue(us024Page.testName.isDisplayed());
        assertTrue(us024Page.maxvalue.isDisplayed());
        assertTrue(us024Page.minValue.isDisplayed());
        assertTrue(us024Page.descrption.isDisplayed());
        assertTrue(us024Page.dateTest.isDisplayed());


    }

    @And("Hasta Show Invoice butonuna tiklar")
    public void hastaShowInvoiceButonunaTiklar() {


        us024Page.showInvoice.click();
    }

    @And("Hasta faturasini görür")
    public void hastaFaturasiniGörür() {
        us024Page.invoiceDate.isDisplayed();
        ReusableMethods.waitFor(1);

    }


    @And("Hasta {int} saniye bekler")
    public void hastaSaniyeBekler(int saniye) {

        ReusableMethods.waitFor(saniye);
    }
}
