package stepDefinitions.Api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import pojos.us016_Pojos.RoomPojo16;
import pojos.us016_Pojos.RoomPostPojo16;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;


public class US016ApiStepDef {

    Response response;
    RequestSpecification spec01;
    RequestSpecification spec02;
    RoomPostPojo16 room = new RoomPostPojo16();
    static RoomPojo16 room2;
    static int roomId;

    // POST
    @Given("Admin16 oda olusturmek icin medunna sayfasina gider")
    public void adminOdaOlusturmekIcinMedunnaSayfasinaGider() {

        spec01 = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec01.pathParams("bir", "api", "iki", "rooms");

    }

    @Then("Admin16 response ile oda bilgilerini girer")
    public void adminResponseIleOdaBilgileriniGirer() {

        room.setDescription("7 gun");
        room.setPrice(545);
        room.setRoomNumber(100058447);
        room.setRoomType("DELUXE");
        room.setStatus(true);


        response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept",
                ContentType.JSON).spec(spec01).contentType(ContentType.JSON).body(room).when().post("/{bir}/{iki}");

        response.prettyPrint();

    }


    @And("Admin16 Status kodunun {int} oldugunu dogrular.")
    public void adminStatusKodununOldugunuDogrular(int arg0) {
        response.then().assertThat().statusCode(201);

    }

    @And("Admin16 alinan bilgileri dogrular")
    public void adminAlinanBilgileriDogrular() {

        RoomPojo16 actualRoom = response.as(RoomPojo16.class);
        System.out.println("actualRoom = " + actualRoom);


        assertEquals(actualRoom.getRoomNumber(), room.getRoomNumber());
        assertEquals(actualRoom.getRoomType(), room.getRoomType());
        assertEquals(actualRoom.getPrice(), room.getPrice());
        assertEquals(actualRoom.isStatus(), room.isStatus());
        assertEquals(actualRoom.getDescription(), room.getDescription());
        roomId = actualRoom.getId();


    }


    // GET

    @Then("Admin16 get request gonderir ve response ile oda bilgilerini alir.")
    public void adminGetRequestGonderirVeResponseIleOdaBilgileriniAlir() {
        spec01.pathParams("bir", "api", "iki", "rooms", "uc", roomId);

        response = given().spec(spec01).headers("Authorization", "Bearer " + generateToken()).
                contentType(ContentType.JSON).get("/{bir}/{iki}/{uc}");
        response.prettyPrint();

    }

    @Then("Admin16 Status kodunu {int} oldugunu dogrular.")
    public void adminStatusKodunuOldugunuDogrular(int arg0) {
        response.then().assertThat().statusCode(200);
    }

    @And("Admin16 oda bilgilerini dogrular.")
    public void adminOdaBilgileriniDogrular() {

        RoomPojo16 actualRoom = response.as(RoomPojo16.class);

        assertEquals(actualRoom.getRoomNumber(), room.getRoomNumber());
        assertEquals(actualRoom.getRoomType(), room.getRoomType());
        assertEquals(actualRoom.getPrice(), room.getPrice());
        assertEquals(actualRoom.isStatus(), room.isStatus());
        assertEquals(actualRoom.getDescription(), room.getDescription());
        roomId = actualRoom.getId();



    }


    // PUT

    @Then("Admin16 get request gonderir ve response ile oda bilgileri alir ve degisiklik yapar")
    public void adminGetRequestGonderirVeResponseIleOdaBilgileriAlirVeDegisiklikYapar() {


        spec02 = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec02.pathParams("bir", "api", "iki", "rooms");

        room2 = new RoomPojo16("10 gun", 366, 100058435, "TWIN", false, roomId);
        System.out.println("room2 = " + room2);

        response = given().spec(spec02).headers("Authorization", "Bearer " + generateToken()).
                contentType(ContentType.JSON).when().body(room2).put("/{bir}/{iki}");
        response.prettyPrint();

    }


    @And("Admin16 Status kodunun {int} oldugun dogrular.")
    public void adminStatusKodununOldugunDogrular(int arg0) {

        response.then().assertThat().statusCode(200);
    }

    @And("Admin16 alinan bilgiler dogrular.")
    public void adminAlinanBilgilerDogrular() {


        RoomPojo16 actualRoom = response.as(RoomPojo16.class);

        assertEquals(room2.getRoomNumber(), actualRoom.getRoomNumber());
        assertEquals(room2.getRoomType(), actualRoom.getRoomType());
        assertEquals(room2.getPrice(), actualRoom.getPrice());
        assertEquals(room2.isStatus(), actualRoom.isStatus());
        assertEquals(room2.getDescription(), actualRoom.getDescription());


    }


    // DELETE
    @And("Admin16 oda bilgilerinde siler")
    public void adminOdaBilgilerindeSiler() {

        response = given().spec(spec01).headers("Authorization", "Bearer " + generateToken()).
                contentType(ContentType.JSON).when().delete("/{bir}/{iki}/{uc}");
        response.prettyPrint();
    }

    @And("Admin16 Status kodunun {int} oldugu dogrular.")
    public void adminStatusKodununOlduguDogrular(int arg0) {
        response.then().assertThat().statusCode(204);
    }


}
