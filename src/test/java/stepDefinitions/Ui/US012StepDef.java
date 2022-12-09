package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US012Page;
import utilities.ConfigReader1;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertTrue;

public class US012StepDef {
    US012Page US012Page= new US012Page();
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    @Given("Doktor12 {string} adresine gider")
    public void doktorUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader1.getProperty("medunnaUrl"));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int arg0) {
        ReusableMethods.waitFor(3);
    }

    @When("Doktor12 Giris simgesine tiklar")
    public void doktorGirisSimgesineTiklar() {
        US012Page.accountMenuButonu.click();
    }

    @And("Doktor12 Sign in simgesine tiklar")
    public void doktorSignInSimgesineTiklar() {
        US012Page.signInButton.click();
    }

    @And("Doktor12 Username alanina gecerli bir username girer")
    public void doktorUsernameAlaninaGecerliBirUsernameGirer() {
        US012Page.usernameTextBox.sendKeys(ConfigReader1.getProperty("doktorUserName012"));
    }

    @And("Doktor12 Password alanina gecerli bir password girer")
    public void doktorPasswordAlaninaGecerliBirPasswordGirer() {
        US012Page.passwordTextBox.sendKeys(ConfigReader1.getProperty("password012"));
    }

    @And("Doktor12 Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        US012Page.signInButton2.click();
    }

    @And("Doktor12 My Pages e tiklar")
    public void doktorMyPagesETiklar() {
        US012Page.doctorMyPages.click();
    }

    @And("Doktor12 My Appoitmente tiklar")
    public void doktorMyAppoitmenteTiklar() {
        US012Page.doctorMyAppointments.click();
    }

    @And("Doktor12 Test isteyecegi hastanin üzerine gelip edit e tiklar")
    public void doktorTestIsteyecegiHastaninÜzerineGelipEditETiklar() {
        // US012Page.hastaEdit.click();

        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//span[@class='d-none d-md-inline']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("Doktor12 Acilan sayfada {string} e tiklar")
    public void doktorAcilanSayfadaETiklar(String arg0) {
        // US012Page.RequestATest.click();
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//a[@class='btn btn-success btn-sm']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @Then("Doktor12 Acilan sayfada testlerin görüldügünü dogrular")
    public void doktorAcilanSayfadaTestlerinGörüldügünüDogrular() {
        assertTrue(US012Page.testItems.isDisplayed());
    }

    @And("Doktor12 Urea testi ister")
    public void doktorDoktorUreaTestiIster() throws AWTException {
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

    @And("Doktor12 Sodium testi ister")
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

    @And("Doktor12 Albumin testi ister")
    public void doktorAlbuminTestiIster() {
        //US012Page.albumin.click();
        // js.executeScript("argument[0].click;", US012Page.testAlbumin);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='1407']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);

    }

    @And("Doktor12 Hemoglobin testi ister")
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

    @And("Doktor12 Potasyum testi ister")
    public void doktorPotasyumTestiIster() {
        //  US012Page.Potasyum.click();
        // js.executeScript("argument[0].click;", US012Page.testPotassium);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='127908']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("Doktor12 Glukose testi ister")
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

    @And("Doktor12 Creatinine testi ister")
    public void doktorCreatinineTestiIster() {
        //US012Page.Creatinine.click();
        //  js.executeScript("argument[0].click;", US012Page.testCreatinine);
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//input[@name='132793']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }

    @And("Doktor12 Total Protein testi ister")
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

    @And("Doktor12 save butonuna tiklar")
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

