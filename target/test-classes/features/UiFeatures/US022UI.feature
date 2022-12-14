@US022

Feature: Hasta Test sonuçları (Staff)

  Background: US022 Ortak adimlar
    Given Personel022 url adresine gider
    And Personel022 Giris simgesine tiklar
    And Personel022 Sign in simgesine tiklar
    And Personel022 Username alanina gecerli bir username girer
    And Personel022 Password alanina gecerli bir password girer
    And Personel022 Sign in butonuna tiklar
    And Personel022 My Pages butonunu tiklar
    And Personel022 Patient butonuna tiklar
    Then Personel022 acilan sayfada search kutusuna aranacak hasta SSN id numarasini girer


  Scenario: US022 TC001
    Given Personel022 Aranan SSN id numarali hastanin bilgilerinin goruldugunu dogrular


  Scenario: US022 TC002
    Given Personel022 Girilen SSN numarali hastada Show Appointment butonuna tiklar
    And Personel022 Show Tests butonuna tiklar
    And Personel022 View Results butonuna tiklar
    Then Personel022 hastanin test sonuclarinin goruldugunu dogrular


  Scenario: US022 TC003
    Given Personel022 Girilen SSN numarali hastada Show Appointment butonuna tiklar
    And Personel022 Show Tests butonuna tiklar
    And Personel022 View Results butonuna tiklar
    And Personel022 Test Results sayfasinda Edit butonuna tiklar
    And Personel022 hastanin ID, Date, Result, description, Created date bilgilerinin goruldugunu dogrular
    And Personel022 hastanin Result ve Description bilgilerini gunceller
    And Personel022 saveE butotuna tiklar
    Then Personel022 hastanin Result ve Description bilgilerini guncellendigini dogrular




