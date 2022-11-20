package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US004Page {

    public US004Page() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id="account-menu")
    public WebElement accountMenu;
    @FindBy(id="login-item")
    public WebElement signIn;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(id="rememberMe")
    public WebElement rememberMe;
    @FindBy(xpath = "//*[text()='Did you forget your password?']")
    public WebElement forgetPassword;
    @FindBy(xpath = "//*[text()='Register a new account']")
    public WebElement registerNewAccount;
    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancel;
    @FindBy (xpath = "//*[text()='Reset your password']")
    public WebElement resetYourPassword;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(id = "register-title")
    public WebElement registration;
    @FindBy (xpath = "//*[text()='Authentication information not correct.']")
    public WebElement authenticationNotCorrect;






}
