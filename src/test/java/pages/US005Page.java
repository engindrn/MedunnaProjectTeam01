package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US005Page {
    public US005Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Make an']")
    public WebElement makeAnAppointmentButton;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[starts-with(@id,'ap')]")
    public WebElement tarih;
    @FindBy(xpath = "//*[text()='Send an Appointment Request']")
    public WebElement SendAnAppointmentRequestButton;
    @FindBy(css = ".Toastify__toast-body")
    public WebElement AppointmentRegistrationSaved;
    @FindBy(css = ".invalid-feedback")
    public WebElement required;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement lastNameIsRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement ssnIsRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement emailIsRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement firstNameIsRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneIsRequired;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;
    @FindBy(id = "login-item")
    public WebElement signIn;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement hastaAdiSoyadi;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy (xpath="(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    public WebElement id;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumber;


}