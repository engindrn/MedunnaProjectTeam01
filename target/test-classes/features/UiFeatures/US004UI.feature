@us004
Feature:US004 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır

  @us004_SmokePozitifTest
  @us004_tc001
  Scenario: TC001 Admin gecerli değerlerle sisteme giriş yapabilmeli

    Given Admin "url" adresine gider
    When Admin Giris simgesine tiklar
    And Admin Sign in simgesine tiklar
    And Admin Username alanina gecerli bir "team01" girer
    And Admin Password alanina gecerli bir "team0101" girer
    And Admin Sign in butonuna tiklar
    And 3 sn bekler
    Then Admin Basarili giris mesajini görür

  @us004_SmokePozitifTest
  @us004_tc002
  Scenario: TC002 Doktor  gecerli değerlerle sisteme giriş yapabilmeli

    Given Doktor "url" adresine gider
    When Doktor Giris simgesine tiklar
    And  Doktor Sign in simgesine tiklar
    And  Doktor Username alanina gecerli bir "doktor01." girer
    And  Doktor Password alanina gecerli bir "Doktor01." girer
    And  Doktor Sign in butonuna tiklar
    And 3 sn bekler
    Then Doktor Basarili giris mesajini görür

  @us004_SmokePozitifTest
  @us004_tc003
  Scenario: TC003 Hasta  gecerli değerlerle sisteme giriş yapabilmeli

    Given Hasta "url" adresine gider
    When Hasta Giris simgesine tiklar
    And Hasta Sign in simgesine tiklar
    And Hasta Username alanina gecerli bir "Hastateam01" girer
    And Hasta Password alanina gecerli bir "Hastateam.01" girer
    And Hasta Sign in butonuna tiklar
    And 3 sn bekler
    Then Hasta Basarili giris mesajini görür

  @us004_SmokePozitifTest
  @us004_tc004
  Scenario: TC004 Personel gecerli değerlerle sisteme giriş yapabilmeli

    Given Personel "url" adresine gider
    When Personel Giris simgesine tiklar
    And Personel Sign in simgesine tiklar
    And Personel Username alanina gecerli bir "personelteam01." girer
    And Personel Password alanina gecerli bir "Personelteam01." girer
    And Personel Sign in butonuna tiklar
    And 3 sn bekler
    Then Personel Basarili giris mesajini görür

  @us004_tc005
  Scenario: TC005 Kullanıcı mevcut kimlik bilgilerini her zaman kullanabileceği, "Remember me" seçeneğini görebilmeli

    Given Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And 3 sn bekler
    Then Kullanici Remember me secenegini görür

  @us004_tc006
  Scenario: TC006 Kullanici eğer şifresini unutursa  "Did you forget your password?" seçeneğini görebilmeli

    Given  Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And 3 sn bekler
    Then Kullanici Did you forget your password? secenegini  görür

  @us004_tc007
  Scenario: TC007 Kullanici "You don't have an account yet? Register a new account" seçeneğini görebilmeli

    Given Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And 3 sn bekler
    Then Kullanici You don't have an account yet? Register a new account secenegini görür

  @us004_tc008
  Scenario: TC008 Kullanici "Cancel" seçeneğini görebilmeli

    Given   Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And 3 sn bekler
    Then Kullanici Cancel seçeneğini görür

  @us004_SmokeNegatifTest
  @us004_tc009
  Scenario:TC009 Kullanici gecerli username gecersiz password ile sisteme giriş yapamamali

    Given Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And Kullanici Username alanina gecerli bir "team01" girer
    And Kullanici Password alanina gecersiz bir "team01011" girer
    And Kullanici Sign in butonuna tiklar
    And 3 sn bekler
    Then Kullanici Authentication information not correct yazisini görür

  @us004_SmokeNegatifTest
  @us004_tc010
  Scenario: TC010 Kullanici gecersiz username gecerli password ile sisteme giriş yapamamali

    Given Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And Kullanici Username alanina gecersiz bir "team012" girer
    And Kullanici Password alanina gecerli bir "team0101" girer
    And Kullanici Sign in butonuna tiklar
    And 3 sn bekler
    Then Kullanici Authentication information not correct yazisini görür

  @us004_SmokeNegatifTest
  @us004_tc011
  Scenario: TC011 Kullanici gecersiz username gecersiz password ile sisteme giriş yapamamali

    Given Kullanici "url" adresine gider
    When Kullanici Giris simgesine tiklar
    And Kullanici Sign in simgesine tiklar
    And Kullanici Username alanina gecersiz bir "team012" girer
    And Kullanici Password alanina gecersiz bir "team01011" girer
    And Kullanici Sign in butonuna tiklar
    And 3 sn bekler
    Then Kullanici Authentication information not correct yazisini görür




