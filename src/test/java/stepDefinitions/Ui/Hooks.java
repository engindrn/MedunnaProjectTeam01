package stepDefinitions.Ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static base_url_setup.MedunnaBaseUrl.medunnaSetup;

public class Hooks {
    /*
   Cucumber'da step definitions package'i içerisinde
@before @after gibi bir notasyon varsa
extends testBase dememize gerek kalmadan
her scenario'dan önce ve/veya sonra bu methodlar çalışacaktır

Bu da bizim isteyeceğimiz bir durum değildir

Cucumber'da @before @after kullanma ihtiyacımız olursa
bunu stepDefinitions package'i altında oluşturacağımız
Hooks class'ına koyarız


Biz her scenario'dan sonra test sonucunu kontrol edip failed olan
scenario'lar için screenshoot olmasi amaciyla
@After methodu kullanacağız

     */


    @Before(value="@US019_API_Test")

    public void beforApi(){
        medunnaSetup();

    }




    @After
    public void tearDown(Scenario scenario){  final byte[] screenshot=((TakesScreenshot)
            Driver.getDriver()).getScreenshotAs(OutputType.BYTES);  if (scenario.isFailed()) {
        scenario.attach(screenshot, "image/png","screenshots");

    }
        if (Driver.getDriver() != null) {
            Driver.closeDriver();
        }



    }
}