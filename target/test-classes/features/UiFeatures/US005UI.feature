@us005
Feature: US_005 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  @tc01
  Scenario:Hastalar gecerli bilgilerle randevu olusturabilmeli


    Given Kullanici05 "url" ye gider
    When Randevu olusturmak icin Ana sayfadaki Make an Appointment butonuna tiklar
    And Kullanici05 herhangi firstname "Hasta" girer
    And Kullanici05 herhangi lastname "Team01" girer
    And Kullanici05 kayitli "500-10-5002" girer
    And Kullanici05 gecerli "hastateam01@gmail.com" adresi girer
    And Kullanıcı05 üc ve altinci rakamdan sonra tire olan on rakamlı "123-456-7890" girer
    And Kullanici05 randevu tarihini secer
    And USbes 1 saniye bekler
    And Randevuyu gondermek icin Send an Appointment Request butonuna tiklar
    Then Kullanici05 ekranda Appointment registration saved mesajini gorür


  @tc02
  Scenario: Kullanici randevu olustururken "Firstname,Lastname,SSN numarasi,Telefon Numarasi,E-Mail" bölümleri bos birakamaz

    Given Kullanici05 "url" ye gider
    And USbes 2 saniye bekler
    When Randevu olusturmak icin Ana sayfadaki Make an Appointment butonuna tiklar
    And USbes 2 saniye bekler
    And Kullanici05 First Name bölümünü bos birakir
    And USbes 2 saniye bekler
    And Kullanici05 Last Name bölümünü  bos birakir
    And USbes 2 saniye bekler
    And Kullanici05 SSN Numarasi bölümünü  bos birakir
    And USbes 2 saniye bekler
    And Kullanici05 E-Mail bölümünü  bos birakir
    And USbes 2 saniye bekler
    And Kullanici05 Telefon Numarasi  bölümünü  bos birakir
    And USbes 2 saniye bekler
    Then Your FirstName is required yazisini görür
    And USbes 2 saniye bekler
    Then Your LastName is required yazisini görür
    And USbes 2 saniye bekler
    Then Your SSN is required yazisini görür
    And USbes 2 saniye bekler
    Then Your email is required yazisini görür
    And USbes 2 saniye bekler
    Then Phone number is required yazisini görür
    And USbes 2 saniye bekler
    And Randevuyu gondermek icin Send an Appointment Request butonuna tiklar
    And USbes 3 saniye bekler
    Then Kullanici05 ekranda Appointment registration saved mesajini göremez

  @tc03
  Scenario: Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.

    Given Kullanici05 "url" ye gider
    And USbes 1 saniye bekler
    When Giris simgesine tiklar
    And USbes 1 saniye bekler
    And Sign in simgesine tiklar
    And USbes 1 saniye bekler
    And Username alanina gecerli bir "Hastateam01" girer
    And USbes 1 saniye bekler
    And Password alanina gecerli bir "Hastateam.01" girer
    And USbes 1 saniye bekler
    And Sign in butonuna tiklar
    And USbes 1 saniye bekler
    Then Hasta oturum acildigini dogrular
    And USbes 1 saniye bekler
    And My Pages e tiklar
    And USbes 1 saniye bekler
    And My Appoitmente tiklar
    And USbes 1 saniye bekler
    And Kullainici05 olusturdugu randevulari görür

  @tc04
  Scenario:   Hasta gecersiz bilgilerle randevu olusturamamali

    Given Kullanici05 "url" ye gider
    And USbes 1 saniye bekler
    When Randevu olusturmak icin Ana sayfadaki Make an Appointment butonuna tiklar
    And USbes 1 saniye bekler
    And Kullanici05 herhangi firstname "Hasta" girer
    And USbes 1 saniye bekler
    And Kullanici05 herhangi lastname "Team01" girer
    And USbes 1 saniye bekler
    And Kullanici05 kayitli "500-10-5002" girer
    And USbes 1 saniye bekler
    And Kullanici05 gecerli "hastateam01@gmail.com" adresi girer
    And USbes 1 saniye bekler
    And Kullanici on haneli telefon numarasi girer
    And USbes 1 saniye bekler
    And Kullanici05 randevu tarihini secer
    And USbes 1 saniye bekler
    And Randevuyu gondermek icin Send an Appointment Request butonuna tiklar
    And USbes 3 saniye bekler
    Then Kullanici05 ekranda Appointment registration saved mesajini gorememeli

