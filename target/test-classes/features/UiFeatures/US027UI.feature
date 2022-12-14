@US_027
Feature:US027 Messages by Admin Validate with API and DB

  Background:Ortak adimlar

    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And YP admin item&titles sekmesini acar
    And YP admin messages butonuna tiklar

  @US_027_TC_01
  Scenario:US_027_TC_01_Admin, mesaj portalina gidebilir ve tum mesajlari, yazarlarini ve e-postalarini goruntuleyebilir.

    And YP admin messages sayfasindaki ilk view butonuna tiklar
    And YP admin name, email, message kisimlarinin goruldugunu onaylar
    And YP SayfayiKapatir

  @US_027_TC_02
  Scenario:US_027_TC_02_Admin, mesajlari olusturabilir.

    And YP admin create a new message butonuna tiklar
    And YP admin yeni mesaj icin ilgili alanlari doldurur
    And YP Save butonuna tiklar
    And YP The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And YP SayfayiKapatir

  @US_027_TC_03
  Scenario:US_027_TC_03_Admin, mesajlari guncelleyebilir.

    And YP admin messages sayfasindaki ilk edit butonuna tiklar
    And YP admin yeni mesaj icin ilgili alanlari doldurur
    And YP Save butonuna tiklar
    And YP The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And YP SayfayiKapatir

  @US_027_TC_04
  Scenario: US_027_TC_04_Admin, mesajlari silebilir.

    And YP admin messages sayfasindaki ilk delete butonuna tiklar
    And YP admin acilan popup da delete butonunun tiklanabilir oldugunu onaylar
    And YP SayfayiKapatir



