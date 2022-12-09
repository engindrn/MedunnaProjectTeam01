package stepDefinitions.Ui;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US009Page;
import utilities.ConfigReader1;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US009StepDef {

    US009Page us009Page = new US009Page();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


    @Given("Personel09 Medunna ana sayfasinda")
    public void personel_medunna_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader1.getProperty("medunnaUrl09"));
    }

    @When("Personel09 Giris simgesini tiklar")
    public void personel_giris_simgesini_tiklar() {
        us009Page.girisSimgesi.click();

    }

    @And("Personel09 Sign in simgesini tiklar")
    public void personel_sign_in_simgesini_tiklar() {
        us009Page.signIn.click();

    }

    @And("Personel09 username alanina gecerli bir username girer")
    public void personel_username_alanina_gecerli_bir_username_girer() {
        us009Page.username.sendKeys(ConfigReader1.getProperty("personelUserName09"));

    }

    @And("Personel09 password alanina gecerli bir password girer")
    public void personel_password_alanina_gecerli_bir_password_girer() {
        us009Page.password.sendKeys(ConfigReader1.getProperty("personelPassword09"));

    }

    @And("Personel09 Signin butonuna tiklar")
    public void personel_signin_butonuna_tiklar() {
        us009Page.signInButton.click();

    }

    @And("Personel09 My Pages butonunu tiklar")
    public void personel_my_pages_butonunu_tiklar() {
        us009Page.myPages.click();

    }

    @And("Personel09 Patient butonuna tiklar")
    public void personel_patient_butonuna_tiklar() {
        us009Page.searchPatient.click();

    }

    @And("acilan sayfada search kutusuna aranacak hasta SSN numarasini girer")
    public void acilan_sayfada_search_kutusuna_aranacak_hasta_ssn_numarasini_girer() throws InterruptedException {
        us009Page.ssnBox.sendKeys(ConfigReader1.getProperty("ssnHasta01"));
        Thread.sleep(1000);


    }


    @Then("Aranan SSN numarali hastanin bilgilerinin goruldugunu dogrular")
    public void aranan_ssn_numarali_hastanin_bilgilerinin_goruldugunu_dogrular() {
        us009Page.viewPatient.click();
        Driver.getDriver().findElement(By.xpath("(//dd)[1]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[2]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[3]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[4]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[5]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[6]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[7]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[8]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[9]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[10]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[11]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[12]")).isDisplayed();
        Driver.getDriver().findElement(By.xpath("(//dd)[13]")).isDisplayed();


    }


    @And("Personel09 girilen SSN Numarali hastada edit butonuna tiklar")
    public void personelGirilenSSNNumaraliHastadaEditButonunaTiklar() {
        us009Page.editPatient.click();
    }

    @And("First Name' i istenen first name ile degistirir")
    public void firstNameIIstenenFirstNameIleDegistirir() {
        us009Page.firstName.clear();
        us009Page.firstName.sendKeys(ConfigReader1.getProperty("firstName01"));
    }

    @And("Last Name' i istenen last name ile degistirir")
    public void lastNameIIstenenLastNameIleDegistirir() {
        us009Page.lastName.clear();
        us009Page.lastName.sendKeys(ConfigReader1.getProperty("lastName01"));

    }

    @And("Birth Date'i istenen Birth Date ile degistirir")
    public void birthDateIIstenenBirthDateIleDegistirir() {
        us009Page.birthDate.clear();
        us009Page.birthDate.sendKeys(ConfigReader1.getProperty("birthDate01"));
    }

    @And("Emai'i istenen email ile degistirir")
    public void emaiIIstenenEmailIleDegistirir() {
        us009Page.email.clear();
        us009Page.email.sendKeys(ConfigReader1.getProperty("email01"));

    }

    @And("Phone'u istenen Phone ile degistirir")
    public void phoneUIstenenPhoneIleDegistirir() {
        us009Page.phone.clear();
        us009Page.phone.sendKeys(ConfigReader1.getProperty("phone01"));

    }

    @And("Gender'i istenen Gender ile degistirir")
    public void genderIIstenenGenderIleDegistirir() {
        us009Page.patientGender.click();

        WebElement FEMALE = us009Page.patientGender;
        jse.executeScript("arguments[0].scrollIntoView(true);", FEMALE);
        jse.executeScript("arguments[0].click();", FEMALE);

    }

    @And("Blood Group' u istenen blood grup ile degistirir")
    public void bloodGroupUIstenenBloodGrupIleDegistirir() {
        WebElement ddm = us009Page.patientBloodGroup;
        Select options = new Select(ddm);
        options.selectByIndex(3);

    }

    @And("Address' i istenen adres ile degistirir")
    public void addressIIstenenAdresIleDegistirir() {
        us009Page.patientAddress.clear();
        us009Page.patientAddress.sendKeys(ConfigReader1.getProperty("adress01"));

    }

    @And("Description'u istenen description ile degistirir")
    public void descriptionUIstenenDescriptionIleDegistirir() {
        us009Page.patientDescription.clear();
        us009Page.patientDescription.sendKeys(ConfigReader1.getProperty("description01"));

    }

    @And("User'i istenen user ile degistirir")
    public void userIIstenenUserIleDegistirir() throws InterruptedException {
        Thread.sleep(1000);
        /*
        WebElement ddm = us009Page.userYeni;
        us009Page.userYeni.click();
      Select s = new Select(us009Page.userYeni);
      List<WebElement> op = s.getOptions();
      List<String> options = new ArrayList<>();
      for (int i = 0; i < op.size(); i++) {
          options.add(op.get(i).getText());
      }
      for (int i = 0; i < options.size(); i++) {
          Select s1 = new Select(ddm);
          if (options.get(i).contains("mustafa")) {

              s1.selectByValue("mustafa");
           }
          Thread.sleep(1000);
       }

         */

        us009Page.country01.sendKeys(ConfigReader1.getProperty("user01"));


    }

    @And("Country bilgisini  istenen country ile degistirir")
    public void countryBilgisiniIstenenCountryIleDegistirir() throws InterruptedException {
        Thread.sleep(1000);
        us009Page.country01.sendKeys(ConfigReader1.getProperty("country01"));
        Thread.sleep(1000);

    }

    @And("State-city bilgisini istenen State bilgisi ile degistirir")
    public void stateCityBilgisiniIstenenStateBilgisiIleDegistirir() throws InterruptedException {
        WebElement ddm = us009Page.cityState01;
        us009Page.cityState01.click();
        System.out.println("*****");
        Select s = new Select(us009Page.cityState01);
        List<WebElement> op = s.getOptions();
        List<String> options = new ArrayList<>();
        for (int i = 0; i < op.size(); i++) {
            options.add(op.get(i).getText());
        }
        for (int i = 0; i < options.size(); i++) {
            Select s1 = new Select(ddm);
            if (options.get(i).contains("Berlin")) {

                s1.selectByValue("Berlin");
            }
            Thread.sleep(1000);
        }
        System.out.println("*****");
        System.out.println("");
        System.out.println("====");


    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        us009Page.saveButon.click();

    }

    @And("Patient is Updated yazisini gorur")
    public void patientIsUpdatedYazisiniGorur() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(us009Page.updatedYazisi));
        Assert.assertTrue(us009Page.updatedYazisi.isDisplayed());


    }

    @Then("Hasta bilgilerinin degistigini dogrular")
    public void tumHastaBilgilerininDegistiginiDogrular() throws InterruptedException {

        Thread.sleep(1000);


        String yeniFirstname = Driver.getDriver().findElement(By.xpath("(//dd)[2]")).getText();
        String yeniLastname = Driver.getDriver().findElement(By.xpath("(//dd)[3]")).getText();
        String yeniGender = Driver.getDriver().findElement(By.xpath("(//dd)[6]")).getText();
        String yeniBloodGroup = Driver.getDriver().findElement(By.xpath("(//dd)[7]")).getText();
        String yeniAddress = Driver.getDriver().findElement(By.xpath("(//dd)[8]")).getText();
        String yeniDescription = Driver.getDriver().findElement(By.xpath("(//dd)[9]")).getText();
        String yeniUser = Driver.getDriver().findElement(By.xpath("(//dd)[11]")).getText();
        String yeniCountry = Driver.getDriver().findElement(By.xpath("(//dd)[12]")).getText();
        String yeniCity = Driver.getDriver().findElement(By.xpath("(//dd)[13]")).getText();

        Assert.assertEquals("yeniFirstName", yeniFirstname);
        Assert.assertEquals("yeniLastName", yeniLastname);
        Assert.assertEquals("MALE", yeniGender);
        Assert.assertEquals("Bnegative", yeniBloodGroup);
        Assert.assertEquals("yeniAdres str. 5", yeniAddress);
        Assert.assertEquals("Description degisti", yeniDescription);
        Assert.assertNotEquals("mustafa_personel", yeniUser);
        Assert.assertEquals("Germany", yeniCountry);
        Assert.assertNotEquals("Berlin", yeniCity);


    }

    @And("Acilan sayfada search kutusuna aranacak hasta SSN numarasini girer")
    public void acilanSayfadaSearchKutusunaAranacakHastaSSNNumarasiniGirer() throws InterruptedException {
        us009Page.ssnBox.sendKeys(ConfigReader1.getProperty("ssnHasta02"));
        Thread.sleep(1000);

    }


    @Then("Aranan SSN numarali hastanin kayit bilgilerini doldurdugunu dogrular")
    public void arananSSNNumaraliHastaninKayitBilgileriniDoldurdugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td)[2]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td)[3]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td)[4]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td)[6]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td)[7]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td)[13]")).isDisplayed());

    }


    @And("Acilan sayfada search kutusuna hasta SSN numarasini girer")
    public void acilanSayfadaSearchKutusunaHastaSSNNumarasiniGirer() throws InterruptedException {
        us009Page.ssnBox.clear();
        us009Page.ssnBox.sendKeys(ConfigReader1.getProperty("ssnHasta03"));
        Thread.sleep(1000);

    }

    @And("Hastanin Description bilgisini siler")
    public void hastaninDescriptionBilgisiniSiler() {
        us009Page.patientDescription.clear();

    }

    @Then("Description bilgisinin silindigini dogrular")
    public void descriptionBilgisininSilindiginiDogrular() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(us009Page.updatedYazisi));
        Assert.assertTrue(us009Page.updatedYazisi.isDisplayed());


        String expectedData = "";
        String actualData = Driver.getDriver().findElement(By.xpath("(//dd)[9]")).getText();
        Assert.assertEquals(expectedData, actualData);


    }
}
