package stepDefinitions.Ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.US003Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US003StepDef {


    US003Page page003=new US003Page();
    //  RegisterPage register=new RegisterPage();
    //  LoginPage logIn=new LoginPage();
    SoftAssert softAssert=new SoftAssert();

    @Given("YP Kullanici Medunna anasayfasina gider")
    public void eb_kullanici_medunna_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("YP Kullanici Account Menu bolumune tiklar")
    public void eb_kullanici_account_menu_bolumune_tiklar() {
        page003.loginPageMenuButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("YP Kullanici registration sekmesine tiklar")
    public void eb_kullanici_registration_sekmesine_tiklar() {
        page003.accountMenuRegisterButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici New Password kisminda yeni {string} girer")
    public void kullanici_new_password_kisminda_yeni_girer(String password) {
        page003.newPasswordSec.sendKeys(password);
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici parolanin gucunu dogrular {string}")
    public void kullanici_parolanin_gucunu_dogrular(String level) {
        if (2==Integer.parseInt(level)){
            softAssert.assertTrue(page003.passwordIkinciRenk.isDisplayed());
        } else if (4==Integer.parseInt(level)){
            softAssert.assertTrue(page003.passwordDorduncuRenk.isDisplayed());
        }else if (5==Integer.parseInt(level)){
            softAssert.assertTrue(page003.passwordBesinciRenk.isDisplayed());
        }
        softAssert.assertAll();
    }


    @Then("Kullanici parolanin gucunun degismedigini {string}")
    public void kullanici_parolanin_gucunun_degismedigini(String level) {
        if (1==Integer.parseInt(level)){
            Assert.assertTrue(page003.passwordIlkRenk.isDisplayed());
        }
    }


    @Then("YP Kullanici sayfayi kapatir")
    public void eb_kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("user goes to xxxxx")
    public void user_goes_to_xxxxx() {

    }

}
