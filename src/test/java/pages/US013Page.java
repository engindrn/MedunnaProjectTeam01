package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US013Page {
    public US013Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public static WebElement accountMenuButonu;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public static WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public static WebElement signInButton2;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public static WebElement personelMyPages;
    @FindBy(xpath = "//span[text()='Search Patient']")
    public static WebElement searchPatient;
    @FindBy(xpath = "//input[@name='ssn']")
    public static WebElement patientSSN;
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public static WebElement showAppointments;
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[4]")
    public static WebElement showTests;
    @FindBy(xpath = "(//span[text()='View Results'])[2]")
    public static WebElement viewResults;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public static WebElement testResultEdit;
    @FindBy(xpath = "//input[@id='c-test-result-result']")
    public static WebElement hastaTestResult;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public static WebElement doctorMyPages;
    @FindBy(xpath = "//span[text()='My Appointments']")
    public static WebElement doctorMyAppointments;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public static WebElement hastaEdit;
    @FindBy(xpath = "//button[text()='Request Inpatient']")
    public static WebElement RequestInpatient;
    @FindBy (xpath = "//*[text()='Edit'][1]")
    public static WebElement editButton;
    @FindBy (xpath = "//input[@name='result']")
    public static WebElement resultTextBox;
    @FindBy (xpath = "//*[text()='Save']")
    public static WebElement saveButton;
    @FindBy (xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public static WebElement resultUpdateNotification;

}