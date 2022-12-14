
@US019_API_Test
Feature:Admin olarak; Yeni Staff (Personel) Olusturma / Guncelleme / Goruntuleme ve Silme


  Scenario:  Kullanici staff bilgilerini API ile dogrulayabilmelidir

    Given Kullanici19 Request gönderir Response alir
    Then Kullanici19 status kodunun 200 oldugunu dogrular
    Then Kullanici19 staff in  bilgilerini dogrular