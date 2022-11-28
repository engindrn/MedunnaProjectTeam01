package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import pages.US005Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US005StepDef {

    US005Page us005Page = new US005Page();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Kullanici05 {string} ye gider")
    public void kullaniciYeGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("Randevu olusturmak icin Ana sayfadaki Make an Appointment butonuna tiklar")
    public void randevuOlusturmakIcinAnaSayfadakiMakeAnAppointmentButonunaTiklar() {
        us005Page.makeAnAppointmentButton.click();


    }


    @And("Kullanici05 kayitli {string} girer")
    public void kullaniciKayitliGirer(String ssn) {
        us005Page.ssn.sendKeys(ssn);


    }

    @And("Kullanici05 gecerli {string} adresi girer")
    public void kullaniciGecerliAdresiGirer(String email) {
        us005Page.email.sendKeys(email);
    }


    @And("Kullanici05 randevu tarihini secer")
    public void kullaniciRandevuTarihiniSecer() {
        us005Page.tarih.sendKeys("28.11.22022");

    }

    @And("Randevuyu gondermek icin Send an Appointment Request butonuna tiklar")
    public void randevuyuGondermekIcinSendAnAppointmentRequestButonunaTiklar() {
        us005Page.SendAnAppointmentRequestButton.click();

    }

    @Then("Kullanici05 ekranda Appointment registration saved mesajini gorür")
    public void kullaniciEkrandaAppointmentRegistrationSavedMesajiniGorür() {
        us005Page.AppointmentRegistrationSaved.isDisplayed();
    }

    @And("Kullanıcı05 üc ve altinci rakamdan sonra tire olan on rakamlı {string} girer")
    public void kullanıcıÜcVeAltinciRakamdanSonraTireOlanOnRakamlıGirer(String telefonNum) {
        us005Page.phoneNumber.sendKeys("123-456-7890");

    }

    @And("Kullanici05 First Name bölümünü bos birakir")
    public void kullaniciFirstNameBölümünüBosBirakir() {
        us005Page.firstName.sendKeys(" ");
    }

    @Then("Your FirstName is required yazisini görür")
    public void yourFirstNameIsRequiredYazisiniGörür() {
        assertTrue(us005Page.firstNameIsRequired.isDisplayed());
    }

    @And("Kullanici05 Last Name bölümünü  bos birakir")
    public void kullaniciLastNameBölümünüBosBirakir() {
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Your LastName is required yazisini görür")
    public void yourLastNameIsRequiredYazisiniGörür() {
        assertTrue(us005Page.lastNameIsRequired.isDisplayed());
    }

    @And("Kullanici05 SSN Numarasi bölümünü  bos birakir")
    public void kullaniciSSNNumarasiBölümünüBosBirakir() {
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Your SSN is required yazisini görür")
    public void yourSSNIsRequiredYazisiniGörür() {
        assertTrue(us005Page.ssnIsRequired.isDisplayed());
    }

    @And("Kullanici05 E-Mail bölümünü  bos birakir")
    public void kullaniciEMailBölümünüBosBirakir() {
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Your email is required yazisini görür")
    public void yourEmailIsRequiredYazisiniGörür() {
        assertTrue(us005Page.emailIsRequired.isDisplayed());
    }

    @And("Kullanici05 Telefon Numarasi  bölümünü  bos birakir")
    public void kullaniciTelefonNumarasiBölümünüBosBirakir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

    }

    @Then("Phone number is required yazisini görür")
    public void phoneNumberIsRequiredYazisiniGörür() {
        assertTrue(us005Page.phoneIsRequired.isDisplayed());
    }

    @Then("Kullanici05 ekranda Appointment registration saved mesajini göremez")
    public void kullaniciEkrandaAppointmentRegistrationSavedMesajiniGöremez() {


        boolean present;
        try {
            Driver.getDriver().findElement(By.cssSelector(".Toastify__toast-body"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }

        assertFalse("Appointment Registration Saved mesaji görüldü",present);
    }


    @When("Giris simgesine tiklar")
    public void girisSimgesineTiklar() {
        us005Page.accountMenu.click();


    }

    @And("Sign in simgesine tiklar")
    public void signInSimgesineTiklar() {
        us005Page.signIn.click();
    }

    @And("Username alanina gecerli bir {string} girer")
    public void usernameAlaninaGecerliBirGirer(String username) {
        us005Page.username.sendKeys(username);
    }

    @And("Password alanina gecerli bir {string} girer")
    public void passwordAlaninaGecerliBirGirer(String password) {
        us005Page.password.sendKeys(password);
    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        us005Page.signInButton.click();

    }

    @Then("Hasta oturum acildigini dogrular")
    public void hastaOturumAcildiginiDogrular() {
        String expectedData = "Hasta Team01";
        String actualData = us005Page.hastaAdiSoyadi.getText();
        System.out.println("hastaadisoyad" + actualData);
        assertEquals(expectedData, actualData);
    }

    @And("My Pages e tiklar")
    public void myPagesETiklar() {
        us005Page.myPages.click();


    }

    @And("My Appoitmente tiklar")
    public void myAppoitmenteTiklar() {
        us005Page.myAppointments.click();
    }


    @And("Kullainici05 olusturdugu randevulari görür")
    public void kullainiciOlusturduguRandevulariGörür() {
        assertTrue(us005Page.id.isDisplayed());
    }

    @And("Kullanici on haneli telefon numarasi girer")
    public void kullaniciOnHaneliTelefonNumarasiGirer() {
        us005Page.phoneNumber.sendKeys("1234567890");

    }

    @And("USbes {int} saniye bekler")
    public void saniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);

    }


    @And("Kullanici05 herhangi firstname {string} girer")
    public void kullaniciHerhangiFirstnameGirer(String firstname) {
        us005Page.firstName.sendKeys(firstname);
    }

    @And("Kullanici05 herhangi lastname {string} girer")
    public void kullaniciHerhangiLastnameGirer(String lastname) {
        us005Page.lastName.sendKeys(lastname);
    }

    @Then("Kullanici05 ekranda Appointment registration saved mesajini gorememeli")
    public void kullaniciEkrandaAppointmentRegistrationSavedMesajiniGorememeli() {

        assertFalse("Appointment registration saved mesaji görüldü",us005Page.AppointmentRegistrationSaved.isDisplayed());
    }
}
