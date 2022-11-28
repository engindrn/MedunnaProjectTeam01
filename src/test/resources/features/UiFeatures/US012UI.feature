@US012
Feature: US012 Physician (Doktor) test isteyebilmeli (My Appoitments/Edit/Request A Test)
  Background: Ortak adimlar
Given Doktor12 url adresine gider
And  3 saniye bekler
When Doktor12 Giris simgesine tiklar
And  3 saniye bekler
And Doktor12 Sign in simgesine tiklar
And  3 saniye bekler
And Doktor12 Username alanina gecerli bir username girer
And 3 saniye bekler
And Doktor12 Password alanina gecerli bir password girer
And 3 saniye bekler
And Doktor12 Sign in butonuna tiklar
And 3 saniye bekler
And Doktor12 My Pages e tiklar
And 3 saniye bekler
And Doktor12 My Appoitmente tiklar
And 3 saniye bekler
And Doktor12 Test isteyecegi hastanin üzerine gelip edit e tiklar
And 3 saniye bekler
And Doktor12 Acilan sayfada "Request A Test" e tiklar
And 3 saniye bekler

  @US012TC001
  Scenario:TC01 Doktor test isteyebilmeli "Request A Test"

    Then Doktor12 Acilan sayfada testlerin görüldügünü dogrular

  @US012TC002
  Scenario: TC02 Test iceriginde "Glucose,Urea,Creatinine,Sodium,Potassium,Total Protein,Albumin,Hemoglobin" secenekleri olmalidir

    And Doktor12 Urea testi ister
    And 5 saniye bekler
    And Doktor12 Sodium testi ister
    And 5 saniye bekler
    And Doktor12 Albumin testi ister
    And 5 saniye bekler
    And Doktor12 Hemoglobin testi ister
    And 5 saniye bekler
    And Doktor12 Potasyum testi ister
    And 5 saniye bekler
    And Doktor12 Glukose testi ister
    And 5 saniye bekler
    And Doktor12 Creatinine testi ister
    And 3 saniye bekler
    And Doktor12 Total Protein testi ister
    And 5 saniye bekler
    And Doktor12 save butonuna tiklar
