@US012
Feature: US012 Physician (Doktor) test isteyebilmeli (My Appoitments/Edit/Request A Test)


  @US012TC001
  Scenario:TC01 Doktor test isteyebilmeli "Request A Test"
    Given Doktor url adresine gider
    And 3 saniye bekler
    When Giris simgesine tiklar
    And 3 saniye bekler
    And Sign in simgesine tiklar
    And 3 saniye bekler
    And Username alanina gecerli bir username girer
    And 3 saniye bekler
    And Password alanina gecerli bir password girer
    And 3 saniye bekler
    And Sign in butonuna tiklar
    And 3 saniye bekler
    And My Pages e tiklar
    And 3 saniye bekler
    And My Appoitmente tiklar
    And 3 saniye bekler
    And Test isteyecegi hastanin üzerine gelip edit e tiklar
    And 3 saniye bekler
    And Acilan sayfada "Request A Test" e tiklar
    And 3 saniye bekler
    Then Acilan sayfada testlerin görüldügünü dogrular

  @US012TC002
  Scenario: TC02 Test iceriginde "Glucose,Urea,Creatinine,Sodium,Potassium,Total Protein,Albumin,Hemoglobin" secenekleri olmalidir
    Given Doktor url adresine gider
    And 3 saniye bekler
    When Giris simgesine tiklar
    And 3 saniye bekler
    And Sign in simgesine tiklar
    And 3 saniye bekler
    And Username alanina gecerli bir username girer
    And 3 saniye bekler
    And Password alanina gecerli bir password girer
    And 3 saniye bekler
    And Sign in butonuna tiklar
    And 3 saniye bekler
    And My Pages e tiklar
    And 3 saniye bekler
    And My Appoitmente tiklar
    And 3 saniye bekler
    And Test isteyecegi hastanin üzerine gelip edit e tiklar
    And 3 saniye bekler
    And Acilan sayfada "Request A Test" e tiklar
    And 3 saniye bekler
    And Doktor Urea testi ister
    And 5 saniye bekler
    And Doktor Sodium testi ister
    And 5 saniye bekler
    And Doktor Albumin testi ister
    And 5 saniye bekler
    And Doktor Hemoglobin testi ister
    And 5 saniye bekler
    And Doktor Potasyum testi ister
    And 5 saniye bekler
    And Doktor Glukose testi ister
    And 5 saniye bekler
    And Doktor Creatinine testi ister
    And 3 saniye bekler
    And Doktor Total Protein testi ister
    And 5 saniye bekler
    And Doktor save butonuna tiklar
