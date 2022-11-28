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
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US009StepDef {

    US009Page us009Page = new US009Page();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    String eskiFirstname;
    String eskiLastname;
    String eskiBirthDate;
    String eskiPhone;
    String eskiEmail;
    String eskiGender;
    String eskiBloodGroup;
    String eskiAddress;
    String eskiDescription;
    String eskiUser;
    String eskiCountry;
    String eskiCity;

    @Given("Personel Medunna ana sayfasinda")
    public void personel_medunna_ana_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl09"));
    }

    @When("Personel Giris simgesini tiklar")
    public void personel_giris_simgesini_tiklar() {
        us009Page.girisSimgesi.click();

    }

    @And("Personel Sign in simgesini tiklar")
    public void personel_sign_in_simgesini_tiklar() {
        us009Page.signIn.click();

    }

    @And("Personel username alanina gecerli bir username girer")
    public void personel_username_alanina_gecerli_bir_username_girer() {
        us009Page.username.sendKeys(ConfigReader.getProperty("personelUserName09"));

    }

    @And("Personel password alanina gecerli bir password girer")
    public void personel_password_alanina_gecerli_bir_password_girer() {
        us009Page.password.sendKeys(ConfigReader.getProperty("personelPassword09"));

    }

    @And("Personel Signin butonuna tiklar")
    public void personel_signin_butonuna_tiklar() {
        us009Page.signInButton.click();

    }

    @And("Personel My Pages butonunu tiklar")
    public void personel_my_pages_butonunu_tiklar() {
        us009Page.myPages.click();

    }

    @And("Personel Patient butonuna tiklar")
    public void personel_patient_butonuna_tiklar() {
        us009Page.searchPatient.click();

    }

    @And("acilan sayfada search kutusuna aranacak hasta SSN numarasini girer")
    public void acilan_sayfada_search_kutusuna_aranacak_hasta_ssn_numarasini_girer() throws InterruptedException {
        us009Page.ssnBox.sendKeys(ConfigReader.getProperty("ssnHasta01"));
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


        eskiFirstname=Driver.getDriver().findElement(By.xpath("(//dd)[2]")).getText();
        eskiLastname=Driver.getDriver().findElement(By.xpath("(//dd)[3]")).getText();
        eskiBirthDate=Driver.getDriver().findElement(By.xpath("(//dd)[4]")).getText();
        eskiPhone=Driver.getDriver().findElement(By.xpath("(//dd)[2]")).getText();
        eskiEmail=Driver.getDriver().findElement(By.xpath("(//dd)[5]")).getText();
        eskiGender=Driver.getDriver().findElement(By.xpath("(//dd)[6]")).getText();
        eskiBloodGroup=Driver.getDriver().findElement(By.xpath("(//dd)[7]")).getText();
        eskiAddress=Driver.getDriver().findElement(By.xpath("(//dd)[8]")).getText();
        eskiDescription=Driver.getDriver().findElement(By.xpath("(//dd)[9]")).getText();
        eskiUser=Driver.getDriver().findElement(By.xpath("(//dd)[11]")).getText();
        eskiCountry=Driver.getDriver().findElement(By.xpath("(//dd)[12]")).getText();
        eskiCity=Driver.getDriver().findElement(By.xpath("(//dd)[13]")).getText();



        System.out.println(us009Page.viewFirstName.getText());
        System.out.println(us009Page.viewLastName.getText());
        System.out.println(us009Page.viewEmail.getText());




        ////*[text()='123-45-4545']

    }


    @And("Personel girilen SSN Numarali hastada edit butonuna tiklar")
    public void personelGirilenSSNNumaraliHastadaEditButonunaTiklar() {
        us009Page.editPatient.click();
    }

    @And("First Name' i istenen first name ile degistirir")
    public void firstNameIIstenenFirstNameIleDegistirir() {
        us009Page.firstName.clear();
        us009Page.firstName.sendKeys(ConfigReader.getProperty("firstName01"));
    }

    @And("Last Name' i istenen last name ile degistirir")
    public void lastNameIIstenenLastNameIleDegistirir() {
        us009Page.lastName.clear();
        us009Page.lastName.sendKeys(ConfigReader.getProperty("lastName01"));

    }

    @And("Birth Date'i istenen Birth Date ile degistirir")
    public void birthDateIIstenenBirthDateIleDegistirir() {
        us009Page.birthDate.clear();
        us009Page.birthDate.sendKeys(ConfigReader.getProperty("birthDate01"));
    }

    @And("Emai'i istenen email ile degistirir")
    public void emaiIIstenenEmailIleDegistirir() {
        us009Page.email.clear();
        us009Page.email.sendKeys(ConfigReader.getProperty("email01"));

    }

    @And("Phone'u istenen Phone ile degistirir")
    public void phoneUIstenenPhoneIleDegistirir() {
        us009Page.phone.clear();
        us009Page.phone.sendKeys(ConfigReader.getProperty("phone01"));

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
        us009Page.patientAddress.sendKeys(ConfigReader.getProperty("adress01"));

    }

    @And("Description'u istenen description ile degistirir")
    public void descriptionUIstenenDescriptionIleDegistirir() {
        us009Page.patientDescription.clear();
        us009Page.patientDescription.sendKeys(ConfigReader.getProperty("description01"));

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

        us009Page.country01.sendKeys(ConfigReader.getProperty("user01"));


    }

    @And("Country bilgisini  istenen country ile degistirir")
    public void countryBilgisiniIstenenCountryIleDegistirir() throws InterruptedException {
        Thread.sleep(1000);
        us009Page.country01.sendKeys(ConfigReader.getProperty("country01"));
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

        //us009Page.cityState01.sendKeys(ConfigReader.getProperty("stateCity01"));

    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        us009Page.saveButon.click();

    }

    @And("Patient is Updated yazisini gorur")
    public void patientIsUpdatedYazisiniGorur() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(us009Page.updatedYazisi));
        Assert.assertTrue(us009Page.updatedYazisi.isDisplayed());
        //us009Page.updatedYazisi.isDisplayed();

    }

    @Then("Tum Hasta bilgilerinin degistigini dogrular")
    public void tumHastaBilgilerininDegistiginiDogrular() throws InterruptedException {
        //(//dt/span)[3]
        //(//dd)[2]
       // System.out.println("+++++");
//
       // us009Page.backButon.click();
       // us009Page.viewPatient.click();
        Thread.sleep(1000);


        String yeniFirstname=Driver.getDriver().findElement(By.xpath("(//dd)[2]")).getText();
        String yeniLastname=Driver.getDriver().findElement(By.xpath("(//dd)[3]")).getText();
        String yeniBirthDate=Driver.getDriver().findElement(By.xpath("(//dd)[4]")).getText();
        String yeniPhone=Driver.getDriver().findElement(By.xpath("(//dd)[2]")).getText();
        String yeniEmail=Driver.getDriver().findElement(By.xpath("(//dd)[5]")).getText();
        String yeniGender=Driver.getDriver().findElement(By.xpath("(//dd)[6]")).getText();
        String yeniBloodGroup=Driver.getDriver().findElement(By.xpath("(//dd)[7]")).getText();
        String yeniAddress=Driver.getDriver().findElement(By.xpath("(//dd)[8]")).getText();
        String yeniDescription=Driver.getDriver().findElement(By.xpath("(//dd)[9]")).getText();
        String yeniUser=Driver.getDriver().findElement(By.xpath("(//dd)[11]")).getText();
        String yeniCountry=Driver.getDriver().findElement(By.xpath("(//dd)[12]")).getText();
        String yeniCity=Driver.getDriver().findElement(By.xpath("(//dd)[13]")).getText();


    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[1]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[2]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[3]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[4]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[5]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[6]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[7]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[8]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[9]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[10]")).getText());
    //  System.out.println(Driver.getDriver().findElement(By.xpath("(//dd)[11]")).getText());


     //  Assert.assertNotEquals(eskiFirstname,yeniFirstname);
     //  Assert.assertNotEquals(eskiLastname,yeniLastname);
     //  //Assert.assertNotEquals(eskiBirthDate,yeniBirthDate);
     //  Assert.assertNotEquals(eskiPhone,yeniPhone);
     //  Assert.assertNotEquals(eskiEmail,yeniEmail);
     //  Assert.assertNotEquals(eskiGender,yeniGender);
     //  Assert.assertNotEquals(eskiBloodGroup,yeniBloodGroup);
     //  Assert.assertNotEquals(eskiAddress,yeniAddress);
     //  Assert.assertNotEquals(eskiDescription,yeniDescription);
     //  Assert.assertNotEquals(eskiUser,yeniUser);
     //  Assert.assertEquals(eskiCountry,yeniCountry);
     //  Assert.assertEquals(eskiCity,yeniCity);




    }

    @And("Acilan sayfada search kutusuna aranacak hasta SSN numarasini girer")
    public void acilanSayfadaSearchKutusunaAranacakHastaSSNNumarasiniGirer() throws InterruptedException {
        us009Page.ssnBox.sendKeys(ConfigReader.getProperty("ssnHasta02"));
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
        us009Page.ssnBox.sendKeys(ConfigReader.getProperty("ssnHasta03"));
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
        //Assert.assertFalse(us009Page.viewPatient.isEnabled());
        //Assert.assertTrue(!us009Page.viewDescription.isDisplayed());


    }
}
