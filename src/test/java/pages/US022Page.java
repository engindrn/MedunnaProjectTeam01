package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US022Page {
    public US022Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisSimgesi;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
    public WebElement searchPatient;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnBox;




    @FindBy(xpath = "//div[starts-with(@class,'Toastify__toast-body')]")
    public WebElement updatedYazisi;


    //Patient bilgileri
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement viewFirstName;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement viewLastName;

    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    public WebElement viewEmail;

    @FindBy(xpath = "//tbody/tr[1]/td[13]")
    public WebElement viewUser;


    @FindBy(xpath="//span[starts-with(text(),'Show Appointments')]")
    public WebElement showAppointments;

    @FindBy(xpath = "//span[starts-with(text(),'Show Tests')]")
    public WebElement showTests;

    @FindBy(xpath = "//span[starts-with(text(),'View Results')]")
    public WebElement viewResults;

    @FindBy(xpath = "//span[starts-with(text(),'Edit')]")
    public WebElement editTest;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement resultId;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement resultName;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement resultResult;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement resultDefaultMinValue;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement resultDefaultMaxValue;

    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    public WebElement resultTest;

    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    public WebElement resultDescription;

    @FindBy(xpath = "//tbody/tr[1]/td[8]")
    public WebElement resultDate;

    @FindBy(xpath = "//input[starts-with(@name,'id')]")
    public WebElement editId;

    @FindBy(xpath = "(//input[starts-with(@type,'datetime-local')])[1]")
    public WebElement editDate;

    @FindBy(xpath = "//input[starts-with(@name,'result')]")
    public WebElement editResult;

    @FindBy(xpath = "//input[starts-with(@name,'description')]")
    public WebElement editDescription;

    @FindBy(xpath = "//input[starts-with(@id,'c-test-result-createdDate')]")
    public WebElement editCreatedDate;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButonn;


































/*
//input[starts-with(@id,'first')]

js.executeScript("arguments[0].scrollIntoView(true);", auto.downloadInvoiceButton);
try {
     driver.findElement(By.linkText("Scans")).click();
  } catch (Exception e) {
     JavascriptExecutor executor = (JavascriptExecutor) driver;
     executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("Scans")));
  }

  //div[text()='Authentication information not correct.']

//div[contains(text(),'Authentication information not correct.')]

//a[@href="#appointment" and @class="btn-get-started scrollto"]
.nav-item>a[href="/service"]
li.nav-item>a[href="/doctors"]
li.nav-item>a[href*="tor"]
li.nav-item>a[href^="/ab"]
li.nav-item>a[href$="ct"]
li#entity-menu>div>a[href^='/st']
div[class="collapse navbar-collapse"] a[href$='ut']
li#entity-menu :nth-child(2) :first-child
li#entity-menu :nth-child(2)>a:nth-of-type(5)




 */


}

