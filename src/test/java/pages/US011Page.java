package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US011Page {

    public US011Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement imge;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signin;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signIn;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement edit;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//*[contains(text(),'The Appointment is updated with identifier 303971')]")
    public WebElement update;

    @FindBy(xpath = "//*[text()='303971']")
    public WebElement hastaId;

    @FindBy(xpath = "//*[text()='16/11/22 01:00']")
    public WebElement startDate;

    @FindBy(xpath = "//*[text()='16/11/22 02:00']")
    public WebElement endDate;

    @FindBy(xpath = "//*[text()='COMPLETED']")
    public WebElement status;

    @FindBy(xpath = "//*[text()='Doktor']")
    public WebElement physician;

    @FindBy(xpath = "//*[text()='Hasta']")
    public WebElement patient;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath = "(//*[text()='This field is required.'])[1]")
    public WebElement anamnesisWarning;

    @FindBy(xpath = "(//*[text()='This field is required.'])[2]")
    public WebElement treatmentWarning;

    @FindBy(xpath = "(//*[text()='This field is required.'])[3]")
    public WebElement diagnosisWarning;

    @FindBy(xpath = "//*[@id='appointment-prescription']")
    public WebElement prescription;

    @FindBy(xpath = "//*[@id='appointment-description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public WebElement statusoptional;

    @FindBy(xpath = "//*[text()='Create or Edit an Appointment']")
    public WebElement create;


}
