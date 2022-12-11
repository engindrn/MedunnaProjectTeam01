package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US016Page {

    public US016Page(){

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

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement items;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement room;

    @FindBy(xpath = "//span[text()='Create a new Room']")
    public WebElement create;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy(xpath = "//*[@id='room-roomType']")
    public WebElement roomType;

    @FindBy(css = "#room-price")
    public WebElement roomPrice;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//*[contains(text(),'A new Room is created with identifier')]")
    public WebElement roomIsCreate;

    @FindBy(css = "#room-status")
    public WebElement roomStatus;

    @FindBy(xpath = "(//div[text()='This field is required.'])[2]")
    public WebElement priceYazi;

    @FindBy(css = "#room-description")
    public WebElement roomDescription;

    @FindBy(css = "#room-createdDate")
    public WebElement createdDate;

    @FindBy(xpath = "//span[text()='Room Type']")
    public WebElement roomTypeHeader;

    @FindBy(xpath = "(//span[text()='TWIN'])[1]")
    public WebElement roomType1;

    @FindBy(xpath = "(//span[text()='TWIN'])[2]")
    public WebElement roomType2;

    @FindBy(xpath = "(//span[text()='TWIN'])[3]")
    public WebElement roomType3;

    @FindBy(xpath = "//*[text()='1']")
    public WebElement roomPage;

    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement roomEdit;

    @FindBy(xpath = "//*[contains(text(),'A Room is updated with identifier')]")
    public WebElement roomUpdate;

    @FindBy(xpath = "//*[text()='1']")
    public WebElement roomPageSon;

    @FindBy(xpath = "(//*[text()='Delete'])[5]")
    public WebElement roomDelete;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-room']")
    public WebElement roomDelete2;

    @FindBy(xpath = "//*[contains(text(),'A Room is deleted with identifier')]")
    public WebElement roomDeleteYazi;



}
