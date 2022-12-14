@DB_US_027
Feature: TestItems DB Test

  @US027_TC006
  Scenario: DB ile dogrulayin
    Given YP Kullanici database ile baglanti kurar
    And YP Admin query tanimlar
    And YP Admin messages bilgilerine ulasir ve kaydeder
    And YP Admin DB ile messages bilgilerini dogrular