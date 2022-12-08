package stepDefinitions.Ui;

        import groovyjarjarantlr4.v4.codegen.model.Action;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import org.junit.Assert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.yaml.snakeyaml.events.Event;
        import pages.US013Page;
        import pages.US017Page;
        import utilities.ConfigReader;
        import utilities.Driver;
        import utilities.ReusableMethods;

        import java.awt.*;
        import java.time.Duration;

        import static org.junit.Assert.assertTrue;

public class US017StepDef {
    pages.US017Page US017Page = new US017Page();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Admin url adresine gider")
    public void adminUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Admin giris simgesine tiklar")
    public void adminGirisSimgesineTiklar() {
        US017Page.accountMenuButonu.click();

    }
    @And("Admin sign in simgesine tiklar")
    public void adminSignInSimgesineTiklar() {
        US017Page.signInButton.click();

    }
    @And("Admin username alanina gecerli bir username girer")
    public void adminUsernameAlaninaGecerliBirUsernameGirer() {
        US017Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameUS017"));
    }
    @And("Admin password alanina gecerli bir password girer")
    public void adminPasswordAlaninaGecerliBirPasswordGirer() {
        US017Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordUS017"));

    }
    @And("Admin sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        US017Page.signInButton2.click();
    }
    @And("Admin Items-Titels e tiklar")
    public void adminItemsTitelsETiklar() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        US017Page.ItemsTitles.click();
    }
    @And("Admin Test Item e tiklar")
    public void adminTestItemETiklar() {
        US017Page.TestItem.click();
    }
    @And("Admin Create a new Test Item a tiklar")
    public void adminCreateANewTestItemATiklar() {
        US017Page.CreateanewTestItem.click();
    }
    @And("Admin  Name,Description,price Default min value,Default max value degerlerini girer")
    public void adminNameDescriptionPriceDefaultMinValueDefaultMaxValueDegerleriniGirer() {
        // US017Page.testName.sendKeys("Glukoz");
        //US017Page.Description.sendKeys("glukoz");
        //US017Page.Price.sendKeys("50");
        //US017Page.defaultValMin.sendKeys("70");
        //US017Page.defaultValMax.sendKeys("110");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("testName")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("Description")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("Price")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("DefaultValMin")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("DefaultValMax")).sendKeys(Keys.ENTER).perform();

    }

    @And("Admin save butona tiklar")
    public void adminSaveButonaTiklar() {

        WebElement submit = Driver.getDriver().
                findElement(By.xpath("//*[@id=\"save-entity\"]"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);

    }
    @And("Admin IDButtona tiklar")
    public void adminIDButtonaTiklar() {
        US017Page.IDButton.click();
    }
    @And("Admin GlukozID ye tiklar")
    public void adminGlukozIDYeTiklar() {
        // actions.sendKeys(Keys.PAGE_DOWN).perform();
        // US017Page.GlukozID.click();
        WebElement submit = Driver.getDriver().
                findElement(By.xpath("/html/body/div/div/div/div[4]/div/div/div/div/div[1]/div/table/tbody/tr[12]/td[1]/a"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", submit);
        jse.executeScript("arguments[0].click();", submit);
    }
    @And("Admin testEditButton a tiklar")
    public void adminTestEditButtonATiklar() {

        US017Page.testEditButton.click();
    }
    @And("Admin Name,Description,price Default min value,Default max value degerlerini günceller")
    public void adminNameDescriptionPriceDefaultMinValueDefaultMaxValueDegerleriniGünceller() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DELETE).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("testName")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.DELETE).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("Description")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.DELETE).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("Price")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.DELETE).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("DefaultValMin")).sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.DELETE).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("DefaultValMax")).sendKeys(Keys.ENTER).perform();

    }
    @And("Admin test delete tiklar")
    public void adminTestDeleteTiklar() {
        US017Page.testDeleteButton.click();

    }
    @And("Admin {int} saniye bekler")
    public void adminSaniyeBekler(int arg0) {
        ReusableMethods.waitFor(3);
    }
    @Then("Admin created date{string} görünür oldugunu dogrular.")
    public void adminCreatedDateGörünürOldugunuDogrular(String arg0) {
        assertTrue( US017Page.CreateDate.isDisplayed());
    }
    @And("Admin sayfayi kapatir")
    public void adminSayfayiKapatir() {
        Driver.closeDriver();
    }


}
