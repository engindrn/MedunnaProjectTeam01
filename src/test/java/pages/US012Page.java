
package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US012Page {
    public US012Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement accountMenuButonu;
    @FindBy(id = "//span[text()='Sign in']")
    public  WebElement ersteSignIn;

    // @FindBy(xpath = "//button[@class='btn btn-primary']")
    // public static WebElement signInButton;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public  WebElement signInButton;
    @FindBy(xpath = "//input[@name='username']")
    public  WebElement userName;
    @FindBy(xpath = "//input[@name='password']")
    public  WebElement password;
    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public  WebElement endeSignIn;
    @FindBy(xpath = "//span[text()='My Appointments']")
    public  WebElement doctorMyAppointments;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public  WebElement hastaEdit;
    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement RequestATest;
    @FindBy(xpath = "//input[@name='1402']")
    public WebElement ure;
    @FindBy(xpath = "//input[@name='1407']")
    public WebElement albumin;
    @FindBy(xpath = "//input[@name='1408']")
    public WebElement hemoglobin;
    @FindBy(xpath = "//input[@name='132796']")
    public WebElement totalProtein;
    @FindBy(xpath = "//input[@name='132751']")
    public WebElement glucose;
    @FindBy(xpath = "//input[@name='1404']")
    public WebElement Sodium;
    @FindBy(xpath = "//input[@name='127908']")
    public WebElement Potasyum;
    @FindBy(xpath = "//input[@name='132793']")
    public WebElement Creatinine;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement SaveButton;
    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement testSave;
    @FindBy(xpath = "//h2[text()='Test Items']")
    public WebElement testItems;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement doctorMyPages;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInButton2;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;
    // @FindBy(xpath = "//span[normalize-space()='Sign in']")
    // public static WebElement signInButton;
    @FindBy(css = "[id='1402']")
    public WebElement testUrea;
    @FindBy(css = "[id='132751']")
    public WebElement testGlucose;
    @FindBy(css = "[id='1403']")
    public WebElement testCreatinine;
    @FindBy(css = "[id='1404']")
    public WebElement testSodium;
    @FindBy(css = "[id='1405']")
    public static WebElement testPotassium;
    @FindBy(css = "[id='1406']")
    public WebElement testTotalProtein;
    @FindBy(css = "[id='1407']")
    public WebElement testAlbumin;
    @FindBy(css = "[id='1408']")
    public WebElement testHemoglobin;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement testPageSaveButton;
    @FindBy(xpath = "//*//tbody//tr//td[2]")
    public WebElement nameList;
    @FindBy(xpath = "//div[@class=\"Toastify__toast-container Toastify__toast-container--top-left toastify-container\"]")
    public WebElement saveButtonBasariliGirisYazisi;
    @FindBy(xpath = "//*[contains(text(),'The Appointment is updated with identifier 303971')]")
    public WebElement update;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;
    @FindBy(xpath ="//input[@id='132000']")
    public WebElement docFirstTest;
    @FindBy(xpath ="//input[@id='306563']")
    public WebElement docGlucoTest;
    @FindBy(xpath ="//input[@id='1402']")
    public WebElement docUreaTest;
    @FindBy(xpath ="//input[@id='132793']")
    public WebElement docCreatinineTest;
    @FindBy(xpath ="//span[starts-with(text(),'Save')]")
    public WebElement docTestSave;
    @FindBy(xpath ="//div[starts-with(text(),'A new Test is created')]")
    public WebElement docTestApprove;
    @FindBy(xpath ="//select[@id='appointment-status']")
    public WebElement docAppointmentStatus;



}