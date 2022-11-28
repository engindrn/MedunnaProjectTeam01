package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US009Page {
    public US009Page() {
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

    @FindBy(xpath = "//*[text()='View']")
    public WebElement viewPatient;

    @FindBy(xpath = "//*[text()='123-45-4545']")
    public WebElement ssnValue;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editPatient;

    @FindBy(xpath = "//input[starts-with(@name,'firstName')]")
    public WebElement firstName;

    @FindBy(xpath = "//input[starts-with(@name,'lastName')]")
    public WebElement lastName;

    @FindBy(xpath = "//input[starts-with(@name,'birthDate')]")
    public WebElement birthDate;

    @FindBy(xpath = "//input[starts-with(@name,'email')]")
    public WebElement email;

    @FindBy(xpath = "//input[starts-with(@name,'phone')]")
    public WebElement phone;

    @FindBy (xpath = "//select[starts-with(@id,'patient-gender')]")
    public WebElement patientGender;

    @FindBy(xpath = "//select[starts-with(@id,'patient-bloodGroup')]")
    public WebElement patientBloodGroup;

    @FindBy(xpath = "//input[starts-with(@id,'patient-adress')]")
    public WebElement patientAddress;

    @FindBy(xpath = "//textarea[starts-with(@id,'patient-des')]")
    public WebElement patientDescription;

    @FindBy(xpath = "//select[starts-with(@name,'user.id')]")
    public WebElement userYeni;

    @FindBy(xpath = "//select[starts-with(@id,'patient-country')]")
    public WebElement country01;

    @FindBy(xpath = "//select[starts-with(@id,'patient-cstate')]")
    public WebElement cityState01;

    @FindBy(xpath = "//span[starts-with(text(),'Save')]")
    public WebElement saveButon;

    @FindBy(xpath = "//div[starts-with(@class,'Toastify__toast-body')]")
    public WebElement updatedYazisi;

    @FindBy(xpath = "//span[starts-with(text(),'Back')]")
    public WebElement backButon;

    @FindBy(xpath = "(//td)[11]")
    public WebElement viewdescription;

    //Patiend bilgileri
    @FindBy(xpath = "(//dd)[2]")
    public WebElement viewFirstName;

    @FindBy(xpath = "(//dd)[3]")
    public WebElement viewLastName;

    @FindBy(xpath = "(//dd)[4]")
    public WebElement viewBirthDate;

    @FindBy(xpath = "(//dd)[5]")
    public WebElement viewEmail;

    @FindBy(xpath = "(//dd)[6]")
    public WebElement viewGender;

    @FindBy(xpath = "(//dd)[7]")
    public WebElement viewBloodG;

    @FindBy(xpath = "(//dd)[8]")
    public WebElement viewAdress;

    @FindBy(xpath = "(//dd)[9]")
    public WebElement viewDescription;

    @FindBy(xpath = "(//dd)[11]")
    public WebElement viewUser;

    @FindBy(xpath = "(//dd)[12]")
    public WebElement viewCountry;

    @FindBy(xpath = "(//dd)[13]")
    public WebElement viewCity;
































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
