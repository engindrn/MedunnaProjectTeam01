@US010
Feature:US010 Doktor (Physician) randevuları

  @US010_TC001
  Scenario:TC001 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir

    Given Doktor10 "url" adresine gider
    When Doktor10 Giris simgesine tiklar
    And  Doktor10 Sign in simgesine tiklar
    And  Doktor10 Username alanina gecerli bir "DoktorAlpcan" girer
    And  Doktor10 Password alanina gecerli bir "DoktorAlpcan.01" girer
    And  Doktor10 Sign in butonuna tiklar
    And Doktor10 My Pages sekmesine tiklar
    And Doktor10 My Appointments sekmesine tiklar
    And 3 sn bekler
    And Doktor10, randevu listesini ve zaman dilimlerini görür


  @US010_TC002
  Scenario: TC002 Doktor "patient id, start date, end date, status" bilgilerini görebilmelidir

    Given Doktor10 "url" adresine gider
    When Doktor10 Giris simgesine tiklar
    And  Doktor10 Sign in simgesine tiklar
    And  Doktor10 Username alanina gecerli bir "DoktorAlpcan" girer
    And  Doktor10 Password alanina gecerli bir "DoktorAlpcan.01" girer
    And  Doktor10 Sign in butonuna tiklar
    And Doktor10 My Pages sekmesine tiklar
    And Doktor10 My Appointments sekmesine tiklar
    And 3 sn bekler
    And Doktor10 patient id, start date, end date, status bilgilerini görür

