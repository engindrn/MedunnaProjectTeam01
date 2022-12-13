package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US021Page {

    public US021Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement dropDownSearchPatientButton ;

    @FindBy(xpath = "//a[@class='btn btn-warning btn-sm'][1]")
    public WebElement IlkSutunShowAppointmentsButton;
    @FindBy(xpath = "//a[@class='btn btn-warning btn-sm'][1]")
    public WebElement IlkAppointmentsEditButton;

    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement appointmentEditStartDateArea;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement appointmentEditEndDateArea;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement passwordPageSaveButton;

    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement YesilUyariButtonu;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement statusDropdownElement;

    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesisTextArea;
    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement treatmentTextArea;
    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement diagnosisTextArea;

    @FindBy(xpath = "//select[@id='appointment-physician']")
    public WebElement physicianDropdownElement;
}
