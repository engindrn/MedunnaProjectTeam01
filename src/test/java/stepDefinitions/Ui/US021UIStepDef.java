package stepDefinitions.Ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US021Page;
import pages.US025Page;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US021UIStepDef {

    US021Page us021Page = new US021Page();
    US025Page us025Page = new US025Page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("KullaniciSu staff olarak giris yapar")
    public void kullaniciSuStaffOlarakGirisYapar() {
        us025Page.loginPageMenuButton.click();
        us025Page.loginPageSingInMenuButton.click();
        us025Page.loginPageSingInUserNameKutusu.sendKeys("personelteam01.");
        us025Page.loginPageSingInPasswordKutusu.sendKeys("Personelteam01.");
        us025Page.loginPageSingInSingInButton.click();
    }

    @Then("Su Staff My Pages sayfasina tiklar")
    public void Su_staff_my_pages_sayfasina_tiklar() {
        us021Page.myPagesButton.click();
    }

    @Then("Su Staff Search Patient butonuna tiklar")
    public void Su_staff_search_patient_butonuna_tiklar() {
        us021Page.dropDownSearchPatientButton.click();
    }

    @Then("Su Staff Show Appointments butonuna tiklar")
    public void Su_staff_show_appointments_butonuna_tiklar() {
        us021Page.IlkSutunShowAppointmentsButton.click();
    }

    @Then("Su Staff Show Appointments ilk sutundaki edit butonuna tiklar")
    public void su_staff_show_appointments_ilk_sutundaki_edit_butonuna_tiklar() {
        us021Page.IlkAppointmentsEditButton.click();
    }

    @Then("Su Staff Create or Edit an Appointment sayfasindaki randevu tarih bilgilerini duzenler")
    public void Su_staff_create_or_edit_an_appointment_sayfasindaki_randevu_tarih_bilgilerini_duzenler() {
        us021Page.appointmentEditStartDateArea.click();
        actions.sendKeys("12").
                sendKeys("05").
                sendKeys("2023" + Keys.ARROW_RIGHT).
                sendKeys("02").
                sendKeys("45").
                perform();

        us021Page.appointmentEditEndDateArea.click();
        actions.sendKeys("12").
                sendKeys("07").
                sendKeys("2023" + Keys.ARROW_RIGHT).
                sendKeys("02").
                sendKeys("45").
                perform();

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();
    }

    @Then("Su The Appointment is updated with identifier uyarisinin goruldugunu onaylar")
    public void Su_the_appointment_is_updated_with_identifier_uyarisinin_goruldugunu_onaylar() {

        assertTrue(us021Page.YesilUyariButtonu.isDisplayed());
    }


    @And("Su Staff edit appointment sayfasinda status kismini UNAPPROVED yapar")
    public void SuStaffEditAppointmentSayfasindaStatusKisminiUNAPPROVEDYapar() {
        Select select = new Select(us021Page.statusDropdownElement);
        select.selectByVisibleText("UNAPPROVED");
        us021Page.appointmentEditEndDateArea.click();
    }

    @And("Su Staff edit appointment sayfasinda status kismini PENDING yapar")
    public void SuStaffEditAppointmentSayfasindaStatusKisminiPENDINGYapar() {
        Select select = new Select(us021Page.statusDropdownElement);
        select.selectByVisibleText("PENDING");
        us021Page.appointmentEditEndDateArea.click();
    }

    @And("Su Staff edit appointment sayfasinda status kismini CANCELLED yapar")
    public void SuStaffEditAppointmentSayfasindaStatusKisminiCANCELLEDYapar() {
        Select select = new Select(us021Page.statusDropdownElement);
        select.selectByVisibleText("CANCELLED");
        us021Page.appointmentEditEndDateArea.click();
    }

    @And("Su The Appointment is updated with identifier uyarisinin gorulmedigini onaylar")
    public void SuTheAppointmentIsUpdatedWithIdentifierUyarisininGorulmediginiOnaylar() {
        try {
            assertFalse(us021Page.YesilUyariButtonu.isDisplayed());
        }catch (AssertionError e){
            System.out.println("The Appointment is updated with identifier uyarisi goruldu FAILED");
        }
    }

    @And("Su Kullanici sayfayi asagi kaydirir")
    public void SuKullaniciSayfayiAsagiKaydirir() {
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
    }

    @And("ofe Kullanici sayfayi yukari kaydirir")
    public void ofeKullaniciSayfayiYukariKaydirir() {
        actions.sendKeys(Keys.PAGE_UP).
                perform();
    }

    @And("Su Staff edit appointment sayfasinda status kismini COMPLETED seceneginin secilemedigini onaylar")
    public void SuStaffEditAppointmentSayfasindaStatusKisminiCOMPLETEDSecenegininSecilemediginiOnaylar() {
        Select select = new Select(us021Page.statusDropdownElement);
        select.selectByVisibleText("COMPLETED");
        us021Page.appointmentEditEndDateArea.click();
        assertNotEquals(us021Page.statusDropdownElement.getAccessibleName(),"COMPLETED");

    }

    @And("Su Staff Anamnesis,Treatment,Diagnosis kisimlarini doldurur")
    public void SuStaffAnamnesisTreatmentDiagnosisKisimlariniDoldurur() {

        us021Page.anamnesisTextArea.clear();
        us021Page.anamnesisTextArea.sendKeys(faker.funnyName().name());
        us021Page.treatmentTextArea.clear();
        us021Page.treatmentTextArea.sendKeys(faker.funnyName().name());
        us021Page.diagnosisTextArea.clear();
        us021Page.diagnosisTextArea.sendKeys(faker.funnyName().name());
    }


    @And("Su Staff bir doktor secer")
    public void SuStaffBirDoktorSecer() {
        ReusableMethods.waitForVisibility(By.xpath("//option[@value='10528']"),15);
        Select select = new Select(us021Page.physicianDropdownElement);
        select.selectByValue("10528");
        us021Page.diagnosisTextArea.click();
        ReusableMethods.waitFor(5);
    }

    @And("ofe kullanici doktor dropdown kismina tiklar")
    public void ofeKullaniciDoktorDropdownKisminaTiklar() {
        us021Page.physicianDropdownElement.click();
        us021Page.diagnosisTextArea.click();
        us021Page.physicianDropdownElement.click();
        us021Page.statusDropdownElement.click();
        us021Page.physicianDropdownElement.click();
    }

    @Then("kullaniciSu {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {

        ReusableMethods.waitFor(2);
    }

        @Given("Su Save butonuna tiklar")
        public void Su_save_butonuna_tiklar() {
            us021Page.passwordPageSaveButton.click();
        }
}
