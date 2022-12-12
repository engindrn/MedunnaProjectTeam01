package stepDefinitions.Ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US025Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US025UIStepDef {

    US025Page us025Page = new US025Page();


    @Given("KullaniciSu ilgili test sayfasina gider")
    public void kullaniciSuIlgiliTestSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    public static void hooverByJS(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", element);
        jse.executeScript("arguments[0].click();", element);
    }

    @Then("KullaniciSu hasta olarak giris yapar")
    public void kullaniciHastaOlarakGirisYapar() {
        us025Page.loginPageMenuButton.click();
        us025Page.loginPageSingInMenuButton.click();
        us025Page.loginPageSingInUserNameKutusu.sendKeys("Hastateam01");
        us025Page.loginPageSingInPasswordKutusu.sendKeys("Hastateam.01");
        us025Page.loginPageSingInSingInButton.click();
    }
    @Then("KullaniciSu FirstName bolumune ismini girer")
    public void kullanici_first_name_bolumune_ismini_girer() {
        us025Page.firstNameKutusu.clear();
        us025Page.firstNameKutusu.sendKeys(ConfigReader.getProperty("hastaFirstName"));
    }
    @Then("KullaniciSu LastName bolumune soy ismini girer")
    public void kullanici_last_name_bolumune_soy_ismini_girer() {
        us025Page.lastNameKutusu.clear();
        us025Page.lastNameKutusu.sendKeys(ConfigReader.getProperty("hastaLastName"));
    }
    @Then("KullaniciSu SSN bolumune gecerli bir SSN girer")
    public void kullanici_ssn_bolumune_gecerli_bir_ssn_girer() {
        us025Page.ssnKutusu.clear();
        us025Page.ssnKutusu.sendKeys(ConfigReader.getProperty("hastaSSN"));
    }
    @Then("KullaniciSu email bolumune email girer")
    public void kullanici_email_bolumune_email_girer() {
        us025Page.emailKutusu.clear();
        us025Page.emailKutusu.sendKeys(ConfigReader.getProperty("hastaEmail"));
    }
    @Then("KullaniciSu Phone bolumune gecerli bir tel nosu girer")
    public void kullanici_phone_bolumune_gecerli_bir_tel_nosu_girer() {
        us025Page.phoneKutusu.clear();
        String phoneNumber = "123-958-0050";
        us025Page.phoneKutusu.sendKeys(phoneNumber);
    }
    @Then("KullaniciSu date bolumunde guncel bir tarih secer")
    public void kullanici_date_bolumunde_guncel_bir_tarih_secer() {

        us025Page.appointmentDateSection.sendKeys("28.12.2022");
    }

    @Then("KullaniciSu Send an Appointment Request butonuna tiklar")
    public void kullanici_send_an_appointment_request_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        hooverByJS(us025Page.sendAnAppointmentRequestButton);

    }
    @Then("KullaniciSu Randevu olusturuldugunu kontrol eder")
    public void kullanicisu_randevu_tarihi_olusturuldugunu_kontrol_eder() {
        ReusableMethods.waitForVisibility(us025Page.AppointmentRegistrationSaved, 3);
        Assert.assertTrue(us025Page.AppointmentRegistrationSaved.isDisplayed());
    }
    @Then("KullaniciSu sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("KullaniciSu date bolumunde gecmis tarih secer")
    public void kullanici_date_bolumunde_gecmis_tarih_secer() {

        us025Page.appointmentDateSection.sendKeys("08.06.2022");
    }
    @Then("KullaniciSu Randevu tarihi gecmis tarih olamaz yazisini gorur")
    public void kullanici_gecmis_tarihten_gun_secemedigini_dogrular() {
        ReusableMethods.waitForVisibility(us025Page.appointmentDateCanNotBePaseDate, 3);
        Assert.assertTrue(us025Page.appointmentDateCanNotBePaseDate.isDisplayed());


    }
    @Then("KullaniciSu ekranda Appointment registration saved mesajini gorememeli")
    public void kullaniciEkrandaAppointmentRegistrationSavedMesajiniGorememeli() {

        Assert.assertFalse("Appointment registration saved mesaji görüldü", us025Page.AppointmentRegistrationSaved.isDisplayed());
    }
    @Then("KullaniciSu MyPages sekmesine tiklar")
    public void kullanici_my_pages_sekmesine_tiklar() {
        us025Page.myPagesPatientButtonEb.click();

    }
    @Then("KullaniciSu MyAppointment secenegini secer")
    public void kullanici_my_appointment_secenegini_secer() {

        us025Page.myAppointments.click();
    }
    @Then("KullaniciSu tarihin formatini dogrular")
    public void kullanici_tarihin_formatini_dogrular() {

        Actions action = new Actions(Driver.getDriver());

        for (int i = 0; i < 3; i++) {
            action.sendKeys(Keys.PAGE_DOWN);
        }
        String guncelDate = "02/12/22";
        String gelecekDate = "07/12/22";

        List<String> gecerlitarihlerinListesi = new ArrayList<>();

        for (int i = 0; i < us025Page.gecerliTarihlerListesi.size(); i++) {
            gecerlitarihlerinListesi.add(us025Page.gecerliTarihlerListesi.get(i).getText().substring(0, 8));
            ReusableMethods.waitFor(1);
            System.out.println(gecerlitarihlerinListesi.get(i));

        }
        Assert.assertTrue(gecerlitarihlerinListesi.contains(guncelDate));
        Assert.assertTrue(gecerlitarihlerinListesi.contains(gelecekDate));
    }


}
