package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US012Page;
import pages.US013Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US013StepDef {





        @Given("Personel\\(Staff) url adresine gider")
        public void personelStaffUrlAdresineGider() {
                Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        }

        @When("Staff Giris simgesine tiklar")
        public void US013staffGirisSimgesineTiklar() {
                US013Page.accountMenuButonu.click();
        }

        @And("Staff Sign in simgesine tiklar")
        public void US013staffSignInSimgesineTiklar() {

                US013Page.signInButton.click();
        }

        @And("{int} saniye bekler.")
        public void US013saniyeBekler(int arg0) {
                ReusableMethods.waitFor(3);
        }

        @And("Staff Username alanina gecerli bir username girer")
        public void US013staffUsernameAlaninaGecerliBirUsernameGirer() {
                US013Page.usernameTextBox.sendKeys(ConfigReader.getProperty("personelUsername012"));
        }

        @And("Staff Password alanina gecerli bir password girer")
        public void US013staffPasswordAlaninaGecerliBirPasswordGirer() {
                US013Page. passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
        }

        @And("Staff Sign in butonuna tiklar")
        public void US013staffSignInButonunaTiklar() {
                US013Page.signInButton2.click();
        }

        @And("Staff My Pages e tiklar")
        public void US013staffMyPagesETiklar() {
                US013Page.personelMyPages.click();
        }

        @And("Staff search Patiente tiklar")
        public void US013staffSearchPatienteTiklar() {
                US013Page.searchPatient.click();
        }

        @And("Test sonuclarini güncelleyecegi hastanin SSN numarasini girer")
        public void US013testSonuclariniGüncelleyecegiHastaninSSNNumarasiniGirer() {
                US013Page.patientSSN.sendKeys(ConfigReader.getProperty("hastaSSNNo"));
        }

        @And("SSN ini girdigi hastada show appoitments e tiklar")
        public void US013ssnIniGirdigiHastadaShowAppoitmentsETiklar() {
                US013Page.showAppointments.click();
        }

        @And("Show test e tiklar")
        public void US013showTestETiklar() {
                US013Page.showTests.click();
        }

        @And("View Result a tiklar")
        public void US013viewResultATiklar() {
                US013Page.viewResults.click();
        }

        @And("Edit e tiklar")
        public void US013editETiklar() {
                US013Page.testResultEdit.click();

        }

        @Then("Tum Resultlari\\(Sodyum,Potasyum;Glukose,Ure,Creatinine,Total Protein,Albumin ,Hemoglobin) günceller")
        public void US013tumResultlariSodyumPotasyumGlukoseUreCreatinineTotalProteinAlbuminHemoglobinGünceller() {
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

        @Given("Doktor {string} adresine gider.")
        public void doktorAdresineGider(String arg0) {
                Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        }


        @When("Giris simgesine tiklar.")
        public void girisSimgesineTiklar() {
                US013Page.accountMenuButonu.click();
        }

        @And("Sign in simgesine tiklar.")
        public void signInSimgesineTiklar() {
                US013Page.signInButton.click();
        }

        @And("Username alanina gecerli bir username girer.")
        public void usernameAlaninaGecerliBirUsernameGirer() {
                US013Page.usernameTextBox.sendKeys(ConfigReader.getProperty("doktorUserName012"));
        }

        @And("Password alanina gecerli bir password girer.")
        public void passwordAlaninaGecerliBirPasswordGirer() {
                US013Page. passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
        }

        @And("Sign in butonuna tiklar.")
        public void signInButonunaTiklar() {
                US013Page.signInButton2.click();
        }

        @And("My Pages e tiklar.")
        public void myPagesETiklar() {
                US013Page.doctorMyPages.click();
        }

        @And("My Appoitmente tiklar.")
        public void myAppoitmenteTiklar() {
                US013Page.doctorMyAppointments.click();
        }

        @And("Yatisini isteyecegi hastanin üzerine gelip Edit e tiklar.")
        public void yatisiniIsteyecegiHastaninÜzerineGelipEditETiklar() {
                WebElement submit = Driver.getDriver().
                        findElement(By.xpath("//span[@class='d-none d-md-inline']"));
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                jse.executeScript("arguments[0].scrollIntoView(true);", submit);
                jse.executeScript("arguments[0].click();", submit);
        }

        @And("Acilan sayfada {string} e tiklar.")
        public void acilanSayfadaETiklar(String arg0) {
                US013Page.RequestInpatient.click();
        }
    }

