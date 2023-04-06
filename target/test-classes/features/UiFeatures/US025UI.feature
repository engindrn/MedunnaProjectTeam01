@US_025
Feature: Kullanici hasta portalindan randevu alabilmeli

  Background: Kullanici hasta ilgili portala giris yapar
    Given KullaniciSu ilgili test sayfasina gider
    Then KullaniciSu hasta olarak giris yapar

  Scenario: Kullanici hasta gerekli bilgilerle randevu olusturabilmeli
    And KullaniciSu FirstName bolumune ismini girer
    And KullaniciSu LastName bolumune soy ismini girer
    And KullaniciSu SSN bolumune gecerli bir SSN girer
    And KullaniciSu email bolumune email girer
    And KullaniciSu Phone bolumune gecerli bir tel nosu girer
    And KullaniciSu date bolumunde guncel bir tarih secer
    And KullaniciSu Send an Appointment Request butonuna tiklar
    And KullaniciSu Randevu olusturuldugunu kontrol eder
    Then KullaniciSu sayfayi kapatir

  Scenario: Kullanici hasta gecmis tarih girdiginde randevu olusturamamali
    And KullaniciSu FirstName bolumune ismini girer
    And KullaniciSu LastName bolumune soy ismini girer
    And KullaniciSu SSN bolumune gecerli bir SSN girer
    And KullaniciSu email bolumune email girer
    And KullaniciSu Phone bolumune gecerli bir tel nosu girer
    And KullaniciSu date bolumunde gecmis tarih secer
    And KullaniciSu Randevu tarihi gecmis tarih olamaz yazisini gorur
    And KullaniciSu Send an Appointment Request butonuna tiklar
    And kullaniciSu 2 sn bekler
    Then KullaniciSu ekranda Appointment registration saved mesajini gorememeli
    Then KullaniciSu sayfayi kapatir

  Scenario: Kullanıcı hasta tarih formatının istenen sekilde oldugunu dogrular
    And KullaniciSu MyPages sekmesine tiklar
    And KullaniciSu MyAppointment secenegini secer
    And KullaniciSu tarihin formatini dogrular
    Then KullaniciSu sayfayi kapatir