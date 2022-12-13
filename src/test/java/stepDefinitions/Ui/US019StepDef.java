package stepDefinitions.Ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US019Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Ui.US019Methods.personelOlusturmaMethodu;
import static stepDefinitions.Ui.US019Methods.personelSilmeMethodu;


public class US019StepDef {

    Faker faker = new Faker();
    US019Page obje = new US019Page();
    Actions actions = new Actions(Driver.getDriver());

    String expectedPhone;
    String expectedAddress;
    String expecteddescription;
    String expectedcountry;
    String expectedstateCity;


    @Given("Admin19 {string} adresine gider")
    public void adminAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @Then("Admin19 Giris simgesine tiklar")
    public void adminGirisSimgesineTiklar() {
        obje.ilkSayfaSingInButonu.click();

    }

    @And("Admin19 Sign in simgesine tiklar")
    public void adminSignInSimgesineTiklar() {
        obje.userilkSayfaSingInYazisi.click();

    }

    @And("Admin19 Username alanina gecerli bir username {string} girer")
    public void adminUsernameAlaninaGecerliBirGirer(String username) {
        obje.username.sendKeys(username);

    }

    @And("Admin19 Password alanina gecerli bir password {string} girer")
    public void adminPasswordAlaninaGecerliBirGirer(String password) {
        obje.password.sendKeys(password);

    }

    @And("Admin19 Sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        obje.pencereSignInButonu.click();

    }

    @And("Admin19 Items&Titles sekmesine tiklar")
    public void adminItemsTitlesSekmesineTiklar() {
        obje.itemsTitles.click();

    }

    @And("Admin19  Staff secenegini tiklar")
    public void adminAdminStaffSeceneginiTiklar() {
        obje.staffButton.click();


    }

    @And("Admin19 Create a new Staff butonuna tiklar")
    public void adminCreateANewStaffButonunaTiklar() {
        obje.createANewStaff.click();

    }

    @And("Admin19 Use Search box suna tiklar")
    public void adminUseSearchBoxSunaTiklar() {
        obje.useSearchCheckBox.click();


    }

    @And("Admin19 SSN alanina staff in {string} i girer")
    public void adminSSNAlaninaStaffInIGirer(String ssn) {
        obje.ssnSearchBox.sendKeys(ssn);


    }

    @And("Admin19 Search User butonunu tiklar")
    public void adminSearchUserButonunuTiklar() {
        obje.searchUser.click();


    }

    @Then("Admin19 User found with search SSN mesajini gorur")
    public void adminUserFoundWithSearchSSNMesajiniGorur() {
        assertTrue(obje.userFoundBasariMesaji.isDisplayed());


    }

    @And("Admin19 {string} {string} {string} {string} {string} alanlarini doldurur")
    public void adminBosOlanAlanlariniDoldurur(String phone, String address, String description, String country, String stateCity) {


        expectedPhone = phone;
        expectedAddress = address;
        expecteddescription = description;
        expectedcountry = country;
        expectedstateCity = stateCity;

        ReusableMethods.waitFor(1);
        obje.staffPhone.sendKeys(phone);
        ReusableMethods.waitFor(1);
        obje.address.sendKeys(address);
        ReusableMethods.waitFor(1);
        obje.description.sendKeys(description);
        ReusableMethods.waitFor(1);
        obje.country.sendKeys(country);
        ReusableMethods.waitFor(1);
        obje.stateCity.sendKeys(stateCity);
        ReusableMethods.waitFor(1);


    }

    @And("Admin19 Save butonuna tiklar")
    public void adminSaveButonunaTiklar() {

        obje.saveButonu.click();


    }

    @Then("Admin19 tum bilgilerin dolduruldugu dogrular")
    public void adminTumBilgilerinDoldurulduguDogrular() {

        String actualPhone = obje.staffPhone.getAttribute("value");
        String actualAddress = obje.address.getAttribute("value");
        String actualDescription = obje.description.getAttribute("value");
        WebElement countrySelect = obje.country;
        Select options = new Select(countrySelect);
        String actualCountry = options.getFirstSelectedOption().getText();
        WebElement citySelect = obje.stateCity;
        Select options2 = new Select(citySelect);
        String actualStateCity = options2.getFirstSelectedOption().getText();

        assertEquals(expectedPhone, actualPhone);
        assertEquals(expectedAddress, actualAddress);
        assertEquals(expecteddescription, actualDescription);
        assertEquals(expectedcountry, actualCountry);
        assertEquals(expectedstateCity, actualStateCity);


    }

    @And("Admin19 Administratiton sekmesine tiklar")
    public void adminAdministratitonSekmesineTiklar() {
        obje.administration.click();


    }

    @And("Admin19 User management sekmesine tiklar")
    public void adminUserManagementSekmesineTiklar() {
        obje.userManagement.click();
    }

    @And("Admin19 sececegi kullanicinin  View butonuna tiklar")
    public void adminSececegiKullanicininViewButonunaTiklar() {
        obje.viewButton.click();

    }

    @Then("Admin19 kullaniciyi sectigini dogrular")
    public void adminKullaniciyiSectiginiDogrular() {
        assertTrue(obje.userBilgisi.isDisplayed());


    }

    @And("Admin19 duzenleme yapacagi kullanicinin  Edit butonuna tiklar")
    public void adminDuzenlemeYapacagiKullanicininEditButonunaTiklar() {
        String url = "https://medunna.com/staff/362807/edit";
        Driver.getDriver().get(url);
        // obje.username.sendKeys("team01");
        // obje.password.sendKeys("team0101", Keys.ENTER);


    }

    @And("Admin19 kullanici bilgileri duzenler")
    public void adminKullaniciBilgileriDuzenler() {

        obje.phone.clear();
        obje.phone.sendKeys("0123456798");
        obje.address.clear();
        obje.address.sendKeys(faker.address().fullAddress());
        ReusableMethods.jsScrollClick(obje.save);


    }


    @Then("Admin19 kullanici bilgilerinin duzenledigine dair basari mesajini gorur")
    public void adminKullaniciBilgilerininDuzenledigineDairBasariMesajiniGorur() throws IOException {

        try {

            assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")).isDisplayed());

        } catch (NoSuchElementException e) {
            ReusableMethods.getScreenshotWebElement("Internal server error", obje.internalServer);
            Assert.fail("Bilgiler doldruruldu ama Internal server error verdi");
        }


    }


    @Then("Admin19 silmek istedigi stafif in delete butonuna tiklar")
    public void adminSilmekIstedigiPersonelinDeleteButonunaTiklar() {

        personelOlusturmaMethodu();
        personelSilmeMethodu();


    }

    @And("Admin19 silindi mesajini dogrular")
    public void adminSilindiMesajiniDogrular() {

        Assert.assertTrue(obje.staffSilindiBasariMesaji.isDisplayed());
        Driver.quitDriver();
    }

    @And("Admin19 sayfayi kapatir")
    public void adminSayfayiKapatir() {

        Driver.closeDriver();
    }
}
