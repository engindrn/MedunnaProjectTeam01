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





        @Given("US013Personel\\(Staff) url adresine gider")
        public void personelStaffUrlAdresineGider() {
                Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        }

        @When("US013Staff Giris simgesine tiklar")
        public void staffGirisSimgesineTiklar() {
                US013Page.accountMenuButonu.click();
        }

        @And("US013Staff Sign in simgesine tiklar")
        public void staffSignInSimgesineTiklar() {

                US013Page.signInButton.click();
        }

        @And("US013{int} saniye bekler.")
        public void saniyeBekler(int arg0) {
                ReusableMethods.waitFor(3);
        }

        @And("US013Staff Username alanina gecerli bir username girer")
        public void staffUsernameAlaninaGecerliBirUsernameGirer() {
                US013Page.usernameTextBox.sendKeys(ConfigReader.getProperty("personelUsername012"));
        }

        @And("US013Staff Password alanina gecerli bir password girer")
        public void staffPasswordAlaninaGecerliBirPasswordGirer() {
                US013Page. passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
        }

        @And("US013Staff Sign in butonuna tiklar")
        public void staffSignInButonunaTiklar() {
                US013Page.signInButton2.click();
        }

        @And("US013Staff My Pages e tiklar")
        public void staffMyPagesETiklar() {
                US013Page.personelMyPages.click();
        }

        @And("US013Staff search Patiente tiklar")
        public void staffSearchPatienteTiklar() {
                US013Page.searchPatient.click();
        }

        @And("Test sonuclarini güncelleyecegi hastanin SSN numarasini girer")
        public void testSonuclariniGüncelleyecegiHastaninSSNNumarasiniGirer() {
                US013Page.patientSSN.sendKeys(ConfigReader.getProperty("hastaSSNNo"));
        }

        @And("US013SSN ini girdigi hastada show appoitments e tiklar")
        public void ssnIniGirdigiHastadaShowAppoitmentsETiklar() {
                US013Page.showAppointments.click();
        }

        @And("US013Show test e tiklar")
        public void showTestETiklar() {
                US013Page.showTests.click();
        }

        @And("US013View Result a tiklar")
        public void viewResultATiklar() {
                US013Page.viewResults.click();
        }

        @And("US013Edit e tiklar")
        public void editETiklar() {
                US013Page.testResultEdit.click();

        }

        @Then("US013Tum Resultlari\\(Sodyum,Potasyum;Glukose,Ure,Creatinine,Total Protein,Albumin ,Hemoglobin) günceller")
        public void tumResultlariSodyumPotasyumGlukoseUreCreatinineTotalProteinAlbuminHemoglobinGünceller() {
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

        @Given("US013Doktor {string} adresine gider.")
        public void doktorAdresineGider(String arg0) {
                Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        }


        @When("US013Giris simgesine tiklar.")
        public void girisSimgesineTiklar() {
                US013Page.accountMenuButonu.click();
        }

        @And("US013Sign in simgesine tiklar.")
        public void signInSimgesineTiklar() {
                US013Page.signInButton.click();
        }

        @And("US013Username alanina gecerli bir username girer.")
        public void usernameAlaninaGecerliBirUsernameGirer() {
                US013Page.usernameTextBox.sendKeys(ConfigReader.getProperty("doktorUserName012"));
        }

        @And("US013Password alanina gecerli bir password girer.")
        public void passwordAlaninaGecerliBirPasswordGirer() {
                US013Page. passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
        }

        @And("US013Sign in butonuna tiklar.")
        public void signInButonunaTiklar() {
                US013Page.signInButton2.click();
        }

        @And("US013My Pages e tiklar.")
        public void myPagesETiklar() {
                US013Page.doctorMyPages.click();
        }

        @And("US013My Appoitmente tiklar.")
        public void myAppoitmenteTiklar() {
                US013Page.doctorMyAppointments.click();
        }

        @And("US013Yatisini isteyecegi hastanin üzerine gelip Edit e tiklar.")
        public void yatisiniIsteyecegiHastaninÜzerineGelipEditETiklar() {
                WebElement submit = Driver.getDriver().
                        findElement(By.xpath("//span[@class='d-none d-md-inline']"));
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                jse.executeScript("arguments[0].scrollIntoView(true);", submit);
                jse.executeScript("arguments[0].click();", submit);
        }

        @And("US013Acilan sayfada {string} e tiklar.")
        public void acilanSayfadaETiklar(String arg0) {
                US013Page.RequestInpatient.click();
        }
    }

