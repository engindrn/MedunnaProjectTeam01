@US015
Feature: US015 Admin tarafindan hasta olusturma ve duzenleme

  @US015_TC001
  Scenario: TC001 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir

    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Patient tiklar
    Then  YS admin acilan pencerede Create a new Patient butonunun gorunur oldugunu dogrular ve tiklar
    And   YS admin acilan pencerede gecerli bilgileri girer ve save buttonuna tiklar
    And   YS admin kayit isleminin gerceklestigini dogrular
    And   YS sayfayi kapatir

  @US015_TC002
  Scenario: TC002 Yönetici "SSN, First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,
  Description,Created Date,User,Country and state/City" gibi hasta bilgilerini görebilir.
    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Patient tiklar
    And   YS admin acilan pencerede SSN,First Name,Last Name,Birth Date,Phone, Gender,Blood Group,Address,Description,Created Date,User,Country and city title'larinin gorunur oldugunu dogrular
    And   YS sayfayi kapatir

  @US015_TC003
  Scenario: TC003 Hasta oluşturulduğunda veya güncellendiginde
  yukarıdaki ogelere data girisi yapilabilmeli.
    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Patient tiklar
    Then  YS admin acilan pencerede Create a new Patient butonunun gorunur oldugunu dogrular ve tiklar
    And   YS admin acilan pencerede gecerli bilgileri girer ve save buttonuna tiklar
    And   YS admin id tiklar olusturulan hastaya edit yapar
    Then  YS admin hastanin email,phone,adres,description bilgisini gunceller
    And   YS Save buttonuna tiklar ve "A Patient is updated with identifier" mesajinin gorundugunu dogrular
    And   YS sayfayi kapatir

  @US015_TC004
  Scenario:TC004 Hastaya doktoru sadece Admin atayabilir.

    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Appointment tiklar
    And   YS admin Create a new Appointment butonuna tiklar
    Then  YS admin gecerli randevu tarihlerini secer
    Then  YS admin status,physician ve patient bilgisi secer
    And   YS admin Save buttonuna tiklar ve "A new Appointment is created with identifier" mesajinin gorundugunu dogrular
    And   YS sayfayi kapatir

  @US015_TC005
  Scenario: TC005 "Country", "US state" olmali ve bos bırakilmamali

    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Patient tiklar
    Then  YS admin acilan pencerede Create a new Patient butonunun gorunur oldugunu dogrular ve tiklar
    And   YS admin acilan pencerede Country ve State disindaki hasta bilgilerini girer
    And   YS admin save butonuna tiklar ve "A new Appointment is created with identifier" mesajinin gorunur olmadigini dogrular
    And   YS sayfayi kapatir

  @US015_TC006
  Scenario:TC006 Admin herhangi bir hastayi silebilir
    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Patient tiklar
    Then  YS admin acilan pencerede Create a new Patient butonunun gorunur oldugunu dogrular ve tiklar
    And   YS admin acilan pencerede gecerli bilgileri girer ve save buttonuna tiklar
    And   YS admin id tiklar olusturulan hastaya delete yapar ve popUpta delete buttona tiklar
    And   YS "A Patient is deleted with identifier" mesajinin gorundugunu dogrular
    And   YS sayfayi kapatir

  @US015_TC004_Negative
  Scenario:TC004_Negative Hastaya doktoru sadece Admin atayabilir.
    Given YS "admin15" "medunnaUrl" e gider
    When  YS admin login olur
    Then  YS admin Items&Titles menuden Appointment tiklar
    And   YS admin Create a new Appointment butonuna tiklar
    Then  YS admin gecersiz randevu tarihlerini secer
    And   YS admin Save buttonuna tiklar ve "Appointment start date time can not be greater than end date time" mesajinin gorundugunu dogrular
