package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.US010Page;
import utilities.ConfigReader1;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US010StepDef {

    US010Page us010Page=new US010Page();


    @Given("Doktor10 {string} adresine gider")
    public void doktorAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader1.getProperty(url));

    }



    @When("Doktor10 Giris simgesine tiklar")
    public void doktorGirisSimgesineTiklar() {
        us010Page.accountMenu.click();

    }

    @And("Doktor10 Sign in simgesine tiklar")
    public void doktorSignInSimgesineTiklar() {
        us010Page.signIn.click();
    }

    @And("Doktor10 Username alanina gecerli bir {string} girer")
    public void doktorUsernameAlaninaGecerliBirGirer( String username) {
        us010Page.username.sendKeys(username);


    }

    @And("Doktor10 Password alanina gecerli bir {string} girer")
    public void doktorPasswordAlaninaGecerliBirGirer( String password) {
        us010Page.password.sendKeys(password);

    }

    @And("Doktor10 Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        us010Page.signInButton.click();


    }

    @And("Doktor10 My Pages sekmesine tiklar")
    public void doktorMyPagesSekmesineTiklar() {
        us010Page.myPages.click();

    }

    @And("Doktor10 My Appointments sekmesine tiklar")
    public void doktorMyAppointmentsSekmesineTiklar() {
        us010Page.myAppointments.click();
    }

    @And("Doktor10, randevu listesini ve zaman dilimlerini görür")
    public void doktorRandevuListesiniVeZamanDilimleriniGörür() throws IOException {


        assertTrue(us010Page.listTable.isDisplayed());
        ReusableMethods.getScreenshot("Randevu Listesi");
        assertTrue(us010Page.fromDate.isDisplayed());
        assertTrue(us010Page.toDate.isDisplayed());
    }


    @And("Doktor10 patient id, start date, end date, status bilgilerini görür")
    public void doktorPatientIdStartDateEndDateStatusBilgileriniGörür() {


        assertTrue(us010Page.id.isDisplayed());
        assertTrue(us010Page.startdate.isDisplayed());
        assertTrue(us010Page.enddate.isDisplayed());
        assertTrue(us010Page.status.isDisplayed());

    }


}
