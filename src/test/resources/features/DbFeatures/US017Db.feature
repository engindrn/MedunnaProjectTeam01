@US017_DbTest
Feature: US017 database test
  @US017_TC01
  Scenario: Admin olusturulan testItem "id,name,description,defaultValMin,DefaulValMax"
  bilgilerini Database ile dogrulayabilmelidir.
    Given Admin17 connection kurar.
    And Admin17 yeni kayitli test bilgilerini databaseden ceker.
    Then Admin17 test bilgilerini dogrular.