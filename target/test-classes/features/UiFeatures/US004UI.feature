@us004_02
Feature:US004 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır

  Background: Ortak adimlar
    Given Kullanici04 "url" adresine gider
    When Kullanici04 Giris simgesine tiklar
    And Kullanici04 Sign in simgesine tiklar


  @us004_SmokePozitifTest
    @us004_tc001
  Scenario Outline: TC001 Admin gecerli değerlerle sisteme giriş yapabilmeli

    And Admin04 Username alanina  "<gecerli username>" girer
    And Admin04 Password alanina   "<gecerli password>" girer
    And Admin04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Admin04 Basarili giris mesajini görür
    Examples:
      | gecerli username | gecerli password |
      | team01           | team0101         |

  @us004_SmokePozitifTest
    @us004_tc002
  Scenario Outline: TC002 Doktor  gecerli değerlerle sisteme giriş yapabilmeli

    And Doktor04 Username alanina  "<gecerli username>" girer
    And Doktor04 Password alanina   "<gecerli password>" girer
    And Doktor04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Doktor04 Basarili giris mesajini görür
    Examples:
      | gecerli username | gecerli password |
      | doktor01.        | Doktor01.        |


  @us004_SmokePozitifTest
    @us004_tc003
  Scenario Outline: TC 003 Hasta  gecerli değerlerle sisteme giriş yapabilmeli

    And Hasta04 Username alanina  "<gecerli username>" girer
    And Hasta04 Password alanina   "<gecerli password>" girer
    And Hasta04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Hasta04 Basarili giris mesajini görür
    Examples:
      | gecerli username | gecerli password |
      | Hastateam01      | Hastateam.01     |

  @us004_SmokePozitifTest
    @us004_tc004
  Scenario Outline: TC004 Personel gecerli değerlerle sisteme giriş yapabilmeli

    And Personel04 Username alanina  "<gecerli username>" girer
    And Personel04 Password alanina   "<gecerli password>" girer
    And Personel04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Personel04 Basarili giris mesajini görür
    Examples:
      | gecerli username | gecerli password |
      | personelteam01.  | Personelteam01.  |


  @us004_tc005
  Scenario: TC005 Kullanıcı mevcut kimlik bilgilerini her zaman kullanabileceği, "Remember me" seçeneğini görebilmeli

    Then Kullanici04 Remember me secenegini görür

  @us004_tc006
  Scenario: TC006 Kullanici eğer şifresini unutursa  "Did you forget your password?" seçeneğini görebilmeli

    Then Kullanici04 Did you forget your password? secenegini  görür

  @us004_tc007
  Scenario: TC007 Kullanici "You don't have an account yet? Register a new account" seçeneğini görebilmeli

    Then Kullanici04 You don't have an account yet? Register a new account secenegini görür

  @us004_tc008
  Scenario: TC008 Kullanici "Cancel" seçeneğini görebilmeli

    Then Kullanici04 Cancel seçeneğini görür


  @us004_SmokeNegatifTest
    @us004_tc009
  Scenario Outline:TC009 Kullanici gecerli username gecersiz password ile sisteme giriş yapamamali

    And Kullanici04 Username alanina  "<gecerli username>" girer
    And Kullanici04 Password alanina   "<gecersiz password>" girer
    And Kullanici04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Kullanici04 Authentication information not correct yazisini  görür
    Examples:
      | gecerli username | gecersiz password |
      | team01           | team011           |
      | team01           | tteam01           |
      | team01           | Team01            |

  @us004_SmokeNegatifTest
    @us004_tc010
  Scenario Outline: Scenario: TC010 Kullanici gecersiz username gecerli password ile sisteme giriş yapamamali

    And Kullanici04 Username alanina  "<gecersiz username>" girer
    And Kullanici04 Password alanina   "<gecerli password>" girer
    And Kullanici04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Kullanici04 Authentication information not correct yazisini  görür
    Examples:
      | gecersiz username | gecerli password |
      | tteam01           | team0101         |
      | team011           | team0101         |
      | TTeam01            | team0101         |

  @us004_SmokeNegatifTest
    @us004_tc011
  Scenario Outline:TC011 Kullanici gecersiz username gecersiz password ile sisteme giriş yapamamali

    And Kullanici04 Username alanina  "<gecersiz username>" girer
    And Kullanici04 Password alanina   "<gecersiz password>" girer
    And Kullanici04 SignIn butonuna tiklar
    And 3 sn bekler
    Then Kullanici04 Authentication information not correct yazisini  görür
    And Kullanici04 sayfayi kapatir

    Examples:
      | gecersiz username | gecersiz password |
      | team02            | team0202          |
      | TEAM01            | team01.           |
      | teamm01           | Team0101          |


