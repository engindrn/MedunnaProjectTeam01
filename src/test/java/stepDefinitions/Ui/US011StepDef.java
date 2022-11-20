package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US011Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class US011StepDef {

    US011Page page = new US011Page();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Doktor medunna sayfasina gider")
    public void doktorMedunnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl11"));
    }

    @Then("Doktor kisi simgesinin uzerine tiklar")
    public void doktorKisiSimgesininUzerineTiklar() {
        page.imge.click();

    }

    @And("Doktor acilan pencerede Sign in ' in uzerine tiklar")
    public void doktorAcilanPenceredeSignInInUzerineTiklar() {
        page.signin.click();
    }

    @Then("Doktor username alanina gecerli bir username girer")
    public void doktorUsernameAlaninaGecerliBirUsernameGirer() {
        page.username.sendKeys(ConfigReader.getProperty("username11"));
    }


    @And("Doktor password alanina gecerli bir password girer")
    public void doktorPasswordAlaninaGecerliBirPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password11")).perform();

    }


    @And("Doktor Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        page.signIn.click();

    }


    @And("Doktor my pages sekmesine tiklar")
    public void doktorMyPagesSekmesineTiklar() {
        page.myPages.click();
    }


    @And("Doktor acilan pencerede my appointments sekmesine tiklar")
    public void doktorAcilanPenceredeMyAppointmentsSekmesineTiklar() {
        page.myAppointments.click();
    }


    @And("Doktor  edit butonuna tiklar")
    public void doktorEditButonunaTiklar() {
        page.edit.click();
    }

    @And("Doktor Create or Edit an Appoinment yazisini gorur")
    public void doktorCreateOrEditAnAppoinmentYazisiniGorur() {
        Assert.assertTrue(page.create.isDisplayed());

    }

    @And("Doktor status alanindan bir opsiyon secer")
    public void doktorStatusAlanindanBirOpsiyonSecer() {
        page.statusoptional.click();
        WebElement option = page.statusoptional;
        Select select = new Select(option);
        select.selectByIndex(2);
    }


    @And("Doktor save butotuna tiklar")
    public void doktorSaveButotunaTiklar() {
        WebElement save = page.save;
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", save);
        jse.executeScript("arguments[0].click();", save);

    }


    @Then("Doktor the appointment is updated with identifier {int} yazisini gorur")
    public void doktorTheAppointmentIsUpdatedWithIdentifierYazisiniGorur(int arg0) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.update));
        Assert.assertTrue(page.update.isDisplayed());
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    // TC_002

    @And("Doktor acilan sayfada hastanin  ID, Start Date Time, End Date Time, Status, Physician ve Patient bilgilerinin goruldugunu dogrular")
    public void doktorAcilanSayfadaHastaninIDStartDateTimeEndDateTimeStatusPhysicianVePatientBilgilerininGoruldugunuDogrular() {

        Assert.assertTrue(page.hastaId.isDisplayed());
        Assert.assertTrue(page.startDate.isDisplayed());
        Assert.assertTrue(page.endDate.isDisplayed());
        Assert.assertTrue(page.status.isDisplayed());
        Assert.assertTrue(page.physician.isDisplayed());
        Assert.assertTrue(page.patient.isDisplayed());


    }


    // TC_003

    @And("Doktor Anamnesis, Treatment ve Diagnosis alanlarini bos birakir")
    public void doktorAnamnesisTreatmentVeDiagnosisAlanlariniBosBirakir() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.anamnesis.clear();
        page.treatment.clear();
        page.diagnosis.clear();

    }

    @And("Doktor Anemnesis bolumunde This field is required yazisini gorur")
    public void doktorAnemnesisBolumundeThisFieldIsRequiredYazisiniGorur() {
        Assert.assertTrue(page.anamnesisWarning.isDisplayed());

    }

    @And("Doktor Treatment bolumunde This field is required yazisini gorur")
    public void doktorTreatmentBolumundeThisFieldIsRequiredYazisiniGorur() {
        Assert.assertTrue(page.treatmentWarning.isDisplayed());
    }

    @And("Doktor Diagnosis bolumunde This field is required yazisini gorur")
    public void doktorDiagnosisBolumundeThisFieldIsRequiredYazisiniGorur() {
        Assert.assertTrue(page.diagnosisWarning.isDisplayed());
    }


    // TC_004.1

    @And("Doktor prescription ve description alanlarini bos birakir")
    public void doktorPrescriptionVeDescriptionAlanlariniBosBirakir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.prescription.clear();
        page.description.clear();

    }

    // US_004.2

    @And("Doktor prescription ve description alanlarina bilgiler girer")
    public void doktorPrescriptionVeDescriptionAlanlarinaBilgilerGirer() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.prescription.clear();
        page.prescription.sendKeys("Medicine");
        page.description.clear();
        page.description.sendKeys("Two weeks");

    }


    // US_005

    @And("Doktor status alanini tiklar ve PENDING opsiyonunu secer")
    public void doktorStatusAlaniniTiklarVePENDINGOpsiyonunuSecer() {
        WebElement statu = page.statusoptional;
        Select select = new Select(statu);
        select.selectByIndex(1);

    }

    @And("Doktor status alanini tiklar ve  COMPLETED opsiyonunu secer")
    public void doktorStatusAlaniniTiklarVeCOMPLETEDOpsiyonunuSecer() {
        WebElement statu = page.statusoptional;
        Select select = new Select(statu);
        select.selectByIndex(2);
    }

    @And("Doktor status alanini tiklar ve CANCELLED opsiyonunu secer")
    public void doktorStatusAlaniniTiklarVeCANCELLEDOpsiyonunuSecer() {
        WebElement statu = page.statusoptional;
        Select select = new Select(statu);
        select.selectByIndex(3);

    }


}
