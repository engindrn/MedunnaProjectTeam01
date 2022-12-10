Feature: US010 Database test

  @US10_DB_Test
  Scenario: Doktor "patient id, start date, end date, status" bilgilerini Database de dogrulayabilmelidir


    Given Kullanici connection kurar
    And Kullanici  query olusturur
    Then Kullanici  patient ID yi dogrular
    Then Kullanici  start date i dogrular
    Then Kullanici  end date i dogrular
    Then Kullanici   status bilgisini dogrular