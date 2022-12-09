@US016
Feature: US_016 Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  Background: Ortak adimlar
    Given Admin16 "medunnaUrl16" sayfasina gider
    Then Admin16 kisi simgesinin uzerine tiklar
    And Admin16 acilan pencerede Sign in ' in uzerine tiklar
    And Admin16 username alanina gecerli bir username girer
    And Admin16 password alanina gecerli bir password girer
    And Admin16 Sign in butonuna tiklar
    Then Admin16 items&titles sekmesine tiklar
    And Admin16 acilan sekmede room opsiyonunu secer

  @US016_1
  Scenario: TC_001 Admin, yatan hastalar için yeni oda oluşturabilir.
    And  Admin16 create a new room butonunu tiklar
    And  Admin16 room number alanini doldurur
    And  Admin16 room type secer
    And  Admin16 price alanini doldurur
    And  Admin16 save butonunu tiklar
    And  Admin16 "A new Room is created with identifier" yazisini gorur
    And  Admin16 sayfayi kapatir


  @US016_2
  Scenario: TC_002 Oda oluşturulurken "Room Number" mutlaka olmalı, "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
    And  Admin16 create a new room butonunu tiklar
    And  Admin16 room number alanini doldurur
    And  Admin16 room type alanina tiklar ve TWIN opsiyonunu secer
    And  Admin16 room type alanina tiklar ve DELUXE opsiyonunu secer
    And  Admin16 room type alanina tiklar ve PREMIUM_DELUXE opsiyonunu secer
    And  Admin16 room type alanina tiklar ve SUIT opsiyonunu secer
    And  Admin16 room type alanina tiklar ve DAYCARE opsiyonunu secer
    And  Admin16 sayfayi kapatir


  @US016_3
  Scenario: TC_003 Oda için "Status" ayarlanabilir olmalı.
    And Admin16 create a new room butonunu tiklar
    And Admin16 status sekmesinin tiklanabildigini dogrular
    And  Admin16 sayfayi kapatir


  @US016_4
  Scenario: TC_004 Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    And  Admin16 create a new room butonunu tiklar
    And  Admin16 price alanini doldurur
    And  Admin16 price alanini temizler ve  bos birakir
    And  Admin16 save butonuna tiklar
    And  Admin16 price bolumunde "This field is required" yazisini gorur
    And  Admin16 sayfayi kapatir


  @US016_5.1
  Scenario: TC_005_1 "Description" isteğe bağlı olarak doldurulmalı.
    And  Admin16 create a new room butonunu tiklar
    And  Admin16 room number alanini doldurur
    And  Admin16 price alanini doldurur
    And  Admin16 Description alanini bos birakir
    And  Admin16 save butonuna tiklar
    And  Admin16 "A new Room is created with identifier" yazisini gorur
    And  Admin16 sayfayi kapatir


  @US016_5.2
  Scenario: TC_005_2 "Description" isteğe bağlı olarak doldurulmalı.
    And  Admin16 create a new room butonunu tiklar
    And  Admin16 room number alanini doldurur
    And  Admin16 price alanini doldurur
    And  Admin16 Description alanini doldurur
    And  Admin16 save butonuna tiklar
    And  Admin16 "A new Room is created with identifier" yazisini gorur
    And  Admin16 sayfayi kapatir


  @US016_6
  Scenario: TC_006 "Created Date" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli.
    And  Admin16 create a new room butonunu tiklar
    And  Admin16 room number alanini doldurur
    And  Admin16 price alanini doldurur
    And  Admin16 tarihi gun,ay,yil seklinde gecmis bir tarih girer
    And  Admin16 save butonuna tiklar
    And  Admin16 "A new Room is created with identifier" yazisini gorur
    And  Admin16 sayfayi kapatir


  @US016_7
  Scenario: TC_007 Admin aynı tür odaları görebilir.
    And  Admin16 room type basliginin uzerine tiklar
    And  Admin16 ayni tur odalari gorebildigini dogrular
    And  Admin16 sayfayi kapatir


  @US016_8
  Scenario: TC_008 Admin mevcut odaları düzenleyebilir ve güncelleyebilir.
    And  Admin16 odanin bulundugu sekmeye tiklar
    And  Admin16 odayi duzenlemek icin edit sekmesine tiklar
    And  Admin16 room type alaninda degisiklik yapar
    And  Admin16 price alaninda degisiklik yapar
    And  Admin16 save butonuna tiklar
    And  Admin16 A Room is updated with identifier yazisini gorur
    And  Admin16 sayfayi kapatir


  @US016_10
  Scenario: TC_010 Odalar Admin tarafından silinebilir.
    And  Admin16 odayi silmek icin delete sekmesine tiklar
    And  Admin16 acilan pencerede tekrar delete butonuna tiklar
    And  Admin16 A Room is deleted with identifier yazisini gorur
    And  Admin16 sayfayi kapatir


















