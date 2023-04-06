@US_021
Feature:US_021 Staff hastalar icin randevuları gorur

  Background: Ortak adimlar
    Given KullaniciSu ilgili test sayfasina gider
    Then KullaniciSu staff olarak giris yapar
    And Su Staff My Pages sayfasina tiklar
    And Su Staff Search Patient butonuna tiklar
    And Su Staff Show Appointments butonuna tiklar
    And Su Staff Show Appointments ilk sutundaki edit butonuna tiklar

  @US_021_TC_001
  Scenario:Staff sadece randevulari guncelleyebilir.

    And Su Staff Create or Edit an Appointment sayfasindaki randevu tarih bilgilerini duzenler
    And kullaniciSu 2 sn bekler
    And Su Save butonuna tiklar
    And kullaniciSu 3 sn bekler
    And Su The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And KullaniciSu sayfayi kapatir


  @US_021_TC_002_01
  Scenario:Staff hasta durumunu (status) "UNAPPROVED" yapabilmeli.

    And Su Staff edit appointment sayfasinda status kismini UNAPPROVED yapar
    And kullaniciSu 4 sn bekler
    And Su Kullanici sayfayi asagi kaydirir
    And kullaniciSu 2 sn bekler
    And Su Save butonuna tiklar
    And kullaniciSu 4 sn bekler
    And Su The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And KullaniciSu sayfayi kapatir


  @US_021_TC_002_02
  Scenario:Staff hasta durumunu (status) "PENDING" yapabilmeli.

    And Su Staff edit appointment sayfasinda status kismini PENDING yapar
    And Su Kullanici sayfayi asagi kaydirir
    And kullaniciSu 3 sn bekler
    And Su Save butonuna tiklar
    And kullaniciSu 4 sn bekler
    And Su The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And KullaniciSu sayfayi kapatir


  @US_021_TC_002_03
  Scenario:Staff hasta durumunu (status) "CANCELLED" yapabilmeli.

    And Su Staff edit appointment sayfasinda status kismini CANCELLED yapar
    And kullaniciSu 4 sn bekler
    And Su Kullanici sayfayi asagi kaydirir
    And kullaniciSu 2 sn bekler
    And Su Save butonuna tiklar
    And kullaniciSu 2 sn bekler
    And Su The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And KullaniciSu sayfayi kapatir


  @US_021_TC_002_04
  Scenario:Staff hasta durumunu (status) "COMPLETED" yapamamali.

    And kullaniciSu 2 sn bekler
    And Su Staff edit appointment sayfasinda status kismini COMPLETED seceneginin secilemedigini onaylar
    And kullaniciSu 2 sn bekler
    And KullaniciSu sayfayi kapatir

  @US_021_TC_003
  Scenario:"Staff ""Anamnesis (Hastalik Gecmisi), Treatment ( Tedavi) veya Diagnosis(Teshis)"" kisimlarina girmemeli."

    And Su Staff Anamnesis,Treatment,Diagnosis kisimlarini doldurur
    And kullaniciSu 2 sn bekler
    And Su Kullanici sayfayi asagi kaydirir
    And kullaniciSu 2 sn bekler
    And Su Save butonuna tiklar
    And kullaniciSu 4 sn bekler
    And Su The Appointment is updated with identifier uyarisinin gorulmedigini onaylar
    And KullaniciSu sayfayi kapatir

  @US_021_TC_004
  Scenario:Hasta icin gerekli doktoru secebilmeli ve randevuyu olusturmali.

    And kullaniciSu 2 sn bekler
    And Su Kullanici sayfayi asagi kaydirir
    And kullaniciSu 2 sn bekler
    And Su Staff bir doktor secer
    And kullaniciSu 5 sn bekler
    And Su Kullanici sayfayi asagi kaydirir
    And Su Save butonuna tiklar
    And kullaniciSu 2 sn bekler
    And Su The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And KullaniciSu sayfayi kapatir