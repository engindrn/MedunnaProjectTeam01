package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class Medunna16_url2 {

    public static RequestSpecification spec02;

    @Before
    public static void medunnaSetUp2(){

        spec02 = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }

}
