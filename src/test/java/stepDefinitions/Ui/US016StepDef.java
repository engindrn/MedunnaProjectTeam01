package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US016Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class US016StepDef {

    US016Page page16 = new US016Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Admin16 {string} sayfasina gider")
    public void adminSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl16"));

    }

    @Then("Admin16 kisi simgesinin uzerine tiklar")
    public void adminKisiSimgesininUzerineTiklar() {
        page16.imge.click();

    }

    @And("Admin16 acilan pencerede Sign in ' in uzerine tiklar")
    public void adminAcilanPenceredeSignInInUzerineTiklar() {
        page16.signin.click();

    }

    @And("Admin16 username alanina gecerli bir username girer")
    public void adminUsernameAlaninaGecerliBirUsernameGirer() {
        page16.username.sendKeys(ConfigReader.getProperty("username16"));

    }

    @And("Admin16 password alanina gecerli bir password girer")
    public void adminPasswordAlaninaGecerliBirPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password16")).perform();

    }

    @And("Admin16 Sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        page16.signIn.click();

    }

    @Then("Admin16 items&titles sekmesine tiklar")
    public void adminItemsTitlesSekmesineTiklar() {
        page16.items.click();

    }

    @And("Admin16 acilan sekmede room opsiyonunu secer")
    public void adminAcilanSekmedeRoomOpsiyonunuSecer() {
        page16.room.click();

    }

    // @US016_1

    @And("Admin16 create a new room butonunu tiklar")
    public void adminCreateANewRoomButonunuTiklar() {
        page16.create.click();

    }

    @And("Admin16 room number alanini doldurur")
    public void adminRoomNumberAlaniniDoldurur() {
        page16.roomNumber.sendKeys(ConfigReader.getProperty("roomNumber16"));

    }

    @And("Admin16 room type secer")
    public void adminRoomTypeSecer() {
        page16.roomType.click();
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(3);

    }

    @And("Admin16 price alanini doldurur")
    public void adminPriceAlaniniDoldurur() {
        page16.roomPrice.sendKeys(ConfigReader.getProperty("price16"));

    }

    @And("Admin16 save butonunu tiklar")
    public void adminSaveButonunuTiklar() {
        page16.save.click();

    }

    @And("Admin16 {string} yazisini gorur")
    public void adminYazisiniGorur(String arg0) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page16.roomIsCreate));
        Assert.assertTrue(page16.roomIsCreate.isDisplayed());

    }

    // @US016_2

    @And("Admin16 room type alanina tiklar ve TWIN opsiyonunu secer")
    public void adminRoomTypeAlaninaTiklarVeTWINOpsiyonunuSecer() {
        page16.roomType.click();
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(0);

    }

    @And("Admin16 room type alanina tiklar ve DELUXE opsiyonunu secer")
    public void adminRoomTypeAlaninaTiklarVeDELUXEOpsiyonunuSecer() {
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(1);

    }

    @And("Admin16 room type alanina tiklar ve PREMIUM_DELUXE opsiyonunu secer")
    public void adminRoomTypeAlaninaTiklarVePREMIUM_DELUXEOpsiyonunuSecer() {
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(2);

    }

    @And("Admin16 room type alanina tiklar ve SUIT opsiyonunu secer")
    public void adminRoomTypeAlaninaTiklarVeSUITOpsiyonunuSecer() {
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(3);
    }

    @And("Admin16 room type alanina tiklar ve DAYCARE opsiyonunu secer")
    public void adminRoomTypeAlaninaTiklarVeDAYCAREOpsiyonunuSecer() {
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(4);
    }

    // @US016_3

    @And("Admin16 status sekmesinin tiklanabildigini dogrular")
    public void adminStatusSekmesininTiklanabildiginiDogrular() {
        page16.roomStatus.isEnabled();
    }

    // @US016_4

    @And("Admin16 price alanini temizler ve  bos birakir")
    public void adminPriceAlaniniTemizlerVeBosBirakir() {
        page16.roomPrice.clear();
    }

    @And("Admin16 save butonuna tiklar")
    public void adminSaveButonunaTiklar() {

        WebElement saveClick = page16.save;
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", saveClick);
        jse.executeScript("arguments[0].click();", saveClick);


    }

    @And("Admin16 price bolumunde {string} yazisini gorur")
    public void adminPriceBolumundeYazisiniGorur(String arg0) {
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(page16.priceYazi.isDisplayed());
    }

    // @US016_5.1

    @And("Admin16 Description alanini bos birakir")
    public void adminDescriptionAlaniniBosBirakir() {
        page16.roomDescription.clear();
    }

    // @US016_5.2

    @And("Admin16 Description alanini doldurur")
    public void adminDescriptionAlaniniDoldurur() {
        page16.roomDescription.sendKeys("Yatis suresi 3 gun");
    }

    // @US016_6
    @And("Admin16 tarihi gun,ay,yil seklinde gecmis bir tarih girer")
    public void adminTarihiGunAyYilSeklindeGecmisBirTarihGirer() {

        page16.createdDate.click();
        actions.sendKeys("18").sendKeys("12").sendKeys("2022").
                sendKeys(Keys.TAB).sendKeys("10").sendKeys("15").perform();

        LocalDateTime tarihSaat = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");

        String expectedData = "18/12/2022 10:15 PM";
        String actualData = dtf.format(tarihSaat);
        Assert.assertEquals(expectedData, actualData);

    }

    // @US016_7

    @And("Admin16 room type basliginin uzerine tiklar")
    public void adminRoomTypeBasligininUzerineTiklar() {
        page16.roomTypeHeader.click();

    }

    @And("Admin16 ayni tur odalari gorebildigini dogrular")
    public void adminAyniTurOdalariGorebildiginiDogrular() {

        String roomType1 = page16.roomType1.getText();
        String roomType2 = page16.roomType2.getText();
        String roomType3 = page16.roomType3.getText();

        Assert.assertEquals(roomType1, roomType2);
        Assert.assertEquals(roomType2, roomType3);

    }

    // @US016_8

    @And("Admin16 odanin bulundugu sekmeye tiklar")
    public void adminOdaninBulunduguSekmeyeTiklar() {
        WebElement pageClick = page16.roomPage;
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", pageClick);
        jse.executeScript("arguments[0].click();", pageClick);

    }

    @And("Admin16 odayi duzenlemek icin edit sekmesine tiklar")
    public void adminOdayiDuzenlemekIcinEditSekmesineTiklar() {
        page16.roomEdit.click();

    }

    @And("Admin16 room type alaninda degisiklik yapar")
    public void adminRoomTypeAlanindaDegisiklikYapar() {
        WebElement room = page16.roomType;
        Select select = new Select(room);
        select.selectByIndex(1);

    }

    @And("Admin16 price alaninda degisiklik yapar")
    public void adminPriceAlanindaDegisiklikYapar() {
        page16.roomPrice.clear();
        page16.roomPrice.sendKeys("220");
    }

    @And("Admin16 A Room is updated with identifier yazisini gorur")
    public void adminARoomIsUpdatedWithIdentifierYazisiniGorur() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page16.roomUpdate));
        Assert.assertTrue(page16.roomUpdate.isDisplayed());


    }

    // @US016_10

    @And("Admin16 odayi silmek icin delete sekmesine tiklar")
    public void adminOdayiSilmekIcinDeleteSekmesineTiklar() {
        WebElement pageClickSon = page16.roomPageSon;
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", pageClickSon);
        jse.executeScript("arguments[0].click();", pageClickSon);

        page16.roomDelete.click();


    }

    @And("Admin16 acilan pencerede tekrar delete butonuna tiklar")
    public void adminAcilanPenceredeTekrarDeleteButonunaTiklar() throws InterruptedException {
        Thread.sleep(2000);
        page16.roomDelete2.click();
        Thread.sleep(2000);
    }

    @And("Admin16 A Room is deleted with identifier yazisini gorur")
    public void adminARoomIsDeletedWithIdentifierYazisiniGorur() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page16.roomDeleteYazi));
        Assert.assertTrue("Room silinemedi",page16.roomDeleteYazi.isDisplayed());

    }


    @And("Admin16 sayfayi kapatir")
    public void adminSayfayiKapatir() {

        Driver.getDriver().close();
    }
}
