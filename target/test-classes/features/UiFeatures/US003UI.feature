@US_003
Feature: Kullanici "Password strength" seviyeleri görülebilmelidir.

  Background: YP Kullanici Medunna anasayfasina girer
    Given YP Kullanici Medunna anasayfasina gider
    When YP Kullanici Account Menu bolumune tiklar
    Then YP Kullanici registration sekmesine tiklar

  @US003_TC01
  Scenario Outline: Kullanici en az 7 karakterli icerisinde en az 1 kucuk harf, 1 rakam, 1 ozel karakter olan sifreleri
  girer
    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunu dogrular "<strength>"
    And YP Kullanici sayfayi kapatir
    Then user goes to xxxxx

    Examples: test data
      | password   | strength |
      | yavuzpO    | 2        |
      | 345678y    | 2        |
      | POYRAZy    | 2        |
      | poyrazY    | 2        |
      | poyraz1    | 2        |
      | poyraz?    | 2        |
      | poyrazxm!2 | 4        |
      | poyrA2!    | 5        |


  @US003_TC02_NegativeTest
  Scenario Outline: TC_001 Kullanici kucuk harflerden olusan en az 7 karakterli bir sifre girer
    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunun degismedigini "<strength>"
    And YP Kullanici sayfayi kapatir
    Examples: password data
      | password  | strength |
      | yavuzdnys | 1        |

