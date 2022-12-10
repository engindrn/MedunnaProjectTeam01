package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class Medunna16_url1 {

    public static RequestSpecification spec01;

    @Before
    public static void medunnaSetUp(){

        spec01 = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }
}


