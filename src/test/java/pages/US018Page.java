package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.waitFor;

public class US018Page {

    public US018Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Select select;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement KullaniciIkonu;

    public US018Page KullaniciIkonu() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)");

        KullaniciIkonu.click();
        return this;
    }



    @FindBy(id = "login-item")
    public WebElement signIn;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameTextBox;

    public US018Page userNameTextBox() {

        userNameTextBox.click();

        return this;
    }

    public US018Page userName() {

        String username = "team01";
        userNameTextBox.sendKeys(username);

        return this;
    }



    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    public US018Page passwordTextBox() {

        passwordTextBox.click();

        return this;
    }

    public US018Page password() {

        String password = "team0101";
        passwordTextBox.sendKeys(password);

        return this;
    }
    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement ssNSearchBox;
    public US018Page ssNSearchBox(){
        ssNSearchBox.click();
        return  this;

    }

    public US018Page gecerliSsn() {
        String gecerliSsn = "600-60-6001";

        ssNSearchBox.sendKeys(gecerliSsn);
        return this;
    }

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement userFoundMessage;
    public US018Page  userFoundMessage(){
        userFoundMessage.isDisplayed();
        return this;
    }



    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@value='Personel']")
    public WebElement validFirstName;
    public US018Page validFirstName() {

        assertTrue(validFirstName.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@value='team01']")
    public WebElement validlastName;
    public US018Page validLastName() {

        assertTrue(validlastName.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDate;
    @FindBy(xpath = "//input[@value='1990-01-01']")
    public WebElement validBirthDate;
    public US018Page validBirthDate() {

        assertTrue(validBirthDate.isDisplayed());
        return this;
    }


    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@value='0555555555']")
    public WebElement validPhone;
    public US018Page validPhone() {

        assertTrue(validPhone.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//select[@id='physician-country']")
    public WebElement country;
    public US018Page country(){
        select = new Select(country);
        select.selectByValue("80065");
        select.getFirstSelectedOption().click();

        return this;
    }

    @FindBy(xpath = "//option[@value='80065']")
    public WebElement validCountry;
    public US018Page validCountry(){


        assertTrue(validCountry.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement speciality ;
    public US018Page speciality (){

        select=new Select(speciality);
        select.selectByValue("DERMATOLOGY");
        select.getFirstSelectedOption().click();
        return this;
    }
    @FindBy(xpath = "//option[@value='DERMATOLOGY']")
    public WebElement validSpeciality ;
    public US018Page validSpeciality (){

        assertTrue(validSpeciality.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement chooseFile;
    public US018Page chooseFile() {
        String path = "C:\\Users\\PC\\Downloads\\profil.jpg";
        chooseFile.sendKeys(path);

    return this;
    }

    @FindBy(xpath = "//*[@style='max-height: 100px;']")
    public WebElement validProfil;
    public US018Page validProfil() {
       assertTrue(validProfil.isDisplayed());

        return this;
    }

    @FindBy(xpath = "//input[@id='physician-examFee']")
    public WebElement examFee;
    public US018Page examFee() {
        examFee.sendKeys("350");

        return this;
    }
    @FindBy(xpath = "//*[@value='350']")
    public WebElement validExamFee;
    public US018Page validExamFee() {
        assertTrue(validExamFee.isDisplayed());

        return this;
    }

    @FindBy(xpath = "//*[@id='physician-user']")
    public WebElement userDoktor;
    public US018Page userDoktor () {
        select=new Select(userDoktor);
        select.selectByValue("10635");
        select.getFirstSelectedOption().click();


        return this;
    }


    @FindBy(xpath = "//option[@value='10635']")
    public WebElement validUserDoktor;
    public US018Page validUserDoktor () {
        assertTrue(validUserDoktor.isDisplayed());


        return this;
    }
    @FindBy(xpath = "(//*[@class='page-link'])[9]")
    public WebElement sonSayfa;
    public US018Page sonSayfa (){
        sonSayfa.click();

        return this;
    }
    @FindBy(xpath = "//*[text()='600-60-6001']")
    public WebElement validDoktorKayit ;
    public US018Page validDoktorKayit (){
        assertTrue(validDoktorKayit.isDisplayed());

        return this;
    }
    @FindBy(xpath = " //div[@role='alert']")
    public List<WebElement> physicianCreated;
    @FindBy(xpath = " //div[@role='alert']")
    public WebElement updateMessage;
    public US018Page updateMessage() {
        waitFor(2);

        assertTrue(updateMessage.isDisplayed());

        return this;
    }

    @FindBy(xpath = "//tbody//tr//td[18]//a[@class='btn btn-danger btn-sm']")
    public List<WebElement> sonDoktorDeleteButonu;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement ilkSiradakideleteButonu;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement deletedMessage;


    @FindBy(xpath = "//button[@id='jhi-confirm-delete-physician']")
    public WebElement confirmDeleteOperation;



    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButonu;
    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButonu ;
    @FindBy(xpath = "//input[@name='adress']")
    public WebElement adress;
    @FindBy(xpath = "//select[@id='physician-gender']")
    public WebElement genderDdm;
    @FindBy(xpath = "//select[@id='physician-bloodGroup']")
    public WebElement bloodGroupDdm;
    @FindBy(xpath = "//input[@id='physician-description']")
    public WebElement description;
    @FindBy(xpath = "//*[@id=\"physician-firstName\"]")
    public WebElement firstNameTextBox ;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;
    @FindBy(xpath = "(//*[text()='Physician'])[1]")
    public WebElement physician;
    @FindBy(xpath = "(//*[text()='View'])[1]")
    public WebElement viewButonu;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement newPhysician;
    @FindBy(xpath = "//input[@id='useSSNSearch']")
    public WebElement useSearchBox;
    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUser;
















}
