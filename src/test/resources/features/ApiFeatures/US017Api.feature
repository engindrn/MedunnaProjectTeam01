@ApiTestUS017
Feature: Test items(öge) Olustur / Güncelle / Sil

  @ApiTestUS017GET
  Scenario: API ile dogrulayın.
    Given   MP Admin Medunna for get request the Test Item
    When    MP User send Get request
    Then    MP Status code is 200
    And MP Verify expected data equals to actual data

  @US017APIPOST
  Scenario: Test Item API da Post yaparak dogrulayin
    Given   Admin MP goes to Medunna for post request the Test Item
    When    Admin MP sends Post request
    Then    Admin MP Status code is 201 oldugunu dogrular
    And     Admin MP Verify expected data equals to actual data