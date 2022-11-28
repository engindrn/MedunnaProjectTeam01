package stepDefinitions.Ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US001Page;
import pages.US002Page;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.ReusableMethods.*;

public class US002StepDef {

    US001Page us001;
    US002Page us002;
    Faker faker=new Faker();
    Actions actions;

    @And("Kullanici LastName kutusuna gecerli bir soyisim girer")
    public void kullaniciLastNameKutusunaGecerliBirSoyisimGirer() {
       String fakerLastname=faker.name().lastName();
        //us002.LastNameTextBox.sendKeys("Alim");
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(fakerLastname).perform();
    }

    @When("Kullanici UserName kutusuna tiklar ve bos birakir")
    public void kullanici_user_name_kutusuna_tiklar_ve_bos_birakir() {

    }



    @And("Kullanici UserName kutucuguna tiklar")
    public void kullaniciUserNameKutucugunaTiklar() {
        us002.userNameTextBox();
    }



    @And("Kullanici harfler ve rakamlardan olusan herhangi bir karakter sinirlamasina tabi tutulmayan {string} girilir ve Your username is invalid. uyari mesaji gorulur")
    public void kullaniciHarflerVeRakamlardanOlusanHerhangiBirKarakterSinirlamasinaTabiTutulmayanGirilirVeYourUsernameIsInvalidUyariMesajiGorulur(String arg0) {
        us002.GecersizOUserName(arg0);
    }


    @And("Kullanici harfler ve rakamlardan olusan {string} girilirer. ve Your username is invalid. uyari mesaji gorulmez")
    public void kullaniciHarflerVeRakamlardanOlusanGirilirerVeYourUsernameIsInvalidUyariMesajiGorulur(String arg0) {
        us002.GecersizUserName(arg0);
    }



    @And("Kullanici Email kutusunu bos birakinca Your email is required. uyarı mesajını görüntüler")
    public void kullaniciEmailKutusunuBosBirakincaYourEmailIsRequiredUyarıMesajınıGörüntüler() {
        us002.userNameTextBox();
        us002.emailRequiredMessage();
    }


}
