package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US004Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US004StepDef {

    US004Page us004Page = new US004Page();

    @Given("Admin04 {string} adresine gider")
    public void adminAdresineGider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("Admin04 Giris simgesine tiklar")
    public void adminGirisSimgesineTiklar() {
        us004Page.accountMenu.click();

    }

    @And("Admin04 Sign in simgesine tiklar")
    public void adminSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }





    @And("Admin04 Sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Admin04 Basarili giris mesajini görür")
    public void adminBasariliGirisMesajiniGörür() {
        if (Driver.getDriver().getPageSource().contains("the success message ")){
            assertTrue(true);

        }else Assert.fail("the succes message yazisi görüntülenemedi");

    }

    @Given("Doktor04 {string} adresine gider")
    public void doktorAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @When("Doktor04 Giris simgesine tiklar")
    public void doktorGirisSimgesineTiklar() {
        us004Page.accountMenu.click();

    }

    @And("Doktor04 Sign in simgesine tiklar")
    public void doktorSignInSimgesineTiklar() {
        us004Page.signIn.click();

    }





    @And("Doktor04 Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Doktor04 Basarili giris mesajini görür")
    public void doktorBasariliGirisMesajiniGörür() {

        if (Driver.getDriver().getPageSource().contains("the success message ")){
            assertTrue(true);

        }else Assert.fail("the succes message yazisi görüntülenemedi");

    }

    @Given("Hasta04 {string} adresine gider")
    public void hastaAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @When("Hasta04 Giris simgesine tiklar")
    public void hastaGirisSimgesineTiklar() {
        us004Page.accountMenu.click();
    }

    @And("Hasta04 Sign in simgesine tiklar")
    public void hastaSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }





    @And("Hasta04 Sign in butonuna tiklar")
    public void hastaSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Hasta04 Basarili giris mesajini görür")
    public void hastaBasariliGirisMesajiniGörür() {
        if (Driver.getDriver().getPageSource().contains("the success message ")){
            assertTrue(true);

        }else Assert.fail("the succes message yazisi görüntülenemedi");

    }

    @Given("Personel04 {string} adresine gider")
    public void personelAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("Personel04 Giris simgesine tiklar")
    public void personelGirisSimgesineTiklar() {
        us004Page.accountMenu.click();
    }

    @And("Personel04 Sign in simgesine tiklar")
    public void personelSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }





    @And("Personel04 Sign in butonuna tiklar")
    public void personelSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Personel04 Basarili giris mesajini görür")
    public void personelBasariliGirisMesajiniGörür() {

        if (Driver.getDriver().getPageSource().contains("the success message ")){
            assertTrue(true);

        }else Assert.fail("the succes message yazisi görüntülenemedi");

    }

    @Given("Kullanici04 {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanici04 Giris simgesine tiklar")
    public void kullaniciGirisSimgesineTiklar() {
        us004Page.accountMenu.click();
    }

    @And("Kullanici04 Sign in simgesine tiklar")
    public void kullaniciSignInSimgesineTiklar() {
        us004Page.signIn.click();
    }

    @Then("Kullanici04 Remember me secenegini görür")
    public void kullaniciRememberMeSeceneginiGörür() {
        assertTrue(us004Page.rememberMe.isDisplayed());
    }

    @Then("Kullanici04 Did you forget your password? secenegini  görür")
    public void kullaniciDidYouForgetYourPasswordSeceneginiGörür() {
        assertTrue(us004Page.forgetPassword.isDisplayed());
    }

    @Then("Kullanici04 You don't have an account yet? Register a new account secenegini görür")
    public void kullaniciYouDonTHaveAnAccountYetRegisterANewAccountSeceneginiGörür() {
        assertTrue(us004Page.registerNewAccount.isDisplayed());
    }

    @Then("Kullanici04 Cancel seçeneğini görür")
    public void kullaniciCancelSeçeneğiniGörür() {
        assertTrue(us004Page.cancel.isDisplayed());

    }





    @And("Kullanici04 Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us004Page.signInButton.click();
    }

    @Then("Kullanici04 Authentication information not correct yazisini görür")
    public void kullaniciAuthenticationInformationNotCorrectYazisiniGörür() {
        String expectedData="Authentication information not correct.";
        String actualData = us004Page.authenticationNotCorrect.getText();
        assertEquals(actualData,expectedData);

    }






    @And("{int} sn bekler")
    public void snBekler(int süre) {
        ReusableMethods.waitFor(süre);

    }


    @And("Admin04 Username alanina gecerli bir {string} girer")
    public void adminUsernameAlaninaGecerliBirGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Admin04 Password alanina gecerli bir {string} girer")
    public void adminPasswordAlaninaGecerliBirGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Doktor04 Username alanina gecerli bir {string} girer")
    public void doktorUsernameAlaninaGecerliBirGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Doktor04 Password alanina gecerli bir {string} girer")
    public void doktorPasswordAlaninaGecerliBirGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Hasta04 Username alanina gecerli bir {string} girer")
    public void hastaUsernameAlaninaGecerliBirGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Hasta04 Password alanina gecerli bir {string} girer")
    public void hastaPasswordAlaninaGecerliBirGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Personel04 Username alanina gecerli bir {string} girer")
    public void personelUsernameAlaninaGecerliBirGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Personel04 Password alanina gecerli bir {string} girer")
    public void personelPasswordAlaninaGecerliBirGirer(String password) {
        us004Page.password.sendKeys(password);
    }

    @And("Kullanici04 Username alanina gecerli bir {string} girer")
    public void kullaniciUsernameAlaninaGecerliBirGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Kullanici04 Password alanina gecersiz bir {string} girer")
    public void kullaniciPasswordAlaninaGecersizBirGirer(String password) {
        us004Page.password.sendKeys(password);

    }

    @And("Kullanici04 Username alanina gecersiz bir {string} girer")
    public void kullaniciUsernameAlaninaGecersizBirGirer(String username) {
        us004Page.username.sendKeys(username);
    }

    @And("Kullanici04 Password alanina gecerli bir {string} girer")
    public void kullaniciPasswordAlaninaGecerliBirGirer(String password) {
        us004Page.password.sendKeys(password);
    }
}
