package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import static org.junit.Assert.assertTrue;

public class US001Page {
    public US001Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountButton;

    public US001Page accuntButton() {
        accountButton.click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement registerButton;

    public US001Page registerButton() {
        registerButton.click();
        return this;
    }

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    public US001Page ssnTextBox() throws InterruptedException {
        ssnTextBox.click();
        Thread.sleep(3000);
        return this;
    }

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredMessage;

    public US001Page ssnRequiredMessage() {
        assertTrue(ssnRequiredMessage.isDisplayed());
        return this;
    }

    public US001Page falseSsn(String karekter, String harf) throws InterruptedException {
        Thread.sleep(3000);
        ssnTextBox.sendKeys(karekter + Keys.TAB);
        assertTrue(ssnInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        Thread.sleep(3000);
        ssnTextBox.sendKeys(harf + Keys.TAB);
        assertTrue(ssnInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        Thread.sleep(3000);


        return this;
    }



    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement ssnInvalidMessage;

    public US001Page ssnInvalidMessage() {
        assertTrue(ssnInvalidMessage.isDisplayed());
        return this;
    }

    public US001Page YanlisSsn(String sayi1, String sayi2) throws InterruptedException {

        Thread.sleep(3000);
        ssnTextBox.sendKeys(sayi1 + Keys.TAB);
        assertTrue(ssnInvalidMessage.isDisplayed());
        Thread.sleep(3000);
        Driver.getDriver().navigate().refresh();
        Thread.sleep(3000);
        ssnTextBox.sendKeys(sayi2 + Keys.TAB);
        assertTrue(ssnInvalidMessage.isDisplayed());
        Thread.sleep(3000);
        Driver.getDriver().navigate().refresh();


        return this;
    }

    @FindBy(xpath = "//*[@class='is-touched is-dirty av-valid form-control']")

    public WebElement ValidSSn;

    public US001Page ValidSsn() {
        assertTrue(ValidSSn.isDisplayed());
        return this;
    }
    public US001Page GecerliSsn() throws InterruptedException {
        Thread.sleep(3000);
        String    sayi= faker.idNumber().ssnValid();
        ssnTextBox.sendKeys(sayi);
        return this;
    }

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    public US001Page firstNameTextBox() {
        firstNameTextBox.click();
        return this;
    }
    public US001Page karisikfirstName(String isim) {
        firstNameTextBox.sendKeys(isim);
        return this;
    }

    public US001Page validfirstName() {
        firstNameTextBox.sendKeys(faker.name().firstName());
        return this;
    }

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredMessage;
    public US001Page firstNameRequiredMessage() {
        assertTrue(firstNameRequiredMessage.isDisplayed());
        return this;
    }

    // @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    // public WebElement firstNameValidConfirm;

    public US001Page firstNameValidConfirm() {
        assertTrue(ValidSSn.isDisplayed());
        return this;
    }

    //input[@name='lastName']
    //div[text()='Your LastName is required.']

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;
    public US001Page lastNameTextBox() {
        lastNameTextBox.click();
        return this;
    }
    public US001Page karisiklastName(String karekter) {
        lastNameTextBox.sendKeys(karekter);
        return this;
    }
    public US001Page GecerlilastName() {
        lastNameTextBox.sendKeys(faker.name().lastName());
        return this;
    }

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredMessage;
    public US001Page lastNameRequiredMessage() {
        assertTrue(lastNameRequiredMessage.isDisplayed());
        return this;
    }
    public US001Page lastNameValidConfirm() {
        assertTrue(ValidSSn.isDisplayed());
        return this;
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement anaSayfaGirisIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anaSayfaSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement cikisIconu;

    @FindBy(xpath = "//span[normalize-space()='Sign out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//span[normalize-space()='Remember me']")
    public WebElement rememberMe;

    @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
    public WebElement forgetYourPassword;

    @FindBy(xpath = "//div[@role='dialog']//div[4]")
    public WebElement registeraNewAccount;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;
    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement kullaniciMenusu;

    @FindBy(xpath = "//span[normalize-space()='Settings']")
    public WebElement kullaniciSettingsButton;


    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement cikisButton;

    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement passwordChangeButton;


}
