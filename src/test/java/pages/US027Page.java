package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US027Page {
    public US027Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButon;

    @FindBy(xpath = "//a[@href='/c-message'][1]")
    public WebElement itemsTitlesMessagesButton;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm'][1]")
    public WebElement messagesPageIlkViewButton;

    @FindBy(xpath = "//span[@id='name']")
    public WebElement messagesViewNameWebElement;

    @FindBy(xpath = "//span[@id='email']")
    public WebElement messagesViewEmailWebElement;

    @FindBy(xpath = "//span[@id='message']")
    public WebElement messagesViewMessageWebElement;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewMessageButton;

    @FindBy(xpath = "//input[@id='c-message-name']")
    public WebElement nameForNewMessage;

    @FindBy(xpath = "//input[@id='c-message-email']")
    public WebElement emailForNewMessage;

    @FindBy(xpath = "//input[@id='c-message-subject']")
    public WebElement subjectForNewMessage;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement messageForNewMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public WebElement messagesPageIlkEditButton;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm'][1]")
    public WebElement messagesPageIlkDeleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cMessage']")
    public WebElement messagesPopUpDeleteButton;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement passwordPageSaveButton;

    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement ozelYesilUyariBalonu;




}
