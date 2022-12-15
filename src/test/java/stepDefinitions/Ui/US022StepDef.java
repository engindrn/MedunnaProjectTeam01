package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US022Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US022StepDef {

    US022Page us022Page = new US022Page();


    @Given("Personel022 url adresine gider")
    public void personel022_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl022"));

    }

    @And("Personel022 Giris simgesine tiklar")
    public void personel022_giris_simgesine_tiklar() {
        us022Page.girisSimgesi.click();

    }

    @And("Personel022 Sign in simgesine tiklar")
    public void personel022_sign_in_simgesine_tiklar() {
        us022Page.signIn.click();

    }

    @And("Personel022 Username alanina gecerli bir username girer")
    public void personel022_username_alanina_gecerli_bir_username_girer() {
        us022Page.username.sendKeys(ConfigReader.getProperty("personelUserName022"));

    }

    @And("Personel022 Password alanina gecerli bir password girer")
    public void personel022_password_alanina_gecerli_bir_password_girer() {
        us022Page.password.sendKeys(ConfigReader.getProperty("personelPassword022"));

    }

    @And("Personel022 Sign in butonuna tiklar")
    public void personel022_sign_in_butonuna_tiklar() {
        us022Page.signInButton.click();

    }

    @And("Personel022 My Pages butonunu tiklar")
    public void personel022_my_pages_butonunu_tiklar() {
        us022Page.myPages.click();

    }

    @And("Personel022 Patient butonuna tiklar")
    public void personel022_patient_butonuna_tiklar() {
        us022Page.searchPatient.click();

    }

    @Then("Personel022 acilan sayfada search kutusuna aranacak hasta SSN id numarasini girer")
    public void personel022_acilan_sayfada_search_kutusuna_aranacak_hasta_ssn_ıd_numarasini_girer() {
        us022Page.ssnBox.sendKeys(ConfigReader.getProperty("ssnHastaNo"));

    }

    @Given("Personel022 Aranan SSN id numarali hastanin bilgilerinin goruldugunu dogrular")
    public void personel022_aranan_ssn_ıd_numarali_hastanin_bilgilerinin_goruldugunu_dogrular() {
        Assert.assertTrue(us022Page.viewFirstName.isDisplayed());
        Assert.assertTrue(us022Page.viewLastName.isDisplayed());
        Assert.assertTrue(us022Page.viewEmail.isDisplayed());
        Assert.assertTrue(us022Page.viewUser.isDisplayed());


    }

    @Given("Personel022 Girilen SSN numarali hastada Show Appointment butonuna tiklar")
    public void personel022_girilen_ssn_numarali_hastada_show_appointment_butonuna_tiklar() {
        us022Page.showAppointments.click();

    }

    @And("Personel022 Show Tests butonuna tiklar")
    public void personel022_show_tests_butonuna_tiklar() {
        us022Page.showTests.click();

    }

    @And("Personel022 View Results butonuna tiklar")
    public void personel022_view_results_butonuna_tiklar() {
        us022Page.viewResults.click();

    }

    @Then("Personel022 hastanin test sonuclarinin goruldugunu dogrular")
    public void personel022_hastanin_test_sonuclarinin_goruldugunu_dogrular() {
        Assert.assertTrue(us022Page.resultId.isDisplayed());
        Assert.assertTrue(us022Page.resultName.isDisplayed());
        Assert.assertTrue(us022Page.resultResult.isDisplayed());
        Assert.assertTrue(us022Page.resultDefaultMinValue.isDisplayed());
        Assert.assertTrue(us022Page.resultDefaultMaxValue.isDisplayed());
        Assert.assertTrue(us022Page.resultTest.isDisplayed());
        Assert.assertTrue(us022Page.resultDescription.isDisplayed());
        Assert.assertTrue(us022Page.resultDate.isDisplayed());

    }

    @Given("Personel022 Test Results sayfasinda Edit butonuna tiklar")
    public void personel022_test_results_sayfasinda_edit_butonuna_tiklar() {
        us022Page.editTest.click();

    }

    @And("Personel022 hastanin ID, Date, Result, description, Created date bilgilerinin goruldugunu dogrular")
    public void personel022_hastanin_bilgilerinin_goruldugunu_dogrular() {
        Assert.assertTrue(us022Page.editId.isDisplayed());
        Assert.assertTrue(us022Page.editDate.isDisplayed());
        Assert.assertTrue(us022Page.editResult.isDisplayed());
        Assert.assertTrue(us022Page.editDescription.isDisplayed());
        Assert.assertTrue(us022Page.editCreatedDate.isDisplayed());

    }
    @Given("Personel022 hastanin Result ve Description bilgilerini gunceller")
    public void personel022_hastanin_result_ve_description_bilgilerini_gunceller() {
        us022Page.editResult.clear();
        us022Page.editResult.sendKeys(ConfigReader.getProperty("EditResult"));

        us022Page.editDescription.clear();
        us022Page.editDescription.sendKeys(ConfigReader.getProperty("EditDescription"));

    }
    @Given("Personel022 saveE butotuna tiklar")
    public void personel022_save_e_butotuna_tiklar() {
        us022Page.saveButonn.click();

    }
    @Then("Personel022 hastanin Result ve Description bilgilerini guncellendigini dogrular")
    public void personel022_hastanin_result_ve_description_bilgilerini_guncellendigini_dogrular() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(us022Page.updatedYazisi));
        Assert.assertTrue(us022Page.updatedYazisi.isDisplayed());

    }

}
