@US013
Feature:US013 Physician (Doktor) "Test Results" işlemleri yapabilmeli(My Appointments / Edit / Test Results)
  @US013TC001
  Scenario: TC001 Testler talep edildikten sonra Staff  test sonuclarini güncellemelidir

    Given Staff13 url adresine gider
    When Staff13 Giris simgesine tiklar
    And Staff13 Sign in simgesine tiklar
    And 3 saniye bekler.
    And Staff13 Username alanina gecerli bir username girer
    And 3 saniye bekler.
    And Staff13 Password alanina gecerli bir password girer
    And 3 saniye bekler.
    And Staff13 Sign in butonuna tiklar
    And 3 saniye bekler.
    And Staff13 My Pages e tiklar
    And 3 saniye bekler.
    And Staff13 search Patiente tiklar
    And 3 saniye bekler.
    And Staff13 Test sonuclarini güncelleyecegi hastanin SSN numarasini girer
    And 3 saniye bekler.
    And Staff13 SSN ini girdigi hastada show appoitments e tiklar
    And 3 saniye bekler.
    And Staff13 Show test e tiklar
    And 3 saniye bekler.
    And Staff13 View Result a tiklar
    And 3 saniye bekler.
    And Staff13 Edit e tiklar
    And 3 saniye bekler.
    Then Staff13 Tum Resultlari(Sodyum,Potasyum;Glukose,Ure,Creatinine,Total Protein,Albumin ,Hemoglobin) günceller


  @US013TC002
  Scenario: TC002 "Request Impatient" (hastanin yatili tedavi görmesi )  isteginde bulunabilmelidir

    Given Doktor13 "medunnaUrl" adresine gider.
    When Doktor13 Giris simgesine tiklar.
    And Doktor13 Sign in simgesine tiklar.
    And Doktor13 Username alanina gecerli bir username girer.
    And Doktor13 Password alanina gecerli bir password girer.
    And Doktor13 Sign in butonuna tiklar.
    And Doktor13 My Pages e tiklar.
    And Doktor13 My Appoitmente tiklar.
    And Doktor13 Yatisini isteyecegi hastanin üzerine gelip Edit e tiklar.
    And Doktor13 Acilan sayfada "Request Inpatient" e tiklar.