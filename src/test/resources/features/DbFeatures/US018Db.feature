Feature:US018 DB kullanarak doktorlari dogrulayin

  @DB_018
  Scenario:US018_TC12 Kullanici DB kullanarak doktor bilgilerini dogrular
    Given Kullanici database baglanir
    When  Kullanici databese query gonderir ve gerekli columnu alir
    And   Kullanici doktorun bilgilerini dogrular
    Then  Kullanici database baglantisini kapatir
