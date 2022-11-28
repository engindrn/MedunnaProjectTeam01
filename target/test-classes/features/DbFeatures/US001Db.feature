@US001_Db
Feature:US001_Kayit olmak icin SSN, Firstname ve Lastname bilgileri girilebilmelidir


  @US001_TC11
  Scenario:US001_TC11 DB ile SSN kimlikleri dogrulanmalidir
    Given Kullanici connetion kurar
    When Kullanici SSN bilgisini ceker
    Then Kullanici SSN bilgisiri dogrular