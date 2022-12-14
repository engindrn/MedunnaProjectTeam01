package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US024Page {

    public US024Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="account-menu")
    public WebElement accountMenu;

    @FindBy(id="login-item")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myAppointments;

    @FindBy(xpath = "(//*[text()='Show Tests'])[3]")
    public WebElement showTests;

    @FindBy(xpath = "(//*[text()='Show Invoice'])[2]")
    public WebElement showInvoice;

    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement viewResults;

    @FindBy (xpath = "//tbody//td[1]")
    public WebElement id;

    @FindBy (xpath = "//tbody//td[1]")
    public WebElement testID;

    @FindBy (xpath = "//tbody//td[2]")
    public WebElement testName;

    @FindBy (xpath = "//tbody//td[4]")
    public WebElement minValue;

    @FindBy (xpath = "//tbody//td[5]")
    public WebElement maxvalue;

    @FindBy (xpath = "//tbody//td[7]")
    public WebElement descrption;

    @FindBy(xpath = "//thead//tr[3]//th[2]")
    public WebElement invoiceDate;

    @FindBy (xpath = "//tbody//td[8]")
    public WebElement dateTest;

    @FindBy(id="fromDate")
    public WebElement fromDate;

    @FindBy(id="toDate")
    public WebElement toDate;




}
