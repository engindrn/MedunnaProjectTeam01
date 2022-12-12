package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Random;

public class US020Page {
    String ssnNo1;
    public US020Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisSimgesi;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsUndTitles;

    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement patient;

    @FindBy(xpath = "//*[text()='Staff']")
    public WebElement staff;

    @FindBy(xpath = "//*[text()='Physician']")
    public WebElement physician;







    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssnBoxRegister;




    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstNameRegister;
    //lastName username firstPassword

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastNameRegister;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userNameRegister;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailRegister;

    @FindBy(xpath = "//*[@name='firstPassword']")
    public WebElement firstPass;

    @FindBy(xpath = "//*[@name='secondPassword']")
    public WebElement secondPass;

    @FindBy(xpath = "(//span[text()='Register'])[2]")
    public WebElement registerButton;


    //Administration
    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagment;

    @FindBy(xpath = "(//*[@class='hand'])[1]")
    public WebElement sonSayfa;

    //   //a[starts-with(@href,'/admin/user-management/deshawn.feeney/edit')]

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[2]")
    public WebElement editButon;

    @FindBy(xpath = "//*[@id='activated']")
    public WebElement activatedButon;

    @FindBy(xpath = "//*[@id='authorities']/option[3]")
    public WebElement rolPatien;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButonEdit;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement activedDogrulama;

    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    public WebElement rolDogrulama;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[3]")
    public WebElement delete_Button;

    @FindBy(xpath = "(//*[text()='Delete'])[21]")
    public WebElement deleteOnaylama;






    public void ssnNo() {
        Random r=new Random();
        int sayi1=r.nextInt(1000);
        int sayi2=r.nextInt(10000);

        String ssnNo1=sayi1+"-34-"+sayi2;

    }





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


