package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US010Page {

    public US010Page() {

        PageFactory.initElements(Driver.getDriver(),this);
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
    @FindBy(css = "li[id='entity-menu'] a[class='d-flex align-items-center dropdown-toggle nav-link'] span")
    public WebElement myPages;
    @FindBy (xpath = "(//span[normalize-space()='My Appointments'])[1]")
    public WebElement myAppointments;
    @FindBy (xpath = "//input[@id='toDate']")
    public WebElement toDate;
    @FindBy (xpath = "//input[@id='fromDate']")
    public WebElement fromDate;
    @FindBy (xpath = "//tbody/tr/td[1]")
    public WebElement id ;
    @FindBy (xpath = "//tbody/tr/td[2]")
    public WebElement startdate;
    @FindBy (xpath = "//tbody/tr/td[3]")
    public WebElement enddate;
    @FindBy (xpath = "//tbody/tr/td[4]")
    public WebElement status;
    @FindBy (css = "div[class=table-responsive]")
    public WebElement listTable;
}
