package stepDefinitions.Db;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US027DbStepDef {
    String query;
    String filename1= "src/test/resources/testData/Messages.txt";

    @Given("YP Kullanici database ile baglanti kurar")
    public void yp_kullanici_database_ile_baglanti_kurar() {
        DatabaseUtility.createConnection();
    }

    @Given("YP Admin query tanimlar")
    public void yp_admin_query_tanimlar() {
        query="select * from public.cmessage";
        System.out.println(DatabaseUtility.getColumnNames(query));
    }

    @Given("YP Admin messages bilgilerine ulasir ve kaydeder")
    public void yp_admin_messages_bilgilerine_ulasir_ve_kaydeder() {
        List<Object> idList=DatabaseUtility.getColumnData(query,"id");
        WriteToTxt.saveMessageId(filename1,idList);
    }

    @Given("YP Admin DB ile messages bilgilerini dogrular")
    public void yp_admin_db_ile_messages_bilgilerini_dogrular() {
        List<Object> actualTestItems= ReadTxt.returnMessageIDList(filename1);
        List<Object> expectedTestItems= new ArrayList<>();
        expectedTestItems.add(236980);
        Assert.assertTrue("message id uyusmuyor",actualTestItems.containsAll(expectedTestItems));

    }

}
