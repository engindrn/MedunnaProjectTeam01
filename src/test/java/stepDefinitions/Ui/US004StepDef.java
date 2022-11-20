package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US004Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US004StepDef {

    US004Page us004Page = new US004Page();

    @Given("Admin {string} adresine gider")
    public void adminAdresineGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("Admin Giris simgesine tiklar")
    public void adminGirisSimgesineTiklar() {
        us004Page.accountMenu.click();

    }

    @And("Admin Sign in simgesine tiklar")
    public void adminSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }

    @And("Admin Username alanina gecerli bir username girer")
    public void adminUsernameAlaninaGecerliBirUsernameGirer() {
        us004Page.username.sendKeys(ConfigReader.getProperty("adminUsername4"));
    }

    @And("Admin Password alanina gecerli bir password girer")
    public void adminPasswordAlaninaGecerliBirPasswordGirer() {
        us004Page.password.sendKeys(ConfigReader.getProperty("adminPassword4"));
    }

    @And("Admin Sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Admin Basarili giris mesajini görür")
    public void adminBasariliGirisMesajiniGörür() {
        assertTrue(Driver.getDriver().getPageSource().contains("success message to login"));

    }

    @Given("Doktor {string} adresine gider")
    public void doktorAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @When("Doktor Giris simgesine tiklar")
    public void doktorGirisSimgesineTiklar() {
        us004Page.accountMenu.click();

    }

    @And("Doktor Sign in simgesine tiklar")
    public void doktorSignInSimgesineTiklar() {
        us004Page.signIn.click();

    }

    @And("Doktor Username alanina gecerli bir username girer")
    public void doktorUsernameAlaninaGecerliBirUsernameGirer() {
        us004Page.username.sendKeys(ConfigReader.getProperty("doktorUsername4"));
    }

    @And("Doktor Password alanina gecerli bir password girer")
    public void doktorPasswordAlaninaGecerliBirPasswordGirer() {
        us004Page.password.sendKeys(ConfigReader.getProperty("doktorPassword4"));
    }

    @And("Doktor Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Doktor Basarili giris mesajini görür")
    public void doktorBasariliGirisMesajiniGörür() {
        assertTrue(Driver.getDriver().getPageSource().contains("success message to login"));

    }

    @Given("Hasta {string} adresine gider")
    public void hastaAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @When("Hasta Giris simgesine tiklar")
    public void hastaGirisSimgesineTiklar() {
        us004Page.accountMenu.click();
    }

    @And("Hasta Sign in simgesine tiklar")
    public void hastaSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }

    @And("Hasta Username alanina gecerli bir username girer")
    public void hastaUsernameAlaninaGecerliBirUsernameGirer() {
        us004Page.username.sendKeys(ConfigReader.getProperty("hastaUsername4"));
    }

    @And("Hasta Password alanina gecerli bir password girer")
    public void hastaPasswordAlaninaGecerliBirPasswordGirer() {
        us004Page.password.sendKeys(ConfigReader.getProperty("hastaPassword4"));
    }

    @And("Hasta Sign in butonuna tiklar")
    public void hastaSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Hasta Basarili giris mesajini görür")
    public void hastaBasariliGirisMesajiniGörür() {
        assertTrue(Driver.getDriver().getPageSource().contains("success message to login"));

    }

    @Given("Personel {string} adresine gider")
    public void personelAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("Personel Giris simgesine tiklar")
    public void personelGirisSimgesineTiklar() {
        us004Page.accountMenu.click();
    }

    @And("Personel Sign in simgesine tiklar")
    public void personelSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }

    @And("Personel Username alanina gecerli bir username girer")
    public void personelUsernameAlaninaGecerliBirUsernameGirer() {
        us004Page.username.sendKeys(ConfigReader.getProperty("personelUsername4"));
    }

    @And("Personel Password alanina gecerli bir password girer")
    public void personelPasswordAlaninaGecerliBirPasswordGirer() {
        us004Page.password.sendKeys(ConfigReader.getProperty("personelPassword4"));
    }

    @And("Personel Sign in butonuna tiklar")
    public void personelSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Personel Basarili giris mesajini görür")
    public void personelBasariliGirisMesajiniGörür() {
        assertTrue(Driver.getDriver().getPageSource().contains("success message to login"));

    }

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanici Giris simgesine tiklar")
    public void kullaniciGirisSimgesineTiklar() {
        us004Page.accountMenu.click();
    }

    @And("Kullanici Sign in simgesine tiklar")
    public void kullaniciSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }

    @Then("Kullanici Remember me secenegini görür")
    public void kullaniciRememberMeSeceneginiGörür() {
        assertTrue(us004Page.rememberMe.isDisplayed());
    }

    @Then("Kullanici Did you forget your password? secenegini  görür")
    public void kullaniciDidYouForgetYourPasswordSeceneginiGörür() {
        assertTrue(us004Page.forgetPassword.isDisplayed());
    }

    @Then("Kullanici You don't have an account yet? Register a new account secenegini görür")
    public void kullaniciYouDonTHaveAnAccountYetRegisterANewAccountSeceneginiGörür() {
        assertTrue(us004Page.registerNewAccount.isDisplayed());
    }

    @Then("Kullanici Cancel seçeneğini görür")
    public void kullaniciCancelSeçeneğiniGörür() {
        assertTrue(us004Page.cancel.isDisplayed());

    }

    @And("Kullanici Username alanina gecerli bir username girer")
    public void kullaniciUsernameAlaninaGecerliBirUsernameGirer() {
        us004Page.username.sendKeys(ConfigReader.getProperty("gecerliUsername4"));


    }

    @And("Kullanici Password alanina gecersiz bir password girer")
    public void kullaniciPasswordAlaninaGecersizBirPasswordGirer() {
        us004Page.password.sendKeys(ConfigReader.getProperty("gecersizPassword4"));
    }

    @And("Kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Kullanici Authentication information not correct yazisini görür")
    public void kullaniciAuthenticationInformationNotCorrectYazisiniGörür() {
        String expectedData="Authentication information not correct.";
        String actualData = us004Page.authenticationNotCorrect.getText();
        assertEquals(actualData,expectedData);

    }

    @And("Kullanici Username alanina gecersiz bir username girer")
    public void kullaniciUsernameAlaninaGecersizBirUsernameGirer() {
        us004Page.username.sendKeys(ConfigReader.getProperty("gecersizUsername4"));

    }

    @And("Kullanici Password alanina gecerli bir password girer")
    public void kullaniciPasswordAlaninaGecerliBirPasswordGirer() {
        us004Page.password.sendKeys(ConfigReader.getProperty("gecerliPassword4"));

    }


    @And("{int} sn bekler")
    public void snBekler(int süre) {
        ReusableMethods.waitFor(süre);

    }



}
