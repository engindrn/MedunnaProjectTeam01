Feature: US09 database test

  @DBTest
  Scenario: US09 Staff database kullanarak  hastanin bilgilerini doğrulamalıdır.
    Given Personel09 Medunna database e baglanir
    Then Personel09 Database'den hasta bilgilerini alir ve dogrular


