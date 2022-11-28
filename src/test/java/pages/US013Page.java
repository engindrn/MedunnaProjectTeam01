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
    public WebElement accountMenuButonu;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInButton2;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement personelMyPages;
    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatient;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSSN;
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public WebElement showAppointments;
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[4]")
    public WebElement showTests;
    @FindBy(xpath = "(//span[text()='View Results'])[2]")
    public WebElement viewResults;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement testResultEdit;
    @FindBy(xpath = "//input[@id='c-test-result-result']")
    public WebElement hastaTestResult;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement doctorMyPages;
    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement doctorMyAppointments;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement hastaEdit;
    @FindBy(xpath = "//button[text()='Request Inpatient']")
    public WebElement RequestInpatient;
    @FindBy (xpath = "//*[text()='Edit'][1]")
    public WebElement editButton;
    @FindBy (xpath = "//input[@name='result']")
    public WebElement resultTextBox;
    @FindBy (xpath = "//*[text()='Save']")
    public WebElement saveButton;
    @FindBy (xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement resultUpdateNotification;

}