@US019
Feature: US_019


  Background:  Ortak adimlar
    Given Admin19 "url" adresine gider
    Then Admin19 Giris simgesine tiklar
    And  Admin19 Sign in simgesine tiklar
    And Admin19 Username alanina gecerli bir username "team01" girer
    And Admin19 Password alanina gecerli bir password "team0101" girer
    And Admin19 Sign in butonuna tiklar

@US019_TC01
  Scenario Outline: Admin SSN kullanarak kayitli kisiler arasinda Staff arayabilmeli
    And Admin19 Items&Titles sekmesine tiklar
    And Admin19  Staff secenegini tiklar
    And Admin19 Create a new Staff butonuna tiklar
    And Admin19 Use Search box suna tiklar
    And Admin19 SSN alanina staff in "<SSN>" i girer
    And Admin19 Search User butonunu tiklar
    Then Admin19 User found with search SSN mesajini gorur

    Examples:
      | SSN         |
      | 600-60-6001 |

  @US019_TC02
  Scenario Outline: Admin tüm bilgileri doldurabilmeli

    And Admin19 Items&Titles sekmesine tiklar
    And Admin19  Staff secenegini tiklar
    And Admin19 Create a new Staff butonuna tiklar
    And Admin19 Use Search box suna tiklar
    And Admin19 SSN alanina staff in "<SSN>" i girer
    And Admin19 Search User butonunu tiklar
    And Admin19 "<Phone>" "<Address>" "<Description>" "<Country>" "<State>" alanlarini doldurur
    Then Admin19 tum bilgilerin dolduruldugu dogrular

    Examples:
      | SSN         | Phone      | Address    | Description | Country | State      |
      | 600-60-6001 | 0493456789 | Max planck | Test        | USA     | California |

  @US019_TC03
  Scenario: Admin kayitli kisilerden bir kullanici secebilmeli

    And Admin19 Administratiton sekmesine tiklar
    And Admin19 User management sekmesine tiklar
    And Admin19 sececegi kullanicinin  View butonuna tiklar
    Then Admin19 kullaniciyi sectigini dogrular

  @US019_TC04
  Scenario: Admin kullanici bilgilerini duzenleyebilmeli

    And Admin19 Administratiton sekmesine tiklar
    And Admin19 User management sekmesine tiklar
    And Admin19 duzenleme yapacagi kullanicinin  Edit butonuna tiklar
    And Admin19 kullanici bilgileri duzenler
    Then Admin19 kullanici bilgilerinin duzenledigine dair basari mesajini gorur

  @US019_TC05
  Scenario: Admin personeli silebilmeli

    And Admin19 Items&Titles sekmesine tiklar
    And Admin19  Staff secenegini tiklar
    Then Admin19 silmek istedigi stafif in delete butonuna tiklar
    And  Admin19 silindi mesajini dogrular

