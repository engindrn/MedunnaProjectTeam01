
@US019_DBTest
 Feature: US019 Database test

   Scenario: Kullanici Staff bilgilerini Database üzerinden dogrular

     Given Kullanici19 connection kurar
     When Kullanici19 query olusturur
     Then Kullanici19 staff bilgileri dogrular
