@US_028_DB
Feature: Kullanici admin olarak DataBase ile ulkeleri dogrulayabilmeli.

  @US_028_DB_001
  Scenario: Kullanici DB ile ulkeleri bilgilerini dogrular
    Given yp Kullanici DB ile baglanti kurar
    And  yp Kullanici Query tanimlar
    And  yp Kullanici ulke bilgilerine ulasir ve kaydeder
    And yp Kullanici DB ile ulke bilgilerini dogrular

  @US_028_DB_002
  Scenario: Kullanici DB ile sehir bilgilerini dogrular
    Given yp Kullanici DB ile baglanti kurar
    And  yp Kullanici sehir icin Query tanimlar
    And  yp Kullanici sehir bilgilerine ulasir ve kaydeder
    And yp Kullanici DB ile sehir bilgilerini dogrular
