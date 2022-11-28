package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.waitFor;

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

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement ssnRequiredMessage;

    public US001Page ssnRequiredMessage() {
        assertTrue(ssnRequiredMessage.isDisplayed());
        return this;
    }

    public US001Page falseSsn(String karekter, String harf) throws InterruptedException {

        ssnTextBox.sendKeys(karekter + Keys.TAB);
        waitFor(2);
        assertTrue(ssnInvalidMessage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ssnTextBox.sendKeys(harf + Keys.TAB);
        waitFor(2);
        assertTrue(ssnInvalidMessage.isDisplayed());


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
        Thread.sleep(2000);

        return this;
    }

    @FindBy(xpath = "//input[@name='ssn']")

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


    public US001Page firstNameValidConfirm() {
        assertTrue(ValidSSn.isDisplayed());
        return this;
    }


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
        waitFor(2);
        lastNameTextBox.sendKeys(faker.name().lastName());
        return this;
    }

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredMessage;
    public US001Page lastNameRequiredMessage() {
        assertTrue(lastNameRequiredMessage.isDisplayed());
        return this;
    }


}
