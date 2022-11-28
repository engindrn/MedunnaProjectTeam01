@US009
Feature: US009 Staff (Personel)


  Background: Ortak adimlar
    Given Personel09 Medunna ana sayfasinda
    When Personel09 Giris simgesini tiklar
    And Personel09 Sign in simgesini tiklar
    And Personel09 username alanina gecerli bir username girer
    And Personel09 password alanina gecerli bir password girer
    And Personel09 Signin butonuna tiklar
    And Personel09 My Pages butonunu tiklar
    And Personel09 Patient butonuna tiklar


  @US009_TC_001
  Scenario: US009 TC_001

    And acilan sayfada search kutusuna aranacak hasta SSN numarasini girer
    Then Aranan SSN numarali hastanin bilgilerinin goruldugunu dogrular


  @US009_TC_002
  Scenario: US009 TC_002
    And acilan sayfada search kutusuna aranacak hasta SSN numarasini girer
    And Personel09 girilen SSN Numarali hastada edit butonuna tiklar
    And First Name' i istenen first name ile degistirir
    And Last Name' i istenen last name ile degistirir
    And Phone'u istenen Phone ile degistirir
    And Gender'i istenen Gender ile degistirir
    And Blood Group' u istenen blood grup ile degistirir
    And Address' i istenen adres ile degistirir
    And Description'u istenen description ile degistirir
    And User'i istenen user ile degistirir
    And Country bilgisini  istenen country ile degistirir
    And State-city bilgisini istenen State bilgisi ile degistirir
    And Save butonuna tiklar
    And Patient is Updated yazisini gorur
    Then Hasta bilgilerinin degistigini dogrular



  @US009_TC_003
  Scenario: US009 TC_003

    And Acilan sayfada search kutusuna aranacak hasta SSN numarasini girer
    Then Aranan SSN numarali hastanin kayit bilgilerini doldurdugunu dogrular

  @US009_TC_006
  Scenario: US009 TC_006

    And Acilan sayfada search kutusuna hasta SSN numarasini girer
    And Personel09 girilen SSN Numarali hastada edit butonuna tiklar
    And Hastanin Description bilgisini siler
    And Save butonuna tiklar
    Then Description bilgisinin silindigini dogrular



