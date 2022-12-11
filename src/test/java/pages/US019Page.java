package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US019Page {

    public US019Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement ilkSayfaSingInButonu;
    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement userilkSayfaSingInYazisi;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement pencereSignInButonu;
    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;
    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;
    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButonu;
    @FindBy(xpath = "//a[text()='Request A Test']")
    public WebElement requestATest;
    @FindBy(xpath = "//*[@id='129700']")
    public WebElement glucoseCheckBox;
    @FindBy(xpath = "//*[@id='1402']")
    public WebElement ureaCheckBox;
    @FindBy(xpath = "//*[@id='1403']")
    public WebElement creatinineCheckBox;
    @FindBy(xpath = "//*[@id='1404']")
    public WebElement sodiumCheckBox;
    @FindBy(xpath = "//*[@id='1405']")
    public WebElement potassiumCheckBox;
    @FindBy(xpath = "//*[@id='1406']")
    public WebElement totalProteinCheckBox;
    @FindBy(xpath = "//*[@id='1407']")
    public WebElement albuminCheckBox;
    @FindBy(xpath = "//*[@id='1408']")
    public WebElement hemoglobinCheckBox;
    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButonu;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement testBasariMesaji;
    //Assert.assertTrue(staffPage.userFoundMessage.getText().contains("User found"));
    @FindBy(xpath = "(//*[text()='Glucose'])[1]")
    public WebElement glucoseText;
    @FindBy(xpath = "//*[text()='Urea']")
    public WebElement ureaText;
    @FindBy(xpath = "//*[text()='Creatinine']")
    public WebElement creatinineText;
    @FindBy(xpath = "(//*[text()='Sodium'])[2]")
    public WebElement sodiumText;
    @FindBy(xpath = "(//*[text()='Potassium'])[2]")
    public WebElement potassiumText;
    @FindBy(xpath = "//*[text()='Total protein']")
    public WebElement totalProteinText;
    @FindBy(xpath = "//*[text()='Albumin']")
    public WebElement albuminText;
    @FindBy(xpath = "(//*[text()='Hemoglobin'])[1]")
    public WebElement hemoglobinText;
    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResults;
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement viewResults;
    @FindBy(xpath = "//table//tr")
    public List<WebElement> basliklarList;
    @FindBy(xpath = "//button[text()='Request Inpatient']")
    public WebElement requestInpatient;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement inpatientBasariMesaji;
    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;
    @FindBy(xpath = "//*[@data-icon='user-nurse']")
    public WebElement staffButton;
    @FindBy(xpath = "//*[text()='»»']")
    public WebElement enSonaGit;
    @FindBy(xpath = "//*[@class='btn btn-danger btn-sm']")
    public List<WebElement> deleteList;
    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement userSignIcon;
    @FindBy(xpath = "//*[@href='/account/register']")
    public WebElement register;
    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement registerButton;
    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administration;
    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagement;
    @FindBy(xpath = "//*[text()='Edit']")
    public List <WebElement> editList;
    @FindBy(xpath = "//*[text()='ROLE_STAFF']")
    public WebElement roleStaff;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement staffSaveButonu;
    @FindBy(xpath = "//*[@id='activated']")
    public WebElement activatedCheckBox;
    @FindBy(xpath = "//*[text()='Create a new Staff']")
    public WebElement createANewStaff;
    @FindBy(xpath = "//*[@id='useSSNSearch']")
    public WebElement useSearchCheckBox;
    @FindBy(xpath = "//*[@id='searchSSN']")
    public WebElement ssnSearchBox;
    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUser;
    @FindBy(xpath = "//*[@id='staff-phone']")
    public WebElement staffPhone;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement cikis;
    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOut;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-staff']")
    public WebElement deleteOnayButonu;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement staffSilindiBasariMesaji;
    @FindBy(xpath = "//*[starts-with(text(), 'A new Staff is created with identifier')]")
    public WebElement staffOlusturulduMesaji;
    @FindBy(xpath = "//*[text()='Create a new user']")
    public WebElement createANewUser;
    @FindBy(xpath = "//*[@name='login']")
    public WebElement userLogin;
    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement userFoundBasariMesaji;
    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@name='birthDate']")
    public WebElement birthDate;
    @FindBy(xpath = "//*[@name='phone']")
    public WebElement phone;
    @FindBy(xpath = "//*[@name='gender']")
    public WebElement gender;
    @FindBy(xpath = "//*[@name='bloodGroup']")
    public WebElement bloodGroup;
    @FindBy(xpath = "//*[@name='adress']")
    public WebElement address;
    @FindBy(xpath = "//*[@id='staff-description']")
    public WebElement description;
    @FindBy(xpath = "//*[@name='createdDate']")
    public WebElement createdDate;
    @FindBy(xpath = "//*[@name='country.id']")
    public WebElement country;
    @FindBy(xpath = "//*[@name='cstate.id']")
    public WebElement stateCity;

    @FindBy(xpath = "(//*[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;
    @FindBy(xpath = "//*[text()='User']")
    public WebElement userBilgisi;

    @FindBy(xpath = "//*[@id='langKey']")
    public WebElement language;
    @FindBy(xpath = "//*[text()='English']")
    public WebElement english;
    @FindBy(xpath = "//*[text()='Türkçe']")
    public WebElement turkce;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;
    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement userGuncellendiBasariMesaji;
    @FindBy(xpath = "//*[starts-with(text(), 'Internal')]")
    public WebElement internalServer;



}
