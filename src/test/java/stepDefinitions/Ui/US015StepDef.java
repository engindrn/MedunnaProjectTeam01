package stepDefinitions.Ui;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.US015Page;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.ReusableMethods;

import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.testng.Assert.assertTrue;
import static utilities.ReusableMethods.setTheDateByRandom;

public class US015StepDef {

    US015Page page = new US015Page();
    LocalDateTime date1 = LocalDateTime.now().minusYears(24).minusHours(5);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    String date = date1.format(formatter);

    @Given("YS {string} {string} e gider")
    public void ysEGider(String user, String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("YS admin login olur")
    public void ysAdminLoginOlur() {
        page.accountMenu.click();
        page.signIn.click();
        page.usernameBox.sendKeys(ConfigReader.getProperty("admin15"));
        page.passwordBox.sendKeys(ConfigReader.getProperty("password15"));
        page.signInButton.click();
        //ReusableMethods.getActions()
        //        .click(page.usernameBox)
        //        .sendKeys(ConfigReader.getProperty("adminUsername"))
        //        .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("adminPassword"))
        //        .sendKeys(Keys.ENTER).perform();
    }

    @Then("YS admin Items&Titles menuden Patient tiklar")
    public void ysAdminItemsTitlesMenudenPatientTiklar() {
        page.itemsAndTitles.click();
        page.patientLink.click();
    }

    @Then("YS admin acilan pencerede Create a new Patient butonunun gorunur oldugunu dogrular ve tiklar")
    public void ysAdminAcilanPenceredeCreateANewPatientButonununGorunurOldugunuDogrularVeTiklar() {
        Assert.assertTrue(page.createNewPatientButton.isDisplayed());
        page.createNewPatientButton.click();
    }

    @And("YS admin acilan pencerede gecerli bilgileri girer ve save buttonuna tiklar")
    public void ysAdminAcilanPenceredeGecerliBilgileriGirerVeSaveButtonunaTiklar() {

        page.firstnameBoxPatient.sendKeys(Faker.instance().name().lastName());
        page.lastnameBoxPatient.sendKeys(Faker.instance().name().lastName());
        page.birthDayBoxPatient.sendKeys(date);
        page.emailBoxPatient.sendKeys(Faker.instance().internet().emailAddress());
        page.phoneBoxPatient.sendKeys(Faker.instance().number().digits(10));
        page.genderDdmPatient.sendKeys("FEMALE");
        page.bloodGroupDdmPatient.sendKeys("O+");
        page.addressBoxPatient.sendKeys(Faker.instance().address().fullAddress());
        page.descriptionBoxPatient.sendKeys("yasemen");
        page.countryDdmPatient.sendKeys("Türkiye");
        ReusableMethods.waitForClickablility(page.stateDdmPatient,3);
        page.stateDdmPatient.sendKeys("Istanbul");
        ReusableMethods.jsScrollClick(page.saveButtonPatient);
        ReusableMethods.waitFor(3);
        //  ReusableMethods.waitForClickablility(page.saveButtonPatient,3);
        //  try {
        //      page.saveButtonPatient.sendKeys(Keys.ENTER);
        //  } catch (Exception e) {
        //      throw new RuntimeException(e);
        //  }


        //  ReusableMethods.getActions().click(page.firstnameBoxPatient)
        //          .sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB)
        //          .sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB)
        //          .sendKeys(date).sendKeys(Keys.ENTER).sendKeys(Keys.TAB)
        //          .sendKeys(Faker.instance().internet().emailAddress()).sendKeys(Keys.TAB)
        //          .sendKeys(Faker.instance().number().digits(10)).sendKeys(Keys.TAB)
        //          .sendKeys("FEMALE").sendKeys(Keys.TAB)
        //          .sendKeys("O+").sendKeys(Keys.TAB)
        //          .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB)
        //          .sendKeys(Faker.instance().toString()).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        //          .sendKeys("Türkiyem").sendKeys(Keys.TAB)
        //          .sendKeys("Denizli")
        //          .perform();
        //  ReusableMethods.waitFor(5);
    }


    @And("YS admin kayit isleminin gerceklestigini dogrular")
    public void ysAdminKayitIslemininGerceklestiginiDogrular() throws IOException {
        ReusableMethods.waitForClickablility(page.inPatientSaveMassagePatient,3);
        Assert.assertTrue(page.inPatientSaveMassagePatient.isDisplayed());
        ReusableMethods.getScreenshotWebElement("SS mesaj",page.inPatientSaveMassagePatient);
    }


    @And("YS admin acilan pencerede SSN,First Name,Last Name,Birth Date,Phone, Gender,Blood Group,Address,Description,Created Date,User,Country and city title'larinin gorunur oldugunu dogrular")
    public void ysAdminAcilanPenceredeSSNFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndCityTitleLarininGorunurOldugunuDogrular() throws IOException {
        for (WebElement each : page.patientTableTitles) {
            Assert.assertTrue(each.isDisplayed());
        }
        ReusableMethods.getScreenshotWebElement("tableTitles",page.titles);
    }


    @And("YS admin id tiklar olusturulan hastaya edit yapar")
    public void ysAdminIdTiklarOlusturulanHastayaEditYapar() {

        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(5);
        ReusableMethods.jsScrollClick(page.idTitle);
        ReusableMethods.waitFor(5);
        ReusableMethods.jsScrollClick(page.editButtons.get(0));
    }

    @Then("YS admin hastanin email,phone,adres,description bilgisini gunceller")
    public void ysAdminHastaninEmailPhoneAdresDescriptionBilgisiniGunceller() {

        page.emailBoxPatient.clear();
        ReusableMethods.waitFor(1);
        page.emailBoxPatient.sendKeys(Faker.instance().internet().emailAddress());
        page.phoneBoxPatient.clear();
        ReusableMethods.waitFor(1);
        page.phoneBoxPatient.sendKeys(Faker.instance().number().digits(10));
        page.addressBoxPatient.clear();
        ReusableMethods.waitFor(1);
        page.addressBoxPatient.sendKeys(Faker.instance().address().fullAddress());
        page.descriptionBoxPatient.clear();
        ReusableMethods.waitFor(1);
        page.descriptionBoxPatient.sendKeys(Faker.instance().toString());
    }

    @And("YS Save buttonuna tiklar ve {string} mesajinin gorundugunu dogrular")
    public void ysSaveButtonunaTiklarVeMesajininGorundugunuDogrular(String message) throws IOException {

        ReusableMethods.waitFor(2);
        page.saveButtonPatient.click();

        ReusableMethods.waitForVisibility(page.inPatientSaveMassagePatient, 3);
        Assert.assertTrue(page.inPatientSaveMassagePatient.getText().contains(message));
        ReusableMethods.getScreenshotWebElement("updateMessage", page.inPatientSaveMassagePatient);

    }

    @And("YS sayfayi kapatir")
    public void ysSayfayiKapatir() {
        Driver.quitDriver();
    }

    @Then("YS admin Items&Titles menuden Appointment tiklar")
    public void ysAdminItemsTitlesMenudenAppointmentTiklar() {
        page.itemsAndTitles.click();
        page.appointmentDdmPatient.click();
    }

    @And("YS admin Create a new Appointment butonuna tiklar")
    public void ysAdminCreateANewAppointmentButonunaTiklar() {
        page.createANewAppointment.click();

    }

    @Then("YS admin gecerli randevu tarihlerini secer")
    public void ysAdminGecerliRandevuTarihleriniSecer() {

        ReusableMethods.waitFor(3);
        String date = setTheDateByRandom("dd-MM-yyyy", 0, "FEATURE");
        page.appointmentEndDate.sendKeys(date);

        //  LocalDate localDate=LocalDate.now();
        //  LocalDate duzenlenmisLocalDate = localDate.plusDays(10);
        //  DateTimeFormatter duzenliDateStart = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //  String checkInDate = duzenlenmisLocalDate.format(duzenliDateStart);
        //  page.appointmentEndDate.sendKeys(checkInDate);
        //  ReusableMethods.waitFor(2);

    }

    @Then("YS admin status,physician ve patient bilgisi secer")
    public void ysAdminStatusPhysicianVePatientBilgisiSecer() {

        List<WebElement> appointmentStatus = ReusableMethods.select(page.appointmentStatus).getOptions();
        int index = ReusableMethods.random().nextInt(appointmentStatus.size()) - 1;
        ReusableMethods.waitFor(5);
        ReusableMethods.select(page.appointmentStatus).selectByIndex(index);
        ReusableMethods.jsScroll(page.Diagnosis);
        List<WebElement> physiciamDdm = ReusableMethods.select(page.appointmentDoctorSelect).getOptions();
        index = ReusableMethods.random().nextInt(physiciamDdm.size()) - 1;
        ReusableMethods.waitFor(3);
        ReusableMethods.select(page.appointmentDoctorSelect).selectByIndex(index);
        List<WebElement> patientDdm = ReusableMethods.select(page.appointmentPatientSelect).getOptions();
        index = ReusableMethods.random().nextInt(patientDdm.size()) - 1;
        ReusableMethods.waitFor(3);
        ReusableMethods.select(page.appointmentPatientSelect).selectByIndex(index);


        //   ReusableMethods.waitFor(5);
        //   ReusableMethods.select(page.appointmentStatus).selectByVisibleText("PENDING");
        //   ReusableMethods.jsScroll(page.Diagnosis);
        //   ReusableMethods.waitFor(5);
        //   ReusableMethods.select(page.appointmentStatus).selectByVisibleText("362070:Georgianne Barrows");

    }

    @And("YS admin Save buttonuna tiklar ve {string} mesajinin gorundugunu dogrular")
    public void ysAdminSaveButtonunaTiklarVeMesajininGorundugunuDogrular(String message) throws IOException {
        //  page.appointmentSaveButton.click();
        //  ReusableMethods.waitFor(1);
        //  String doktorAtamaDogrulama=page.patientAlert.getText();
        //  // System.out.println(doktorAtamaDogrulama);
        //  Assert.assertTrue(doktorAtamaDogrulama.contains(message));
        //  // Assert.assertTrue(us15_pages.patientAlert.isDisplayed());
        //  ReusableMethods.getScreenshot(message);

        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(page.saveButtonPatient);

        ReusableMethods.waitForVisibility(page.saveMassagePatient, 10);
        assertTrue(page.saveMassagePatient.getText().contains(message));
        ReusableMethods.getScreenshotWebElement("us015tc003updateMessage", page.saveMassagePatient);

    }


    @And("YS admin acilan pencerede Country ve State disindaki hasta bilgilerini girer")
    public void ysAdminAcilanPenceredeCountryVeStateDisindakiHastaBilgileriniGirer() {
        page.firstnameBoxPatient.sendKeys(Faker.instance().name().lastName());
        page.lastnameBoxPatient.sendKeys(Faker.instance().name().lastName());
        page.birthDayBoxPatient.sendKeys(date);
        page.emailBoxPatient.sendKeys(Faker.instance().internet().emailAddress());
        page.phoneBoxPatient.sendKeys(Faker.instance().number().digits(10));
        page.genderDdmPatient.sendKeys("FEMALE");
        page.bloodGroupDdmPatient.sendKeys("O+");
        page.addressBoxPatient.sendKeys(Faker.instance().address().fullAddress());
        page.descriptionBoxPatient.sendKeys("yasemen");

    }

    @And("YS admin save butonuna tiklar ve {string} mesajinin gorunur olmadigini dogrular")
    public void ysAdminSaveButonunaTiklarVeMesajininGorunurOlmadiginiDogrular(String message) throws IOException {

        ReusableMethods.jsScrollClick(page.saveButtonPatient);
        ReusableMethods.waitForVisibility(page.inPatientSaveMassagePatient, 15);
        assertTrue(page.inPatientSaveMassagePatient.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshotWebElement("countrystateBug", page.inPatientSaveMassagePatient);
        ReusableMethods.waitFor(1);
    }

    @And("YS admin id tiklar olusturulan hastaya delete yapar ve popUpta delete buttona tiklar")
    public void ysAdminIdTiklarOlusturulanHastayaDeleteYaparVePopUptaDeleteButtonaTiklar() throws IOException {

        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(page.idTitle);
        ReusableMethods.waitFor(3);
        ReusableMethods.jsScrollClick(page.deleteButtonList.get(0));
        ReusableMethods.waitFor(3);
        ReusableMethods.jsScrollClick(page.alertDeleteButton);


}

    @And("YS {string} mesajinin gorundugunu dogrular")
    public void ysMesajininGorundugunuDogrular(String message) throws IOException {
        ReusableMethods.waitForVisibility(page.deleteMassagePatient,15);
        ReusableMethods.waitForClickablility(page.deleteMassagePatient,3);
        assertTrue(page.deleteMassagePatient.isDisplayed());
        ReusableMethods.getScreenshotWebElement("deletePatientSS", page.deleteMassagePatient);
    }


    @Then("YS admin gecersiz randevu tarihlerini secer")
    public void ysAdminGecersizRandevuTarihleriniSecer() {
        LocalDateTime date1 = LocalDateTime.now().minusDays(1).minusYears(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = formatter.format(date1);
        page.appointmentEndDate.sendKeys(date);
    }
}

