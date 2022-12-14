@US020
Feature: US020

  Scenario: US020 TC001
    Given Admin20 url adresine gider
    And Admin20 Giris simgesine tiklar
    And Admin20 Sign in simgesine tiklar
    And Admin20 Username alanina gecerli bir username girer
    And Admin20 Password alanina gecerli bir password girer
    And Admin20 Sign in butonuna tiklar
    And Admin20 Items&Title butonunu tiklar
    And Admin20 Patient butonuna tiklar
    And Admin20 kayitli Hastalarin firstname, lastname, email bilgilerinin goruldugunu dogrular.
    And Admin20 Items&Title butonunu tiklar
    And Admin20 Staff butonuna tiklar
    And Admin20 kayitli personellerin firstname, lastname, email bilgilerinin goruldugunu dogrular.
    And Admin20 Items&Title butonunu tiklar
    And Admin20 Physician butonuna tiklar
    Then Admin20 kayitli Doktorlarin firstname, lastname, email bilgilerinin goruldugunu dogrular.

  @US020_TC002
  Scenario: US020 TC002
    Given Kullanici20 url adresine gider
    And Kullanici20 Giris simgesine tiklar
    And Kullanici20 Register simgesine tiklar
    And Kullanici20 Faker Class ile yeni kayit olusturur
    And Admin20 url adresine gider
    And Admin20 Giris simgesine tiklar
    And Admin20 Sign in simgesine tiklar
    And Admin20 Username alanina gecerli bir username girer
    And Admin20 Password alanina gecerli bir password girer
    And Admin20 Sign in butonuna tiklar
    And Admin20 Administration butonunu tiklar
    And Admin20 User Managment butonuna tiklar
    And Admin20 User listesinin son sayfasina gider
    And Admin20 Kullanici20'nin olusturdugu yeni kayitta edit butonuna basar
    And Admin20 actived kutusunu isaretler
    And Admin20 profiles sekmesinden rol olarak patienti secer
    And Admin20 Save butonuna tiklar
    And Admin20 user sayfasinin sonuna gider
    #Then Admin20 yeni kaydin actived edildigini ve rolunun patient oldugunu dogrular
    And Admin20 kayitli kullanicida Delete butonuna tiklar
    #And Admin20 kulanicinin silindigini dogrular






