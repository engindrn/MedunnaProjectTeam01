Feature: US09 Api test

  @DBTest
  Scenario: US09 Staff Api kullanarak  hastanin bilgilerini doğrulamalıdır.
  Given Kullanici09 Get request gonderir ve response ile hasta bilgilerini alir
  And Kullanici09 Status kodunun 200 oldugunu dogrular
  Then Kullanici09 hasta bilgilerini dogrular
