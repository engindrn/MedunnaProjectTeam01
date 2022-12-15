package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US025Page {

    public US025Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement loginPageMenuButton;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement loginPageSingInMenuButton;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement loginPageSingInUserNameKutusu;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement loginPageSingInPasswordKutusu;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginPageSingInSingInButton;


    @FindBy (xpath = "//*[@id='firstName']")
    public WebElement firstNameKutusu;

    @FindBy (xpath = "//*[@name='ssn']")
    public WebElement ssnKutusu;

    @FindBy (xpath = "//*[@id='lastName']")
    public WebElement lastNameKutusu;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailKutusu;

    @FindBy (xpath = "//*[@id='phone']")
    public WebElement phoneKutusu;

    @FindBy (xpath="//input[@id='appoDate']")
    public WebElement appointmentDateSection;

    @FindBy (xpath = "//*[text()='Appointment date can not be past date!']")
    public WebElement appointmentDateCanNotBePaseDate;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy(css = ".Toastify__toast-body")
    public WebElement AppointmentRegistrationSaved;

    @FindBy (xpath = "//li[@id='entity-menu']")
    public WebElement myPagesPatientButtonEb;
    @FindBy(xpath="(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy (xpath = "//tbody//tr//td[3]")
    public List<WebElement> gecerliTarihlerListesi;

}
