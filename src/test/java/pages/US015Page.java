package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US015Page {


    public US015Page(){

        PageFactory .initElements(Driver.getDriver(), this);
    }

    // US015

    @FindBy(css = "#account-menu>a")
    public WebElement accountMenu;
    @FindBy(id = "login-item")
    public WebElement signInId;
    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@name='username']") //css input[name=username]
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@name='password']") // css input[name=password]
    public WebElement passwordBox;
    @FindBy(css = ".btn.btn-primary") // xpath //*[@type='submit']
    public WebElement signInButton;


    @FindBy(css = "#entity-menu>a>span") //@FindBy(linkText = "Items&Titles")
    public WebElement itemsAndTitles;

    @FindBy(xpath = "//*[.='Patient']") //@FindBy(linkText = "Patient")
    public WebElement patientLink;

    @FindBy(css = "#jh-create-entity>span")  // xpath //*[@id='jh-create-entity']//span
    public WebElement createNewPatientButton;  //@FindBy(linkText = "Create a new Patient")

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstnameBoxPatient;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastnameBoxPatient;

    @FindBy(xpath = "//*[@id='patient-birthDate']")
    public WebElement birthDayBoxPatient;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> patientTableTitles;

    @FindBy(xpath = "//span//*[.='Edit']")
    public List<WebElement> editButtons;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailBoxPatient;

    @FindBy(xpath = "//*[@name='phone']")
    public WebElement phoneBoxPatient;

    @FindBy(xpath = "//*[@id='patient-gender']")
    public WebElement genderDdmPatient;

   @FindBy(xpath = "//*[@id='patient-gender']")  //Gender List
    public List<WebElement> listGenderDdmPatient;

    @FindBy(xpath = "//*[@id='patient-bloodGroup']")
    public WebElement bloodGroupDdmPatient;

    @FindBy(xpath = "//*[@id='patient-bloodGroup']") //BloodGroup List
    public List<WebElement> listBloodGroupDdmPatient;

    @FindBy(xpath = "//*[@id='patient-adress']")
    public WebElement addressBoxPatient;

    @FindBy(xpath = "//*[@id='patient-description']")
    public WebElement descriptionBoxPatient;

    @FindBy(xpath = "//*[@name='user.id']")
    public WebElement userDdmPatient;

    @FindBy(xpath = "//*[@id='patient-country']")
    public WebElement countryDdmPatient;

    @FindBy(xpath = "//*[@id='patient-cstate']")
    public WebElement stateDdmPatient;

    //  @FindBy(xpath = "//*[@id='save-entity']")
    //  public WebElement saveButtonPatient;
    //   @FindBy(xpath = "//*[@id='save-entity']//span")
    //   public WebElement saveButtonPatient;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButtonPatient;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement inPatientSaveMassagePatient;

    @FindBy(css = ".jh-card.card")
    public WebElement patientListTable;

    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement appointmentDdmPatient;

    @FindBy(xpath = "//*[text()='Create a new Appointment']")
    public WebElement appointmentCreate;

    @FindBy(xpath="//span[text()='Create a new Appointment']")
    public WebElement createANewAppointment;

    @FindBy(css = "#appointment-endDate")
    public WebElement appointmentEndDate;

    @FindBy(xpath="//span[text()='Diagnosis']")
    public WebElement Diagnosis;

    @FindBy(xpath="//select[@name='status']")
    public WebElement appointmentStatus;

    @FindBy(xpath="//select[@name='physician.id']")
    public WebElement appointmentDoctorSelect;

    @FindBy(xpath="//select[@name='patient.id']")
    public WebElement appointmentPatientSelect;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement appointmentSaveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement patientAlert;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']//span//*[.='Delete']")
    public List<WebElement> deleteButtonList;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm']//span//*[.='Delete'])[1]")
    public List<WebElement> firstDeleteButton;

    @FindBy(css = "#jhi-confirm-delete-patient>span")
    public WebElement alertDeleteButton;

    @FindBy(xpath = "//thead")
    public WebElement titles;

    @FindBy(xpath = "//th//*[.='ID']")
    public WebElement idTitle;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstnameFeedbackPatient;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastnameFeedbackPatient;

    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement mailFeedbackPatient;

    @FindBy(xpath = "//*[text()='Phone number is required.']")
    public WebElement phoneFeedbackPatient;

    @FindBy(xpath = "//span[text()='State/City']")
    public WebElement stateCityButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement saveMassagePatient;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement deleteMassagePatient;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-patient']")
    public WebElement deleteButtonSecond;

}
