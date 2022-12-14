
Feature:US018 Kullanici Api kullanarak doktorlari dogrular

  Scenario:US018_TC11 Kullanici Api kullanarak doktor bilgilerini dogrular

    And  Kullanici "15014" id'li doktor verileri icin bir get request gonderir
    And Doktorun "<Doktor>", "<Adnan>","<456-16-4735>","<12>", "<ALLERGY_IMMUNOLOGY>" Datalarina Sahip Oldugunu Dogrular.

