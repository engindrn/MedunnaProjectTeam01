package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US017Page {
    public US017Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenuButonu;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public  WebElement signInButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton2;
    @FindBy (xpath = "//span[text()='Items&Titles']")
    public WebElement ItemsTitles;

    @FindBy(xpath="//span[text()='Test Item']")
    public WebElement TestItem;

    @FindBy(xpath="//span[text()='Create a new Test Item']")
    public WebElement CreateanewTestItem;

    @FindBy(xpath = "//input[@class='is-touched is-pristine av-invalid is-invalid form-control']")
    public WebElement testName;

    @FindBy(xpath = "//input[@id='c-test-item-description']")
    public WebElement Description;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement Price;

    @FindBy(xpath = "//input[@name='defaultValMin']")
    public WebElement defaultValMin;

    @FindBy(xpath = "//input[@name='defaultValMax']")
    public WebElement defaultValMax;

    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement Save;

    @FindBy(xpath = "//*[contains(text(),'The Appointment is updated with identifier 343044')]")
    public WebElement update;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/thead/tr/th[1]")
    public WebElement IDButton;

    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div/div[1]/div/table/tbody/tr[12]/td[1]/a")
    public WebElement GlukozID;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/a[2]")
    public WebElement testEditButton;

    @FindBy(xpath = "//span[text()='Created Date']")
    public WebElement CreateDate;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[8]/div/a[3]")
    public WebElement testDeleteButton;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement SignOut;

    @FindBy(xpath = "//span[text()='team01 team01']")
    public  WebElement team01Button;

    @FindBy(xpath = "//div[contains(text(),'A new Test Item is created with identifier')]")
    public WebElement testItemInvalid ;

    @FindBy(xpath = "//div[text()='Internal server error']")
    public WebElement InternalServerError;

}
