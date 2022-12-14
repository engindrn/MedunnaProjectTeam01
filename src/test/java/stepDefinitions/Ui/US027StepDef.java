package stepDefinitions.Ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.US027Page;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

    public class US027StepDef {

        US027Page adminPage = new US027Page();
        Faker faker = new Faker();

        @Then("YP admin item&titles sekmesini acar")
        public void yp_admin_item_titles_sekmesini_acar() {
            adminPage.itemsTitlesButon.click();
        }

        @Then("YP admin messages butonuna tiklar")
        public void yp_admin_messages_butonuna_tiklar() {
            adminPage.itemsTitlesMessagesButton.click();
        }

        @Then("YP admin messages sayfasindaki ilk view butonuna tiklar")
        public void yp_admin_messages_sayfasindaki_ilk_view_butonuna_tiklar() {
            adminPage.messagesPageIlkViewButton.click();
        }

        @Then("YP admin name, email, message kisimlarinin goruldugunu onaylar")
        public void yp_admin_name_email_message_kisimlarinin_goruldugunu_onaylar() {
            WebElement name = adminPage.messagesViewNameWebElement;
            WebElement email = adminPage.messagesViewEmailWebElement;
            WebElement message = adminPage.messagesViewMessageWebElement;
            assertTrue(name.isDisplayed());
            assertTrue(email.isDisplayed());
            assertTrue(message.isDisplayed());
        }

        @And("YP admin create a new message butonuna tiklar")
        public void ypAdminCreateANewMessageButonunaTiklar() {
            adminPage.createNewMessageButton.click();
        }

        @And("YP admin yeni mesaj icin ilgili alanlari doldurur")
        public void ypAdminYeniMesajIcinIlgiliAlanlariDoldurur() {
            adminPage.nameForNewMessage.clear();
            adminPage.nameForNewMessage.sendKeys(faker.funnyName().name());
            adminPage.emailForNewMessage.clear();
            adminPage.emailForNewMessage.sendKeys(faker.internet().emailAddress());
            adminPage.subjectForNewMessage.clear();
            adminPage.subjectForNewMessage.sendKeys(faker.superhero().power());
            adminPage.messageForNewMessage.clear();
            adminPage.messageForNewMessage.sendKeys(faker.rickAndMorty().quote());
        }

        @And("YP admin messages sayfasindaki ilk edit butonuna tiklar")
        public void ypAdminMessagesSayfasindakiIlkEditButonunaTiklar() {
            adminPage.messagesPageIlkEditButton.click();
        }

        @And("YP admin messages sayfasindaki ilk delete butonuna tiklar")
        public void ypAdminMessagesSayfasindakiIlkDeleteButonunaTiklar() {
            adminPage.messagesPageIlkDeleteButton.click();
        }

        @And("YP admin acilan popup da delete butonunun tiklanabilir oldugunu onaylar")
        public void ypAdminAcilanPopupDaDeleteButonununTiklanabilirOldugunuOnaylar() {
            assertTrue(adminPage.messagesPopUpDeleteButton.isEnabled());
        }


        @And("YP SayfayiKapatir")
        public void YPSayfayiKapatir() {
            Driver.closeDriver();


        }

        @Given("YP Save butonuna tiklar")
        public void yp_save_butonuna_tiklar() {
            adminPage.passwordPageSaveButton.click();
        }
        @Then("YP The Appointment is updated with identifier uyarisinin goruldugunu onaylar")
        public void ofe_the_appointment_is_updated_with_identifier_uyarisinin_goruldugunu_onaylar() {
            assertTrue(adminPage.ozelYesilUyariBalonu.isDisplayed());
        }


    }