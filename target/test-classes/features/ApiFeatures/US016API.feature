Feature: US_016 Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  @US016_09
  Scenario: API ile oda oluşturma, okuma, güncelleme ve silme doğrulanmalı.

    Given Admin16 oda olusturmek icin medunna sayfasina gider
    Then Admin16 response ile oda bilgilerini girer
    And  Admin16 Status kodunun 201 oldugunu dogrular.
    And  Admin16 alinan bilgileri dogrular

    Then  Admin16 get request gonderir ve response ile oda bilgilerini alir.
    Then  Admin16 Status kodunu 200 oldugunu dogrular.
    And   Admin16 oda bilgilerini dogrular.

    Then Admin16 get request gonderir ve response ile oda bilgileri alir ve degisiklik yapar
    And  Admin16 Status kodunun 200 oldugun dogrular.
    And  Admin16 alinan bilgiler dogrular.

    And  Admin16 oda bilgilerinde siler
    And  Admin16 Status kodunun 204 oldugu dogrular.