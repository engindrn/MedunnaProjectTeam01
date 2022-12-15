package stepDefinitions.Ui;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.US028Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class US028StepDef {

    US028Page adminPage = new US028Page();
    List<String> silinmekIstenenUlkeIsmi = new ArrayList<>();
    String sutundakiTumUlkeler;

    SoftAssert softAssert=new SoftAssert();

    @Given("Kullanici Items&Titles butonunu tiklar ve Country secer")
    public void kullaniciItemsTitlesButonunuTiklarVeCountrySecer() {
        Driver.waitAndClick(adminPage.itemsTitlesButonu);
        ReusableMethods.waitFor(3);
        adminPage.countryButonu.click();
    }

    @Given("Kullanici Create a new Country butonunu tiklar")
    public void kullanici_create_a_new_country_butonunu_tiklar() {
        adminPage.createCountryButonu.click();

    }

    @Then("Kullanici gecerli ulke ismini yazar")
    public void kullanici_gecerli_ulke_ismini_yazar() {
        adminPage.createCountryNameButonu.sendKeys("YeniDunya");

    }

    @Then("Kullanici tarih ve saat girer.")
    public void kullanici_tarih_ve_saat_girer() {
        LocalDateTime tarihSaat = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("hh:mm a");
        adminPage.tarihSaatButonu.sendKeys(formatter.format(tarihSaat), formatterSaat.format(tarihSaat));
        //tarih saat

    }

    @Then("Kullanici Save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {
        adminPage.saveButonu.sendKeys(Keys.ENTER);
    }

    @And("Create a new Country butonunu gorur")
    public void createANewCountryButonunuGorur() {

        Assert.assertTrue(adminPage.createCountryButonu.isDisplayed());
    }

    @Given("Kullanici Items&Titles butonunu tiklar")
    public void kullaniciItemsTitlesButonunuTiklar() {
        Driver.waitAndClick(adminPage.itemsTitlesButonu);
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici State City butonunu secer")
    public void kullanici_state_city_butonunu_secer() {
        adminPage.stateCityButonu.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Kullanici Create a new State City butonunu tiklar")
    public void kullanici_create_a_new_state_city_butonunu_tiklar() {
        adminPage.createStateCityButonu.click();
        ReusableMethods.waitFor(1);

    }

    @Given("Kullanici gecerli eyalet sehir ismini yazar")
    public void kullanici_gecerli_eyalet_sehir_ismini_yazar() {
        adminPage.createStateCityNameButonu.sendKeys("Guzelyali");
        ReusableMethods.waitFor(1);

    }

    @Then("Kullanici gecerli ulke ismini secer")
    public void kullanici_gecerli_ulke_ismini_secer() {
        Driver.selectAnItemFromDropdown(adminPage.stateCitySecmeButonu, "YeniDunya");
    }
    @And("Kirmizi uyari yazisini goruyorsa kayit yapilmadi uyari yazisini alir")
    public void kirmiziUyariYazisiniGoruyorsaKayitYapilmadiUyariYazisiniAlir() {
        ReusableMethods.waitFor(3);
        String expectedText = "Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!";
        String actualText = adminPage.kirmiziUyariYazisi.getText();
        softAssert.assertTrue(actualText.contains(expectedText));
        softAssert.assertAll();
        System.out.println("Sehir kaydedilemedi");
    }

    @Given("Kullanici sectigi ulkenin delete butonuna tiklar")
    public void kullanici_sectigi_ulkenin_delete_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        silinmekIstenenUlkeIsmi.add("YeniDunya");

        List<String> sutundakiTumUlkeler = new ArrayList<>();
        for (WebElement each : adminPage.tumUlkeIsimleri
        ) {
            sutundakiTumUlkeler.add(each.getText());

        }
        System.out.println(sutundakiTumUlkeler);
        ReusableMethods.waitFor(5);
        for (int i = 0; i < silinmekIstenenUlkeIsmi.size(); i++) {
            Assert.assertTrue(sutundakiTumUlkeler.contains(silinmekIstenenUlkeIsmi.get(i)));
            ReusableMethods.hooverByJS(adminPage.deleteButonu);

        }

    }
    @Given("Kullanici Confirm delete operation ekranini gorur ve delete i tiklar")
    public void kullanici_confirm_delete_operation_ekranini_gorur_ve_delete_i_tiklar() {
        Assert.assertTrue(adminPage.deleteOperationYazisi.isDisplayed());
        adminPage.ikiciDeleteButonu.click();



    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Given("Kullanici ilgili test sayfasina gider")
    public void kullaniciIlgiliTestSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanici admin olarak giris yapar")
    public void kullaniciAdminOlarakGirisYapar() {
        adminPage.loginPageMenuButton.click();
        adminPage.loginPageSingInMenuButton.click();
        adminPage.loginPageSingInUserNameKutusu.sendKeys("team01");
        adminPage.loginPageSingInPasswordKutusu.sendKeys("team0101");
        adminPage.loginPageSingInSingInButton.click();
    }


}
