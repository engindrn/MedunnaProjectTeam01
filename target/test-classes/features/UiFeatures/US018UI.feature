Feature:US_018 Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  Background: Admin doktor alanina giris

    Given Admin medunna_url sayfasina gider
    When  Admin anasayfadaki kullanici ikonunun altindaki Sing in butonuna tiklar
    And   Admin acilan sayfada username ve password girer ve Sing in butonuna tiklar
    And   Admin acilan sayfada Items&Titles altindaki Physician butonuna tiklar

    @US018_TC01
    Scenario:US018_TC01 Admin doktorlarin bilgilerini gorebilmeli

      And   Admin acilan sayfada ilk siradaki doktorun bilgilerini gormek icin view butonuna tiklar
      Then  Admin doktorun bilgilerini gorur

     @US018_TC02
    Scenario:US018_TC02 Admin SSN kimligine gore kayitli bir kisiyi secebilir/arayabilir

    And  Admin create a new Physician butonuna tiklar
    And  Admin Use Search box'a tik atar
    And  Admin SSN box'a gecerli bir SSN girer
    And  Admin Search User butonuna tiklar
    Then Admin User found with search SSN mesajini gorur


   @US018_TC03
   Scenario:US018_TC03 Admin kisinin "firstname, lastname, birth date ..." bilgilerini doldurabilmeli

       And  Admin create a new Physician butonuna tiklar
       And  Admin Use Search box'a tik atar
       And  Admin SSN box'a gecerli bir SSN girer
       And  Admin Search User butonuna tiklar
       And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur
       Then Admin doktorun bilgilerini dogrular

   @US018_TC04
    Scenario:US018_TC04 Admin doktor icin bir uzmanlik alani secebilmeli

     And  Admin create a new Physician butonuna tiklar
     And  Admin Use Search box'a tik atar
     And  Admin SSN box'a gecerli bir SSN girer
     And  Admin Search User butonuna tiklar
     And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur
     And  Admin doktor icin bir uzmanlik alani secer
     Then Admin doktorun uzmanlik alanini dogrular

   @US018_TC05
    Scenario:US018_TC05 Admin doktorun profil resmini saglayabilir

     And  Admin create a new Physician butonuna tiklar
     And  Admin Use Search box'a tik atar
     And  Admin SSN box'a gecerli bir SSN girer
     And  Admin Search User butonuna tiklar
     And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur
     And  Admin doktor icin bir uzmanlik alani secer
     And  Admin doktorun profil resmini saglar
     Then Admin doktorun profil resmini dogrular

   @US018_TC06
    Scenario:US018_TC06 Admin doktorun muayene ucretini girebilmelidir

     And  Admin create a new Physician butonuna tiklar
     And  Admin Use Search box'a tik atar
     And  Admin SSN box'a gecerli bir SSN girer
     And  Admin Search User butonuna tiklar
     And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur
     And  Admin doktor icin bir uzmanlik alani secer
     And  Admin doktorun profil resmini saglar
     And  Admin doktorun muayene ucretini girer
     Then Admin doktorun muayene ucretini dogrular

   @US018_TC07
  Scenario:US018_TC07 Admin mevcut kullanicilar arasindan doktoru secebilmelidir

     And  Admin create a new Physician butonuna tiklar
     And  Admin Use Search box'a tik atar
     And  Admin SSN box'a gecerli bir SSN girer
     And  Admin Search User butonuna tiklar
     And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur
     And  Admin doktor icin bir uzmanlik alani secer
     And  Admin doktorun profil resmini saglar
     And  Admin doktorun muayene ucretini girer
     And  Admin mevcut kullanicilar arasindan doktoru secer
     Then Admin secilen doktoru dogrular

   @US018_TC08
  Scenario:US018_TC08 Admin doktor bilgilerini kaydedebilmeli ve doktor bilgilerini gorebilmeli

     And  Admin create a new Physician butonuna tiklar
     And  Admin Use Search box'a tik atar
     And  Admin SSN box'a gecerli bir SSN girer
     And  Admin Search User butonuna tiklar
     And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini doldurur
     And  Admin doktor icin bir uzmanlik alani secer
     And  Admin doktorun profil resmini saglar
     And  Admin doktorun muayene ucretini girer
     And  Admin mevcut kullanicilar arasindan doktoru secer
     And  Admin save butonuna tiklar
     Then Admin doktorun kaydedilip kaydedilmedigini dogrular

   @US018_TC09
    Scenario:US018_TC09 Admin doktorun bilgilerini  "Edit butonu" uzerinden duzenleyebilir.

     And  Admin ilk siradaki doktorun bilgilerini duzenlemek icin edit butonuna tiklar
     And  Admin doktorun firstname, lastname, birthDate gibi bilgilerini degistirir
     And  Admin save butonuna tiklar
     Then Admin A Physician is updated mesajini gorur


   @US018_TC10
  Scenario:US018_TC10 Admin herhangi bir doktoru siler

     And  Admin ilk siradaki doktoru silmek icin delete butonuna tiklar
     And  Admin acilan Confirm Delete Operation uyari mesajinda delete butonuna tiklar
     Then Admin A Physician is deleted mesajini gorur



