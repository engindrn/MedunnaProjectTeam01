@US_017
Feature: Admin Test items(öğe) Oluşturur / Günceller / Siler
  Background: Ortak Adimlar

  @US_017TC_001

  Scenario: TC_001 Admin yeni test öğeleri oluşturabilir
    Given AdminMP url adresine gider
    And AdminMP 3 saniye bekler
    When AdminMP giris simgesine tiklar
    And AdminMP 3 saniye bekler
    And AdminMP sign in simgesine tiklar
    And AdminMP 3 saniye bekler
    And AdminMP username alanina gecerli bir username girer
    And AdminMP 3 saniye bekler
    And AdminMP password alanina gecerli bir password girer
    And AdminMP 3 saniye bekler
    And AdminMP sign in butonuna tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Items-Titels e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Test Item e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Create a new Test Item a tiklar
    And AdminMP 3 saniye bekler
    And AdminMP  Name,Description,price Default min value,Default max value degerlerini girer
    And AdminMP 3 saniye bekler
    And AdminMP save butona tiklar
    And AdminMP sayfayi kapatir


  @US_017TC_002
  Scenario: TC_002 Admin, "test items; Name, Description, price Default min value, Default max value degerlerini
  guncelleyebilir
    Given AdminMP url adresine gider
    And AdminMP 3 saniye bekler
    And AdminMP giris simgesine tiklar
    And AdminMP 3 saniye bekler
    And AdminMP sign in simgesine tiklar
    And AdminMP 3 saniye bekler
    And AdminMP username alanina gecerli bir username girer
    And AdminMP 3 saniye bekler
    And AdminMP password alanina gecerli bir password girer
    And AdminMP 3 saniye bekler
    And AdminMP sign in butonuna tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Items-Titels e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Test Item e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP IDButtona tiklar
    And AdminMP 5 saniye bekler
    And AdminMP GlukozID ye tiklar
    And AdminMP 3 saniye bekler
    And AdminMP testEditButton a tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Name,Description,price Default min value,Default max value degerlerini günceller
    And AdminMP sayfayi kapatir

  @US_017TC_003
  Scenario:TC_003 Admin created date (Gün/Ay/Yıl)  görüntüleyebilir.
    Given AdminMP url adresine gider
    And AdminMP 3 saniye bekler
    And AdminMP giris simgesine tiklar
    And AdminMP sign in simgesine tiklar
    And AdminMP 3 saniye bekler
    And AdminMP username alanina gecerli bir username girer
    And AdminMP 3 saniye bekler
    And AdminMP password alanina gecerli bir password girer
    And AdminMP 3 saniye bekler
    And AdminMP sign in butonuna tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Items-Titels e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Test Item e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP IDButtona tiklar
    And AdminMP 5 saniye bekler
    And AdminMP GlukozID ye tiklar
    And AdminMP 3 saniye bekler
    Then AdminMP created date"Gun/Ay/Yil" görünür oldugunu dogrular.
    And AdminMP sayfayi kapatir

  @US_017TC_004
  Scenario: TC_004 Admin test öğelerini silebilir
    Given AdminMP url adresine gider
    And AdminMP 3 saniye bekler
    And AdminMP giris simgesine tiklar
    And AdminMP sign in simgesine tiklar
    And AdminMP 3 saniye bekler
    And AdminMP username alanina gecerli bir username girer
    And AdminMP 3 saniye bekler
    And AdminMP password alanina gecerli bir password girer
    And AdminMP 3 saniye bekler
    And AdminMP sign in butonuna tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Items-Titels e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP Test Item e tiklar
    And AdminMP 3 saniye bekler
    And AdminMP test delete tiklar
    And AdminMP 3 saniye bekler
    And AdminMP sayfayi kapatir


