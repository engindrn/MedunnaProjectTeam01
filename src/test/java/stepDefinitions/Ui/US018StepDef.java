package stepDefinitions.Ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US018Page;
import utilities.ConfigReader1;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;


public class US018StepDef {
    US018Page us018=new US018Page();
    Select select;


    @Given("Admin medunna_url sayfasina gider")
    public void admin_medunna_url_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader1.getProperty("medunna_url"));
        waitFor(1);
    }

        @When("Admin anasayfadaki kullanici ikonunun altindaki Sing in butonuna tiklar")
        public void admin_anasayfadaki_kullanici_ikonunun_altindaki_sing_in_butonuna_tiklar() {

            us018.KullaniciIkonu();
            Driver.waitAndClick(us018.signIn);

        }



    @When("Admin acilan sayfada username ve password girer ve Sing in butonuna tiklar")
    public void admin_acilan_sayfada_username_ve_password_girer_ve_sing_in_butonuna_tiklar() {
        us018.userName();
        us018.password();
        us018.signInButton.click();


    }
    @When("Admin acilan sayfada Items&Titles altindaki Physician butonuna tiklar")
    public void admin_acilan_sayfada_ıtems_titles_altindaki_physician_butonuna_tiklar() {
        Driver.waitAndClick(us018.itemsTitles);
        us018.physician.click();


    }
    @When("Admin acilan sayfada ilk siradaki doktorun bilgilerini gormek icin view butonuna tiklar")
    public void admin_acilan_sayfada_ilk_siradaki_doktorun_bilgilerini_gormek_icin_view_butonuna_tiklar() {
        us018.viewButonu.click();


    }
    @Then("Admin doktorun bilgilerini gorur")
    public void admin_doktorun_bilgilerini_gorur() {



    }

    // TC02

    @When("Admin create a new Physician butonuna tiklar")
    public void admin_create_a_new_physician_butonuna_tiklar() {
        us018.newPhysician.click();



    }
    @When("Admin Use Search box'a tik atar")
    public void admin_use_search_box_a_tik_atar() {
        us018.useSearchBox.click();

    }
    @When("Admin SSN box'a gecerli bir SSN girer")
    public void admin_ssn_box_a_gecerli_bir_ssn_girer() {
        us018.gecerliSsn();

    }
    @When("Admin Search User butonuna tiklar")
    public void admin_search_user_butonuna_tiklar() {
        us018.searchUser.click();



    }
    @Then("Admin User found with search SSN mesajini gorur")
    public void admin_user_found_with_search_ssn_mesajini_gorur() {
        us018.userFoundMessage();


    }

    @When("Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur")
    public void admin_doktorun_firstname_lastname_birth_date_gibi_bilgilerini_doldurur() {
        us018.lastName.click();
        waitFor(2);
            us018.firstName.clear();
            us018.firstName.sendKeys("Personel");
            waitFor(2);
            us018.lastName.clear();
            us018.lastName.sendKeys("team01");
            us018.birthDate.clear();
            us018.birthDate.sendKeys("01.01.1990");
            us018.phone.sendKeys("0555555555");
            us018.country();


    }
    @Then("Admin doktorun bilgilerini dogrular")
    public void admin_doktorun_bilgilerini_dogrular() {
        us018.validFirstName();
        us018.validLastName();
        us018.validBirthDate();
        us018.validPhone();
        us018.validCountry();

    }

    @When("Admin doktor icin bir uzmanlik alani secer")
    public void admin_doktor_icin_bir_uzmanlik_alani_secer() {
        us018.speciality();


    }
    @Then("Admin doktorun uzmanlik alanini dogrular")
    public void admin_doktorun_uzmanlik_alanini_dogrular() {
        us018.validSpeciality();

    }

    @When("Admin doktorun profil resmini saglar")
    public void admin_doktorun_profil_resmini_saglar() {
        us018.chooseFile();

    }
    @Then("Admin doktorun profil resmini dogrular")
    public void admin_doktorun_profil_resmini_dogrular() {
        us018.validProfil();

    }

    @When("Admin doktorun muayene ucretini girer")
    public void admin_doktorun_muayene_ucretini_girer() {
        us018.examFee();

    }

    @Then("Admin doktorun muayene ucretini dogrular")
    public void admin_doktorun_muayene_ucretini_dogrular() {
        us018.validExamFee();

    }

    @When("Admin mevcut kullanicilar arasindan doktoru secer")
    public void admin_mevcut_kullanicilar_arasindan_doktoru_secer() {
        us018.userDoktor();


    }
    @Then("Admin secilen doktoru dogrular")
    public void admin_secilen_doktoru_dogrular() {
        us018.validUserDoktor();

    }

    @When("Admin save butonuna tiklar")
    public void admin_save_butonuna_tiklar() {
        us018.saveButonu.click();

    }
    @Then("Admin doktorun kaydedilip kaydedilmedigini dogrular")
    public void admin_doktorun_kaydedilip_kaydedilmedigini_dogrular() {
        us018.sonSayfa();
        waitFor(2);
        Driver.getDriver().navigate().refresh();
        waitFor(2);
        us018.validDoktorKayit();

    }

    @When("Admin ilk siradaki doktorun bilgilerini duzenlemek icin edit butonuna tiklar")
    public void admin_ilk_siradaki_doktorun_bilgilerini_duzenlemek_icin_edit_butonuna_tiklar() {
        us018.editButonu.click();


    }
    @When("Admin doktorun firstname, lastname, birthDate gibi bilgilerini degistirir")
    public void admin_doktorun_firstname_lastname_birth_date_gibi_bilgilerini_degistirir() {

        us018.firstNameTextBox.clear();
        us018.firstNameTextBox.sendKeys("Personel");
        us018.lastName.clear();
        us018.lastName.sendKeys("team01");
        us018.birthDate.clear();
        us018.birthDate.sendKeys("01.01.1990");
        us018.examFee.clear();
        us018.examFee.sendKeys("350");
        us018.phone.clear();
        us018.phone.sendKeys("0555555555");

    }
    @Then("Admin A Physician is updated mesajini gorur")
    public void admin_a_physician_is_updated_mesajini_gorur() {
        us018.updateMessage();

    }


    @When("Admin ilk siradaki doktoru silmek icin delete butonuna tiklar")
    public void admin_ilk_siradaki_doktoru_silmek_icin_delete_butonuna_tiklar() {
        us018.deleteButonu.click();


    }
    @When("Admin acilan Confirm Delete Operation uyari mesajinda delete butonuna tiklar")
    public void admin_acilan_confirm_delete_operation_uyari_mesajinda_delete_butonuna_tiklar() {
        us018.confirmDeleteOperation.click();
        waitFor(5);

    }

    @And("Admin olusturdugu doktoru bulmak icin en son sayfaya gider")
    public void adminOlusturduguDoktoruBulmakIcinEnSonSayfayaGider() {

        us018.sonSayfa();

    }

    @And("Admin doktoru silmek icin delete butonuna tiklar")
    public void adminDoktoruSilmekIcinDeleteButonunaTiklar() {
        us018.deleteButonu.click();

    }

    @Then("Admin A Physician is deleted mesajini gorur")
    public void adminAPhysicianIsDeletedMesajiniGorur() {
        String actualText= us018.deletedMessage.getText();
        String expectedText="A Physician is deleted";
        System.out.println("alert yazisi :"+ us018.deletedMessage.getText());
        Assert.assertTrue(actualText.equals(expectedText));
        waitFor(2);

    }

}
