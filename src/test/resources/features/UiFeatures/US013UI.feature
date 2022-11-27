@US013
Feature:US013 Physician (Doktor) "Test Results" işlemleri yapabilmeli(My Appointments / Edit / Test Results)
  @US013TC001
  Scenario: TC001 Testler talep edildikten sonra Staff  test sonuclarini güncellemelidir

    Given Personel(Staff) url adresine gider
    When Staff Giris simgesine tiklar
    And Staff Sign in simgesine tiklar
    And 3 saniye bekler.
    And Staff Username alanina gecerli bir username girer
    And 3 saniye bekler.
    And Staff Password alanina gecerli bir password girer
    And 3 saniye bekler.
    And Staff Sign in butonuna tiklar
    And 3 saniye bekler.
    And Staff My Pages e tiklar
    And 3 saniye bekler.
    And Staff search Patiente tiklar
    And 3 saniye bekler.
    And Test sonuclarini güncelleyecegi hastanin SSN numarasini girer
    And 3 saniye bekler.
    And SSN ini girdigi hastada show appoitments e tiklar
    And 3 saniye bekler.
    And Show test e tiklar
    And 3 saniye bekler.
    And View Result a tiklar
    And 3 saniye bekler.
    And Edit e tiklar
    And 3 saniye bekler.
    Then Tum Resultlari(Sodyum,Potasyum;Glukose,Ure,Creatinine,Total Protein,Albumin ,Hemoglobin) günceller


  @US013TC002
  Scenario: TC002 "Request Impatient" (hastanin yatili tedavi görmesi )  isteginde bulunabilmelidir

    Given Doktor "medunnaUrl" adresine gider.
    When Giris simgesine tiklar.
    And Sign in simgesine tiklar.
    And Username alanina gecerli bir username girer.
    And  Password alanina gecerli bir password girer.
    And Sign in butonuna tiklar.
    And My Pages e tiklar.
    And My Appoitmente tiklar.
    And Yatisini isteyecegi hastanin üzerine gelip Edit e tiklar.
    And Acilan sayfada "Request Inpatient" e tiklar.