package stepDefinitions.Ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US020Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class US020StepDef {

    Faker faker = new Faker();
    Actions actions;
    String ssnNo1;
    String username;

    US020Page us020Page = new US020Page();

    @Given("Admin20 url adresine gider")
    public void admin20_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl022"));

    }

    @And("Admin20 Giris simgesine tiklar")
    public void admin20_giris_simgesine_tiklar() {
        us020Page.girisSimgesi.click();
    }

    @And("Admin20 Sign in simgesine tiklar")
    public void admin20_sign_in_simgesine_tiklar() {
        us020Page.signIn.click();

    }

    @And("Admin20 Username alanina gecerli bir username girer")
    public void admin20_username_alanina_gecerli_bir_username_girer() {

        us020Page.username.sendKeys(ConfigReader.getProperty("AdminUserName020"));

    }

    @And("Admin20 Password alanina gecerli bir password girer")
    public void admin20_password_alanina_gecerli_bir_password_girer() {
        us020Page.password.sendKeys(ConfigReader.getProperty("AdminPassword020"));

    }

    @And("Admin20 Sign in butonuna tiklar")
    public void admin20_sign_in_butonuna_tiklar() {
        us020Page.signInButton.click();

    }

    @And("Admin20 Items&Title butonunu tiklar")
    public void admin20_ıtems_title_butonunu_tiklar() throws InterruptedException {
        us020Page.itemsUndTitles.click();
        Thread.sleep(1000);

    }

    @And("Admin20 Patient butonuna tiklar")
    public void admin20_patient_butonuna_tiklar() {

        us020Page.patient.click();

    }

    @And("Admin20 kayitli Hastalarin firstname, lastname, email bilgilerinin goruldugunu dogrular.")
    public void admin20_kayitli_hastalarin_firstname_lastname_email_bilgilerinin_goruldugunu_dogrular() {
        Assert.assertTrue(us020Page.viewFirstName.isDisplayed());
        Assert.assertTrue(us020Page.viewLastName.isDisplayed());
        Assert.assertTrue(us020Page.viewEmail.isDisplayed());

    }

    @And("Admin20 Staff butonuna tiklar")
    public void admin20_staff_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        us020Page.itemsUndTitles.click();
        Thread.sleep(1000);

        WebElement staff = us020Page.staff;
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", staff);
        jse.executeScript("arguments[0].click();", staff);
        //us020Page.staff.click();

    }

    @And("Admin20 kayitli personellerin firstname, lastname, email bilgilerinin goruldugunu dogrular.")
    public void admin20_kayitli_stafflarin_personel_firstname_lastname_email_bilgilerinin_goruldugunu_dogrular() {
        Assert.assertTrue(us020Page.viewFirstName.isDisplayed());
        Assert.assertTrue(us020Page.viewLastName.isDisplayed());
        Assert.assertTrue(us020Page.viewEmail.isDisplayed());

    }

    @And("Admin20 Physician butonuna tiklar")
    public void admin20_physician_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        us020Page.itemsUndTitles.click();
        Thread.sleep(1000);
        us020Page.physician.click();

    }

    @Then("Admin20 kayitli Doktorlarin firstname, lastname, email bilgilerinin goruldugunu dogrular.")
    public void admin20_kayitli_physician_doktorlarin_firstname_lastname_email_bilgilerinin_goruldugunu_dogrular() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us020Page.viewFirstName.isDisplayed());
        Assert.assertTrue(us020Page.viewLastName.isDisplayed());
        Assert.assertTrue(us020Page.viewEmail.isDisplayed());

    }

    @Given("Kullanici20 url adresine gider")
    public void kullanici20_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl022"));

    }


    @Given("Kullanici20 Giris simgesine tiklar")
    public void kullanici20_giris_simgesine_tiklar() {
        us020Page.girisSimgesi.click();


    }

    @Given("Kullanici20 Register simgesine tiklar")
    public void kullanici20_register_simgesine_tiklar() {
        us020Page.register.click();

    }


    @Given("Kullanici20 Faker Class ile yeni kayit olusturur")
    public void kullanici20_faker_class_ile_yeni_kayit_olusturur() throws InterruptedException {


        Random r = new Random();
        int sayi1 = r.nextInt(1000);
        int sayi2 = r.nextInt(10000);
        ssnNo1 = sayi1 + "-38-" + sayi2;

        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        username = firstname + "_" + lastname + "abc";
        String email = firstname + lastname + "abc@gmail.com";
        String passWord = firstname + lastname + "abc01.";

        us020Page.ssnBoxRegister.sendKeys(ssnNo1);
        us020Page.firstNameRegister.sendKeys(firstname);
        us020Page.lastNameRegister.sendKeys(lastname);
        us020Page.userNameRegister.sendKeys(username);
        us020Page.emailRegister.sendKeys(email);
        us020Page.firstPass.sendKeys(passWord);
        us020Page.secondPass.sendKeys(passWord);
        us020Page.registerButton.click();
        Thread.sleep(6000);


    }

    @Given("Kullanici20 sayfayi kapatir")
    public void kullanici20_browseri_kapatir() {

        Driver.closeDriver();
    }

    @Given("Admin20 Administration butonunu tiklar")
    public void admin20_administration_butonunu_tiklar() {
        us020Page.administration.click();


    }

    @Given("Admin20 User Managment butonuna tiklar")
    public void admin20_user_managment_butonuna_tiklar() {

        us020Page.userManagment.click();
    }

    @Given("Admin20 User listesinin son sayfasina gider")
    public void admin20_user_listesinin_son_sayfasina_gider() throws InterruptedException {



        Thread.sleep(2000);
        us020Page.sonSayfa.click();
        System.out.println(ssnNo1);
        Thread.sleep(2000);
    }

    @Given("Admin20 Kullanici20'nin olusturdugu yeni kayitta edit butonuna basar")
    public void admin20_kullanici20_nin_olusturdugu_yeni_kayitta_edit_butonuna_basar() throws InterruptedException {

        Thread.sleep(2000);
        us020Page.editButon.click();

    }

    @Given("Admin20 actived kutusunu isaretler")
    public void admin20_actived_kutusunu_isaretler() throws InterruptedException {
        Thread.sleep(6000);
        us020Page.activatedButon.click();

    }

    @Given("Admin20 profiles sekmesinden rol olarak patienti secer")
    public void admin20_profiles_sekmesinden_rol_olarak_patienti_secer() throws InterruptedException {
        Thread.sleep(6000);
        us020Page.rolPatien.click();


    }

    @Given("Admin20 Save butonuna tiklar")
    public void admin20_save_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(6000);
        us020Page.saveButonEdit.click();

    }


    @Given("Admin20 user sayfasinin sonuna gider")
    public void admin20_user_sayfasinin_sonuna_gider() throws InterruptedException {
        Thread.sleep(6000);
        us020Page.sonSayfa.click();
    }

    @Then("Admin20 yeni kaydin actived edildigini ve rolunun patient oldugunu dogrular")
    public void admin20_yeni_kaydin_actived_edildigini_ve_rolunun_patient_oldugunu_dogrular() throws InterruptedException {

        System.out.println(us020Page.activedDogrulama.getText());
        Assert.assertEquals("activated",us020Page.activedDogrulama.getText());

    }


    @And("Admin20 kayitli kullanicida Delete butonuna tiklar")
    public void adminKayitliKullanicidaDeleteButonunaTiklar() throws InterruptedException {
        Thread.sleep(6000);
        us020Page.delete_Button.click();
        //Driver.getDriver().switchTo().alert().accept();
        us020Page.deleteOnaylama.click();

    }

    @And("Admin20 kulanicinin silindigini dogrular")
    public void adminKulanicininSilindiginiDogrular() {
        Assert.assertNotEquals(username,us020Page.username.getAttribute("value"));
    }
}
