package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Driver {
    private Driver() {
    }
    static WebDriver driver;
    // Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin
    // her test methodu icin yeni bir pencere(driver) aciyor. Eger driver'a bir deger
    // atanmamissa yani driver==null ise bir kere driver'i calistir diyerek bir kere
    // if icini calistiracak.Ve driver artik bir kere calistigi icin ve deger atandigi
    // icin null olmayacak ve direk return edecek ve diger testlerimiz ayni pencere(driver) uzerinde calsacak.
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {   // driver'a deger atanmissa kapat
            driver.close();
            driver = null; // Kapandiktan sonran sonraki acmalari garanti altina almak icin driver'i tekrar null yaptik
        }
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static int timeout = 5;
    public static void waitAndClick(WebElement element) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }
    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        ReusableMethods.waitFor(2);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }

    }
}
