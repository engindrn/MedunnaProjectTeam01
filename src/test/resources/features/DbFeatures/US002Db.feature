@US002_Db
Feature:US002_Kayit olmak icin email and username bilgileri girilebilmelidir.

  @US002_TC07
  Scenario:US002_TC07 Email DB ile dogrulanmalidir
    When DB ile tablodan gerekli sutunu alir
    Then DB ile email dogrulamasini yapar