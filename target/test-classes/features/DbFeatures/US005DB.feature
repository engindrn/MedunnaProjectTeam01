Feature: database test

  @US005_DBTest
  Scenario: Hasta randevulari database test
    Given Kullanici05 connection kurar
    And Kullanici05 yeni kayitli randevu bilgilerini database den ceker
    Then Kullanici05 randevu bilgilerini dogrular