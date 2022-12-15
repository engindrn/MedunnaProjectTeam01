package stepDefinitions.Ui;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US019Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US019Methods {


    static US019Page obje = new US019Page();
    static Actions actions = new Actions(Driver.getDriver());
    static Faker faker = new Faker();
    static String ssn = faker.idNumber().ssnValid();
    static String firstName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String username = faker.name().username();
    static String email = faker.internet().emailAddress();
    static String password = faker.internet().password();
    static String idNum;
    public static String locate;

    public static void main(String[] args) {

        personelOlusturmaMethodu();
        personelSilmeMethodu();
    }



    public static void personelOlusturmaMethodu() {

        ReusableMethods.waitFor(2);
        obje.administration.click();
        obje.userManagement.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.jsScrollClick(obje.createANewUser);
        obje.userLogin.sendKeys(username);
        actions.sendKeys(Keys.TAB, firstName).sendKeys(Keys.TAB, lastName).sendKeys(Keys.TAB, email).
                sendKeys(Keys.TAB, ssn).perform();
        ReusableMethods.jsScrollClick(obje.roleStaff);
        ReusableMethods.jsScrollClick(obje.staffSaveButonu);

        ReusableMethods.waitFor(2);

        obje.itemsTitles.click();
        obje.staffButton.click();
        obje.createANewStaff.click();
        obje.useSearchCheckBox.click();
        obje.ssnSearchBox.sendKeys(ssn);
        obje.searchUser.click();
        ReusableMethods.jsScrollClick(obje.staffPhone);
        obje.staffPhone.sendKeys("0123456789");
        ReusableMethods.jsScrollClick(obje.staffSaveButonu);
        ReusableMethods.waitForVisibility(obje.staffOlusturulduMesaji, 15);
        if (obje.staffOlusturulduMesaji.getText().contains("created")) {
            idNum = obje.staffOlusturulduMesaji.getText().replaceAll("\\D", "");
        }
        ReusableMethods.waitFor(1);
        locate = "//*[starts-with(@href, '/staff/" + idNum + "/delete')]";
    }

    public static void personelSilmeMethodu() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(obje.itemsTitles, 15);
        ReusableMethods.jsScrollClick(obje.enSonaGit);
        ReusableMethods.waitFor(2);
        WebElement delete = Driver.getDriver().findElement(By.xpath(locate));
        ReusableMethods.jsScrollClick(delete);
        ReusableMethods.waitFor(1);
        ReusableMethods.jsScrollClick(obje.deleteConfirm);
    }
}
