@US001_Api
Feature:US001_Kayit olmak icin SSN, Firstname ve Lastname bilgileri girilebilmelidir
  @US001_TC09 @ApiRegistrant @E2E
  Scenario:US001_TC09 Swagger dokumani kullanarak tum kayit bilgileri alinmali ve dogrulanmalidir
    When Kullanici pathparams ayarlamasini yapar
    Then Kullanici kayitlarin bilgilerini alir
    And Kullanici alinan bilgilerin dogrulamasini yapar

  @US001_TC10
  Scenario:US001_TC10  API kullanarak kayitli kisiler olusturulup dogrulanmalidir
    When Kullanici gerekli path params ayarlar
    Then Kullanici expected datalari girer
    And Kullanici request gonderir ve response alir
    Then Kullanici api kayitlarini dosyaya kaydeder
    And Kullanici  api kayitlarini dogrular