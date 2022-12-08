@US_017
Feature: Admin Test items(öğe) Oluşturur / Günceller / Siler
  Background: Ortak Adimlar

  @US_017TC_001

  Scenario: TC_001 Admin yeni test öğeleri oluşturabilir
    Given Admin url adresine gider
    And Admin 3 saniye bekler
    When Admin giris simgesine tiklar
    And Admin 3 saniye bekler
    And Admin sign in simgesine tiklar
    And Admin 3 saniye bekler
    And Admin username alanina gecerli bir username girer
    And Admin 3 saniye bekler
    And Admin password alanina gecerli bir password girer
    And Admin 3 saniye bekler
    And Admin sign in butonuna tiklar
    And Admin 3 saniye bekler
    And Admin Items-Titels e tiklar
    And Admin 3 saniye bekler
    And Admin Test Item e tiklar
    And Admin 3 saniye bekler
    And Admin Create a new Test Item a tiklar
    And Admin 3 saniye bekler
    And Admin  Name,Description,price Default min value,Default max value degerlerini girer
    And Admin 3 saniye bekler
    And Admin save butona tiklar
    And Admin sayfayi kapatir


  @US_017TC_002
  Scenario: TC_002 Admin, "test items; Name, Description, price Default min value, Default max value degerlerini
  guncelleyebilir
    Given Admin url adresine gider
    And Admin 3 saniye bekler
    And Admin giris simgesine tiklar
    And Admin 3 saniye bekler
    And Admin sign in simgesine tiklar
    And Admin 3 saniye bekler
    And Admin username alanina gecerli bir username girer
    And Admin 3 saniye bekler
    And Admin password alanina gecerli bir password girer
    And Admin 3 saniye bekler
    And Admin sign in butonuna tiklar
    And Admin 3 saniye bekler
    And Admin Items-Titels e tiklar
    And Admin 3 saniye bekler
    And Admin Test Item e tiklar
    And Admin 3 saniye bekler
    And Admin IDButtona tiklar
    And Admin 5 saniye bekler
    And Admin GlukozID ye tiklar
    And Admin 3 saniye bekler
    And Admin testEditButton a tiklar
    And Admin 3 saniye bekler
    And Admin Name,Description,price Default min value,Default max value degerlerini günceller
    And Admin sayfayi kapatir

  @US_017TC_003
  Scenario:TC_003 Admin created date (Gün/Ay/Yıl)  görüntüleyebilir.
    Given Admin url adresine gider
    And Admin 3 saniye bekler
    And Admin giris simgesine tiklar
    And Admin sign in simgesine tiklar
    And Admin 3 saniye bekler
    And Admin username alanina gecerli bir username girer
    And Admin 3 saniye bekler
    And Admin password alanina gecerli bir password girer
    And Admin 3 saniye bekler
    And Admin sign in butonuna tiklar
    And Admin 3 saniye bekler
    And Admin Items-Titels e tiklar
    And Admin 3 saniye bekler
    And Admin Test Item e tiklar
    And Admin 3 saniye bekler
    And Admin IDButtona tiklar
    And Admin 5 saniye bekler
    And Admin GlukozID ye tiklar
    And Admin 3 saniye bekler
    Then Admin created date"Gun/Ay/Yil" görünür oldugunu dogrular.
    And Admin sayfayi kapatir

  @US_017TC_004
  Scenario: TC_004 Admin test öğelerini silebilir
    Given Admin url adresine gider
    And Admin 3 saniye bekler
    And Admin giris simgesine tiklar
    And Admin sign in simgesine tiklar
    And Admin 3 saniye bekler
    And Admin username alanina gecerli bir username girer
    And Admin 3 saniye bekler
    And Admin password alanina gecerli bir password girer
    And Admin 3 saniye bekler
    And Admin sign in butonuna tiklar
    And Admin 3 saniye bekler
    And Admin Items-Titels e tiklar
    And Admin 3 saniye bekler
    And Admin Test Item e tiklar
    And Admin 3 saniye bekler
    And Admin test delete tiklar
    And Admin 3 saniye bekler
    And Admin sayfayi kapatir


