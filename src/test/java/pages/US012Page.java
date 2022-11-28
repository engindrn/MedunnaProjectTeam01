
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
    public static WebElement accountMenuButonu;
    @FindBy(id = "//span[text()='Sign in']")
    public static WebElement ersteSignIn;

    // @FindBy(xpath = "//button[@class='btn btn-primary']")
    // public static WebElement signInButton;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public static WebElement signInButton;
    @FindBy(xpath = "//input[@name='username']")
    public static WebElement userName;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement password;
    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public static WebElement endeSignIn;
    @FindBy(xpath = "//span[text()='My Appointments']")
    public static WebElement doctorMyAppointments;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public static WebElement hastaEdit;
    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public static WebElement RequestATest;
    @FindBy(xpath = "//input[@name='1402']")
    public static WebElement ure;
    @FindBy(xpath = "//input[@name='1407']")
    public static WebElement albumin;
    @FindBy(xpath = "//input[@name='1408']")
    public static WebElement hemoglobin;
    @FindBy(xpath = "//input[@name='132796']")
    public static WebElement totalProtein;
    @FindBy(xpath = "//input[@name='132751']")
    public static WebElement glucose;
    @FindBy(xpath = "//input[@name='1404']")
    public static WebElement Sodium;
    @FindBy(xpath = "//input[@name='127908']")
    public static WebElement Potasyum;
    @FindBy(xpath = "//input[@name='132793']")
    public static WebElement Creatinine;
    @FindBy(xpath = "//span[text()='Save']")
    public static WebElement SaveButton;
    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public static WebElement testSave;
    @FindBy(xpath = "//h2[text()='Test Items']")
    public static WebElement testItems;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public static WebElement doctorMyPages;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public static WebElement signInButton2;
    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameTextBox;
    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordTextBox;
    // @FindBy(xpath = "//span[normalize-space()='Sign in']")
    // public static WebElement signInButton;
    @FindBy(css = "[id='1402']")
    public static WebElement testUrea;
    @FindBy(css = "[id='132751']")
    public static WebElement testGlucose;
    @FindBy(css = "[id='1403']")
    public static WebElement testCreatinine;
    @FindBy(css = "[id='1404']")
    public static WebElement testSodium;
    @FindBy(css = "[id='1405']")
    public static WebElement testPotassium;
    @FindBy(css = "[id='1406']")
    public static WebElement testTotalProtein;
    @FindBy(css = "[id='1407']")
    public static WebElement testAlbumin;
    @FindBy(css = "[id='1408']")
    public static WebElement testHemoglobin;
    @FindBy(xpath = "//*[text()='Save']")
    public static WebElement testPageSaveButton;
    @FindBy(xpath = "//*//tbody//tr//td[2]")
    public static WebElement nameList;
    @FindBy(xpath = "//div[@class=\"Toastify__toast-container Toastify__toast-container--top-left toastify-container\"]")
    public static WebElement saveButtonBasariliGirisYazisi;
    @FindBy(xpath = "//*[contains(text(),'The Appointment is updated with identifier 303971')]")
    public static WebElement update;
    @FindBy(xpath = "//*[text()='Save']")
    public static WebElement save;
    @FindBy(xpath ="//input[@id='132000']")
    public static WebElement docFirstTest;
    @FindBy(xpath ="//input[@id='306563']")
    public static WebElement docGlucoTest;
    @FindBy(xpath ="//input[@id='1402']")
    public static WebElement docUreaTest;
    @FindBy(xpath ="//input[@id='132793']")
    public static WebElement docCreatinineTest;
    @FindBy(xpath ="//span[starts-with(text(),'Save')]")
    public static WebElement docTestSave;
    @FindBy(xpath ="//div[starts-with(text(),'A new Test is created')]")
    public static WebElement docTestApprove;
    @FindBy(xpath ="//select[@id='appointment-status']")
    public WebElement docAppointmentStatus;



}