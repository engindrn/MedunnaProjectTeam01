
@US10_API_Test
Feature: API test


  Scenario:  Doktor "patient id, start date, end date, status" bilgilerini API ile dogrulayabilmelidir

    Given Kullanici Request gönderir Response alir
    Then Kullanici status kodunu dogrular
    Then Kullanici patient ID yi dogrular
    Then Kullanici start date i dogrular
    Then Kullanici end date i dogrular
    Then Kullanici  status bilgisini dogrular



