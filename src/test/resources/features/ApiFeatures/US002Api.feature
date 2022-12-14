@US002_Api
Feature:US002_Kayit olmak icin email and username bilgileri girilebilmelidir.

  @US002_TC06 @ApiRegistrant
  Scenario:US002_TC06 Kullanici adi API kullanilarak dogrulanmalidir
    When kullanici pathparams ve bearer token ayarlamasini yapar
    Then kullanici adini dogrular

  @US002_TC07 @ApiRegistrant
    Scenario:US002_TC07 Email adresi API ile dogrulanmali
      When kullanici pathparams ve bearer token ayarlamasini yapar
      Then kullanici email adresini dogrular
