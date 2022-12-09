package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US001Page;
import pages.US002Page;
import pages.US018Page;
import utilities.ConfigReader1;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class US001StepDef {
    US001Page us001 = new US001Page();
    US002Page us002 = new US002Page();
    US018Page us018 = new US018Page();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader1.getProperty("medunna_url"));
        waitFor(3);
    }

    @Given("Kullanici Anasayfada kullanici ikonuna tiklar")
    public void kullanici_anasayfada_kullanici_ikonuna_tiklar() {

        us001.accuntButton();

    }

    @Given("Kullanici ikonu altindaki register'i tiklar")
    public void kullanici_ikonu_altindaki_register_i_tiklar() {
        us001.registerButton();
    }

    @When("Kullanici SSN kutucuguna tiklar ve bos birakir")
    public void kullaniciSSNKutucugunaTiklarVeBosBirakir() {
        us001.ssnTextBox.click();

    }


    @Then("KUllanici SSN kutucugunu bos birakinca {string} uyari mesajini goruntuler")
    public void k_ullanici_ssn_kutucugunu_bos_birakinca_uyari_mesajini_goruntuler(String string) {
        us001.ssnRequiredMessage();
    }


    @Then("Kullanici Your SSN is invalid' uyari mesajini goruntuler")
    public void kullanici_your_ssn_is_invalid_uyari_mesajini_goruntuler() {
        us001.ssnInvalidMessage();

    }

    @And("Kullanici acilan sayfada SSN kutusu icerisine {string}lerden ve {string}lerden  olusan SSN girer")
    public void kullaniciAcilanSayfadaSSNKutusuIcerisineLerdenVeLerdenOlusanSSNGirer(String karekter, String harf) throws InterruptedException {
        us001.falseSsn(karekter, harf);
    }


    @And("Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer")
    public void kullaniciAcilanSayfadaSSNKutusununIcerisineDokuzRakamdanOlusanVeUcuncuVeBesinciRakamdanSonraIcerenBirSSNGirer() throws InterruptedException {
        us001.GecerliSsn();
    }


    @And("Kullanici browseri kapatir")
    public void kullaniciBrowseriKapatir() {
        Driver.closeDriver();
    }

    @And("Kullanici acilan sayfada SSN kutusunun icerisine {string}rakam girer yada {string}  iceren bir SSN girer")
    public void kullaniciAcilanSayfadaSSNKutusununIcerisineRakamGirerYadaIcerenBirSSNGirer(String sayi1, String sayi2) throws InterruptedException {
        us001.YanlisSsn(sayi1, sayi2);
    }


    @And("Kullanici dogru SSN girdigini dogrular")
    public void kullaniciDogruSSNGirdiginiDogrular() throws InterruptedException {
        us001.ValidSsn();

    }

    @Then("Kullanici FirstName kutusuna tiklar")
    public void kullaniciFirstNameKutusunaTiklar() {
        us001.firstNameTextBox();
    }

    @Then("Kullanici FirstName kutusuna tiklar ve bos birakir")
    public void kullaniciFirstNameKutusunaTiklarVeBosBirakir() {
        us001.firstNameTextBox();
    }


    @And("Kullanici LastName kutusuna tiklar")
    public void kullaniciLastNameKutusunaTiklar() {
        us001.lastNameTextBox();

    }

    @And("Kullanici FirstName kutucugunu bos birakinca Your FirstName is required. uyari mesajini goruntuler")
    public void kullaniciFirstNameKutucugunuBosBirakincaYourFirstNameIsRequiredUyariMesajiniGoruntuler() {
        us001.firstNameRequiredMessage();
    }

    @And("Kullanici FirstName kutusunun icerisine herhangi bir {string} olusan isim girer")
    public void kullaniciFirstNameKutusununIcerisineHerhangiBirOlusanIsimGirer(String arg0) {
        us001.karisikfirstName(arg0);
    }

    @And("Kullanici dogru Firstname girdigini dogrular")
    public void kullaniciDogruFirstnameGirdiginiDogrular() {
        us001.firstNameValidConfirm();
    }

    @Then("Kullanici FirstName kutusuna gecerli bir isim girer")
    public void kullaniciFirstNameKutusunaGecerliBirIsimGirer() {

        us001.validfirstName();

    }

    @And("Kullanici LastName kutusuna tiklar ve bos birakir")
    public void kullaniciLastNameKutusunaTiklarVeBosBirakir() {
        us001.lastNameTextBox();

    }

    @And("Kullanici User name kutusuna tiklar")
    public void kullaniciUserNameKutusunaTiklar() {
        us002.userNameTextBox();

    }

    @Then("Kullanici Email kutusuna tiklar")
    public void kullaniciEmailKutusunaTiklar() {
        us002.emailTextBox();
        waitFor(5);


    }

    @And("Kullanici Username kutusunu bos birakinca Your username is required uyari mesajini goruntuler")
    public void kullaniciUsernameKutusunuBosBirakincaYourUsernameIsRequiredUyariMesajiniGoruntuler() throws InterruptedException {
        us002.userNameRequiredMessage();
    }

    @And("KUllanici LastName kutucugunu bos birakinca Your LastName is required. uyari mesajini goruntuler")
    public void kullaniciLastNameKutucugunuBosBirakincaYourLastNameIsRequiredUyariMesajiniGoruntuler() {
        us001.lastNameRequiredMessage();
    }

    @Then("Kullanici Last Name kutusuna herhangi bir {string} olusan soyisim girer")
    public void kullaniciLastNameKutusunaHerhangiBirOlusanSoyisimGirer(String arg0) {
        us001.karisiklastName(arg0);
    }

    @And("Kullanici dogru LastName girdigini dogrular")
    public void kullaniciDogruLastNameGirdiginiDogrular() {
        us001.validfirstName();
    }


    @And("Kullanici Username kutusuna herhangi bir karekterden olusan gecerli {string} girer")
    public void kullaniciUsernameKutusunaHerhangiBirKarekterdenOlusanGecerliGirer(String username) {

        us002.GecerliUserName(username);
    }

    @And("Kullanici dogru bir Username girdigini dogrular")
    public void kullaniciDogruBirUsernameGirdiginiDogrular() {
        Assert.assertTrue(us002.userNameValidConfirm.isDisplayed());

        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici email kutusuna tiklar ve bos birakir")
    public void kullanici_email_kutusuna_tiklar_ve_bos_birakir() {
        us002.EmailTextBox.click();
    }

    @Then("Kullanici New password kutusuna tiklar")
    public void kullanici_new_password_kutusuna_tiklar() {
        us002.firstPassTextBox.click();

    }

    @Then("Kullanici Email kutusunu bos birakinca {string} uyari mesajini goruntuler")
    public void kullanici_email_kutusunu_bos_birakinca_uyari_mesajini_goruntuler(String string) {

        us002.emailRequiredMsj.isDisplayed();

    }

    @And("Kullanici Email kutusuna tiklar ve bes’ten az karakter {string} girdiginde Your email is required to be at least five characters uyari mesajini goruntuler")
    public void kullaniciEmailKutusunaTiklarVeBesTenAzKarakterGirdigindeYourEmailIsRequiredToBeAtLeastFiveCharactersUyariMesajiniGoruntuler(String arg0) {
        us002.GecersizEmail(arg0);
        us002.firstPassTextBox.click();
        us002.emailCharacterMessage();
        ReusableMethods.waitFor(5);
        Driver.getDriver().navigate().refresh();

    }
    @And("Kullanici Email kutusuna {string} olmadan email adresi girdiginde This field is invalid mesajini goruntuler")
    public void kullaniciEmailKutusunaOlmadanEmailAdresiGirdigindeThisFieldIsInvalidMesajiniGoruntuler(String email) {
        us002.GecersizEmail(email);
        us002.firstPassTextBox.click();
        us002.emailInvalidMessage();
        ReusableMethods.waitFor(2);
        Driver.getDriver().navigate().refresh();
    }



    @And("Kullanici Mail kutusuna ve @ olmadan {string} girer. This field is invalid mesajini alir")
    public void kullaniciMailKutusunaVeOlmadanGirerThisFieldIsInvalidMesajiniAlir(String arg0) {
        us002.GecersizEmail(arg0);
        us002.emailInvalidMessage();
        us002.userNameTextBox();
    }

    @And("Kullanici Email kutucuğuna mail adresi @ ve . karakterleri kullanarak {string} girer.")
    public void kullaniciEmailKutucuğunaMailAdresiVeKarakterleriKullanarakGirer(String arg0) {
        us002.GecerliEmail(arg0);
    }


    @And("Kullanici herhangi bir uyarı mesajı almaz")
    public void kullaniciHerhangiBirUyarıMesajıAlmaz() {
        us002.emailValidConfirm();
    }


    @And("Kulanici user name kutusunu bos birakir")
    public void kulaniciUserNameKutusunuBosBirakir() {
    }

    @And("Kullanici Email kutusuna {string} ve {string} email adresi girdiginde This field is invalid mesajini goruntuler")
    public void kullaniciEmailKutusunaVeEmailAdresiGirdigindeThisFieldIsInvalidMesajiniGoruntuler(String mail1, String mail2 ) throws InterruptedException {
        us002.GecersizEmail2(mail1,mail2);
        /*
        us002.firstPassTextBox.click();
        us002.emailInvalidMessage();
        ReusableMethods.waitFor(2);
        Driver.getDriver().navigate().refresh();

         */


    }

    @And("Kullanici Email kutusuna tiklar ve {string} email adresi girer yada {string} email adresi girdiginde This field is invalid uyari mesajini goruntuler")
    public void kullaniciEmailKutusunaTiklarVeEmailAdresiGirerYadaEmailAdresiGirdigindeThisFieldIsInvalidUyariMesajiniGoruntuler(String mail1, String mail2) throws InterruptedException {
        us002.GecersizEmail2(mail1,mail2);

    }


}
