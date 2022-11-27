package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US012Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class US012StepDef {

    US012Page us012Page = new US012Page();
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();


    @Given("US012Doktor url adresine gider")
    public void doktorUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @And("US012{int} saniye bekler")
    public void saniyeBekler(int arg0) {
        ReusableMethods.waitFor(5);
    }

    @When("US012Giris simgesine tiklar")
    public void girisSimgesineTiklar() {
        US012Page.accountMenuButonu.click();
    }

    @And("US012Sign in simgesine tiklar")
    public void signInSimgesineTiklar() {
        US012Page.signInButton.click();
    }

    @And("US012Username alanina gecerli bir username girer")
    public void usernameAlaninaGecerliBirUsernameGirer() {
        US012Page.usernameTextBox.sendKeys(ConfigReader.getProperty("doktorUserName012"));
    }

    @And("US012Password alanina gecerli bir password girer")
    public void passwordAlaninaGecerliBirPasswordGirer() {
        US012Page.passwordTextBox.sendKeys(ConfigReader.getProperty("password012"));
    }

    @And("US012Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        US012Page.signInButton2.click();
    }

    @And("US012My Pages e tiklar")
    public void myPagesETiklar() {
        US012Page.doctorMyPages.click();
    }

    @And("US012My Appoitmente tiklar")
    public void myAppoitmenteTiklar() {
        US012Page.doctorMyAppointments.click();
    }

    @And("US012Test isteyecegi hastanin üzerine gelip edit e tiklar")
    public void testIsteyecegiHastaninÜzerineGelipEditETiklar() {
        // US012Page.hastaEdit.click();

        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//span[@class='d-none d-md-inline']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("US012Acilan sayfada {string} e tiklar")
    public void acilanSayfadaETiklar(String arg0) {
        // US012Page.RequestATest.click();
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//a[@class='btn btn-success btn-sm']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @Then("US012Acilan sayfada testlerin görüldügünü dogrular")
    public void acilanSayfadaTestlerinGörüldügünüDogrular() {
        assertTrue(US012Page.testItems.isDisplayed());
    }

    @And("US012Doktor Urea testi ister")
    public void doktorUreaTestiIster() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL); //CTRL ye tiklandi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye tiklandi
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            // CTRL (-) ye basılarak ekran belirlenen miktarda küçültülmüş oldu.

           // US012Page.ure.click();
            // js.executeScript("argument[0].click;", US012Page.testUrea);
            WebElement submit = Driver.getDriver().
                    findElement(By.xpath("//input[@name='1402']"));
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", submit);
            jse.executeScript("arguments[0].click();", submit);


        }
    }
    @And("US012Doktor Sodium testi ister")
    public void doktorSodiumTestiIster() {
        //ReusableMethods.jsScrollClick ( US012Page.Sodium);
        // US012Page.Sodium.click();
        //js.executeScript("argument[0].click;", US012Page.testSodium);
        WebElement submit = Driver.getDriver().
                findElement(By.cssSelector("[id='1404']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);

    }

    @And("US012Doktor Albumin testi ister")
    public void doktorAlbuminTestiIster() {
        //US012Page.albumin.click();
        // js.executeScript("argument[0].click;", US012Page.testAlbumin);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='1407']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);

    }

    @And("US012Doktor Hemoglobin testi ister")
    public void doktorHemoglobinTestiIster() {
        //  ReusableMethods.jsScrollClick ( US012Page.hemoglobin);
        // US012Page.hemoglobin.click();
        // js.executeScript("argument[0].click;", US012Page.testHemoglobin);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='1408']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);


    }

    @And("US012Doktor Potasyum testi ister")
    public void doktorPotasyumTestiIster() {
        //  US012Page.Potasyum.click();
        // js.executeScript("argument[0].click;", US012Page.testPotassium);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='127908']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);


    }

    @And("US012Doktor Glukose testi ister")
    public void doktorGlukoseTestiIster() {

        // US012Page.glucose.click();
        // ReusableMethods.jsScrollClick ( US012Page.glucose);
        // js.executeScript("argument[0].click;", US012Page.testGlucose);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='132751']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);

    }

    @And("US012Doktor Creatinine testi ister")
    public void doktorCreatinineTestiIster() {
        //US012Page.Creatinine.click();
        //  js.executeScript("argument[0].click;", US012Page.testCreatinine);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='132793']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("US012Doktor Total Protein testi ister")
    public void doktorTotalProteinTestiIster() {
        //ReusableMethods.jsScrollClick ( US012Page.totalProtein);
        //US012Page.totalProtein.click();
        //js.executeScript("argument[0].click;", US012Page.testTotalProtein);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='132796']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("US012Doktor save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {
        WebElement save = US012Page.save;
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", save);
        jse.executeScript("arguments[0].click();", save);

    }
/*
    @Then("Doktor the appointment is updated with identifier {int} yazisini gorur.")
    public void doktorTheAppointmentIsUpdatedWithIdentifierYazisiniGorur(int arg0) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(US012Page.update));
        assertTrue(US012Page.update.isDisplayed());
    }*/



}
