Feature: US024 Hasta hesabına girdiğinde test sonuçlarını (id, name for test,default max ve min value, test date and description)  ve faturasini görebilmelidir.

  Background: Ortak adimlar

    Given Hasta "url" adresine gider
    And Hasta Giris simgesine tiklar
    And Hasta Sign in simgesine tiklar
    And Hasta Username alanina gecerli bir "HastaAlpcan" girer
    And Hasta Password alanina gecerli bir "HastaAlpcan.01" girer
    And Hasta Sign in butonuna tiklar
    And Hasta 1 saniye bekler
    And Hasta My Pages sekmesine tiklar
    And Hasta 1 saniye bekler
    And Hasta My Appointments sekmesine tiklar

  Scenario: TC01 Hasta id, name for test,default max ve min value, test date ve description bölümerini görebilmeli


    And Hasta Show Tests butonuna tiklar
    And Hasta 1 saniye bekler
    And Hasta View Results butonuna tiklar
    And Hasta 1 saniye bekler
    Then Hasta ID, Name,Default Min Value, Default Max Value, Test Date, Description bölümlerini görür

  Scenario: TC02 Hasta faturasini görebilmeli

    And Hasta Show Invoice butonuna tiklar
    And Hasta 1 saniye bekler
    And Hasta faturasini görür





