Feature: API test
  @api
  Scenario: Kullanıcı APİ ile randevu bilgilerini dogrulamalidir

    Given Kullanici005 id numarali hastanin tum bilgilerini get request gonderir
    Then Kullanici005 status kodunu oldugunu dogrulamalidir
    And Kullanici005 bilgilerin dogrulugunu kontrol eder