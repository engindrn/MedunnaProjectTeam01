Feature: US_016 Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  @US016_11
  Scenario: DB ile oda bilgilerini doğrulayın
    Given Admin16 connection kurar
    Then  Admin16 kayitli oda bilgilerini databaseden ceker
    And  Admin16 oda bilgilerini dogrular
