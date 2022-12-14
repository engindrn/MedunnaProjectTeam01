@API_028
Feature: US028Api

  @API_028_001
  Scenario: Kullanici, API kullanarak ulkeleri dogrular
    Given yp Kullanici set the Base Url
    And yp Send the GET request and get the response
    And yp Set the expected data
    Then yp Make validation

  @API_028_002
  Scenario: Kullanici, API kullanarak ulkeleri gunceller
    Given Kullanici, ulke guncellemesi icin beklenen verileri girer
    And Kullanici, ulke guncellemesi icin istek gonderir ve yanit alir
    And Kullanici, ulke guncellemesi icin tum API bilgilerini kaydeder
    Then Kullanici, ulke guncellemesi icin API kayitlarini dogrular

  @API_028_003
  Scenario: Kullanici, API kullanarak sehirleri dogrular
    Given Kullanici Base Url i olusturur
    And Kullanici post istegini gonderir ve yanitini alir
    Then Kullanici APi kayitlarini dogrular




