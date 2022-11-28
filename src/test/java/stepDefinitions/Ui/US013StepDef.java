package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US013Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US013StepDef {
    US013Page US013Page = new US013Page();
    @Given("Staff13 url adresine gider")
    public void staffUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }


    @When("Staff13 Giris simgesine tiklar")
    public void staffGirisSimgesineTiklar() {
        US013Page.accountMenuButonu.click();
    }

    @And("Staff13 Sign in simgesine tiklar")
    public void staffSignInSimgesineTiklar() {
        US013Page.signInButton.click();
    }

    @And("{int} saniye bekler.")
    public void saniyeBekler(int arg0) {
        ReusableMethods.waitFor(3);
    }

    @And("Staff13 Username alanina gecerli bir username girer")
    public void staffUsernameAlaninaGecerliBirUsernameGirer() {
        US013Page.usernameTextBox.sendKeys(ConfigReader.getProperty("personelUsername012"));
    }


    @And("Staff13 Password alanina gecerli bir password girer")
    public void staffPasswordAlaninaGecerliBirPasswordGirer() {
        US013Page. passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
    }

    @And("Staff13 Sign in butonuna tiklar")
    public void staffSignInButonunaTiklar() {
        US013Page.signInButton2.click();
    }

    @And("Staff13 My Pages e tiklar")
    public void staffMyPagesETiklar() {
        US013Page.personelMyPages.click();
    }

    @And("Staff13 search Patiente tiklar")
    public void staffSearchPatienteTiklar() {
        US013Page.searchPatient.click();
    }

    @And("Staff13 Test sonuclarini güncelleyecegi hastanin SSN numarasini girer")
    public void staffTestSonuclariniGüncelleyecegiHastaninSSNNumarasiniGirer() {
        US013Page.patientSSN.sendKeys(ConfigReader.getProperty("hastaSSNNo"));
    }

    @And("Staff13 SSN ini girdigi hastada show appoitments e tiklar")
    public void staffSSNIniGirdigiHastadaShowAppoitmentsETiklar() {
        US013Page.showAppointments.click();
    }

    @And("Staff13 Show test e tiklar")
    public void staffShowTestETiklar() {
        US013Page.showTests.click();
    }

    @And("Staff13 View Result a tiklar")
    public void staffViewResultATiklar() {
        US013Page.viewResults.click();
    }

    @And("Staff13 Edit e tiklar")
    public void staffEditETiklar() {
        US013Page.testResultEdit.click();
    }

    @Then("Staff13 Tum Resultlari\\(Sodyum,Potasyum;Glukose,Ure,Creatinine,Total Protein,Albumin ,Hemoglobin) günceller")
    public void staffTumResultlariSodyumPotasyumGlukoseUreCreatinineTotalProteinAlbuminHemoglobinGünceller() {
        Random rand = new Random();
        String result = "";
        for (int i = 0; i < 8; i++) {
            int upperbound = 101;
            //generate random values from 0-100
            int int_random = rand.nextInt(upperbound);
            result = String.valueOf(int_random);
            US013Page.editButton.click();
            ReusableMethods.waitFor(3);
            US013Page.resultTextBox.clear();
            ReusableMethods.waitFor(3);
            US013Page.resultTextBox.sendKeys(result);
            ReusableMethods.waitFor(3);
            US013Page.saveButton.click();
            ReusableMethods.waitFor(3);
            US013Page.resultUpdateNotification.click();
            ReusableMethods.waitFor(3);
        }
    }

    @Given("Doktor13 {string} adresine gider.")
    public void doktorAdresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Doktor13 Giris simgesine tiklar.")
    public void doktorGirisSimgesineTiklar() {
        US013Page.accountMenuButonu.click();
    }

    @And("Doktor13 Sign in simgesine tiklar.")
    public void doktorSignInSimgesineTiklar() {
        US013Page.signInButton.click();
    }

    @And("Doktor13 Username alanina gecerli bir username girer.")
    public void doktorUsernameAlaninaGecerliBirUsernameGirer() {
        US013Page.usernameTextBox.sendKeys(ConfigReader.getProperty("doktorUserName012"));
    }

    @And("Doktor13 Password alanina gecerli bir password girer.")
    public void doktorPasswordAlaninaGecerliBirPasswordGirer() {
        US013Page. passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
    }

    @And("Doktor13 Sign in butonuna tiklar.")
    public void doktorSignInButonunaTiklar() {
        US013Page.signInButton2.click();
    }

    @And("Doktor13 My Pages e tiklar.")
    public void doktorMyPagesETiklar() {
        US013Page.doctorMyPages.click();
    }

    @And("Doktor13 My Appoitmente tiklar.")
    public void doktorMyAppoitmenteTiklar() {
        US013Page.doctorMyAppointments.click();
    }

    @And("Doktor13 Yatisini isteyecegi hastanin üzerine gelip Edit e tiklar.")
    public void doktorYatisiniIsteyecegiHastaninÜzerineGelipEditETiklar() {
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//span[@class='d-none d-md-inline']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("Doktor13 Acilan sayfada {string} e tiklar.")
    public void doktorAcilanSayfadaETiklar(String arg0) {

            US013Page.RequestInpatient.click();
        }
    }

