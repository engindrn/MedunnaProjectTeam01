package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US004Page;
import utilities.ConfigReader1;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US004StepDef {

    US004Page us004Page = new US004Page();

    @And("Kullanici04 Username alanina  {string} girer")
    public void kullaniciUsernameAlaninaGirer(String username) {
        us004Page.username.sendKeys(username);

    }

    @And("Kullanici04 Password alanina   {string} girer")
    public void kullaniciPasswordAlaninaGirer(String password) {
        us004Page.password.sendKeys(password);

    }

    @And("Kullanici04 SignIn butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us004Page.signInButton.click();

    }

    @Then("Kullanici04 Authentication information not correct yazisini  görür")
    public void kullaniciAuthenticationInformationNotCorrectYazisiniGörür() {
        String expectedData = "Authentication information not correct.";
        String actualData = us004Page.authenticationNotCorrect.getText();
        assertEquals("Authentication information not correct yazisi görülmedi",expectedData,actualData);
    }

    @And("Admin04 Username alanina  {string} girer")
    public void adminUsernameAlaninaGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Admin04 Password alanina   {string} girer")
    public void adminPasswordAlaninaGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Admin04 SignIn butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }


    @And("Doktor04 Username alanina  {string} girer")
    public void doktorUsernameAlaninaGirer(String username) {
        us004Page.password.sendKeys(username);
    }

    @And("Doktor04 Password alanina   {string} girer")
    public void doktorPasswordAlaninaGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Doktor04 SignIn butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }


    @And("Hasta04 Username alanina  {string} girer")
    public void hastaUsernameAlaninaGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Hasta04 Password alanina   {string} girer")
    public void hastaPasswordAlaninaGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Hasta04 SignIn butonuna tiklar")
    public void hastaSignInButonunaTiklar() {
        us004Page.signInButton.click();


    }


    @And("Personel04 Username alanina  {string} girer")
    public void personelUsernameAlaninaGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Personel04 Password alanina   {string} girer")
    public void personelPasswordAlaninaGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Personel04 SignIn butonuna tiklar")
    public void personelSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }


    @Given("Kullanici04 {string} adresine gider")
    public void kullaniciAdresineGider(String url) {

        Driver.getDriver().get(ConfigReader1.getProperty(url));
    }

    @When("Kullanici04 Giris simgesine tiklar")
    public void kullaniciGirisSimgesineTiklar() {
        us004Page.accountMenu.click();

    }

    @And("Kullanici04 Sign in simgesine tiklar")
    public void kullaniciSignInSimgesineTiklar() {
        us004Page.signIn.click();

    }

    @And("{int} sn bekler.")
    public void snBekler(int süre) {
        ReusableMethods.waitFor(süre);

    }

    @Then("Admin04 Basarili giris mesajini görür")
    public void adminBasariliGirisMesajiniGörür() {
        if (Driver.getDriver().getPageSource().contains("the success message ")) {
            assertTrue(true);

        } else Assert.fail("the succes message yazisi görüntülenemedi");

    }

    @Then("Doktor04 Basarili giris mesajini görür")
    public void doktorBasariliGirisMesajiniGörür() {
        if (Driver.getDriver().getPageSource().contains("the success message ")) {
            assertTrue(true);

        } else Assert.fail("the succes message yazisi görüntülenemedi");
    }

    @Then("Hasta04 Basarili giris mesajini görür")
    public void hastaBasariliGirisMesajiniGörür() {

        if (Driver.getDriver().getPageSource().contains("the success message ")) {
            assertTrue(true);

        } else Assert.fail("the succes message yazisi görüntülenemedi");
    }

    @Then("Personel04 Basarili giris mesajini görür")
    public void personelBasariliGirisMesajiniGörür() {
        if (Driver.getDriver().getPageSource().contains("the success message")) {
            assertTrue(true);

        } else Assert.fail("the succes message yazisi görüntülenemedi");
    }

    @Then("Kullanici04 Remember me secenegini görür")
    public void kullaniciRememberMeSeceneginiGörür() {
        ReusableMethods.waitForVisibility(us004Page.rememberMe,15);
        assertTrue(us004Page.rememberMe.isDisplayed());
    }

    @Then("Kullanici04 Did you forget your password? secenegini  görür")
    public void kullaniciDidYouForgetYourPasswordSeceneginiGörür() {
        ReusableMethods.waitForVisibility(us004Page.forgetPassword,15);
        assertTrue(us004Page.forgetPassword.isDisplayed());
    }

    @Then("Kullanici04 You don't have an account yet? Register a new account secenegini görür")
    public void kullaniciYouDonTHaveAnAccountYetRegisterANewAccountSeceneginiGörür() {
       ReusableMethods.waitForVisibility(us004Page.registerNewAccount,15);
        assertTrue(us004Page.registerNewAccount.isDisplayed());
    }

    @Then("Kullanici04 Cancel seçeneğini görür")
    public void kullaniciCancelSeçeneğiniGörür() {
        ReusableMethods.waitForVisibility(us004Page.cancel,15);
        assertTrue(us004Page.cancel.isDisplayed());
    }


    @Given("Kullanici04 sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {


        Driver.quitDriver();
    }
}
