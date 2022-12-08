@US002
Feature: US002 Kayit olmak icin email and username bilgileri girilebilmelidir.
  Background: Register alanina giris
    Given  Kullanici "medunna_url" sayfasina gider
    And    Kullanici Anasayfada kullanici ikonuna tiklar
    And    Kullanici ikonu altindaki register'i tiklar
    And    Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer
    And    Kullanici FirstName kutusuna gecerli bir isim girer
    And    Kullanici LastName kutusuna gecerli bir soyisim girer

  @US002_TC01
  Scenario:US002_TC01 UserName kutusu bos birakilamaz

    And   Kullanici User name kutusuna tiklar
    And   Kulanici user name kutusunu bos birakir
    And   Kullanici Email kutusuna tiklar
    And   Kullanici Username kutusunu bos birakinca Your username is required uyari mesajini goruntuler


  @US002_TC02
  Scenario:US002_TC02 Herhangi bir karakter iceren gecerli bir UserName olmalidir

    And  Kullanici Username kutusuna herhangi bir karekterden olusan gecerli "Username" girer
    And  Kullanici dogru bir Username girdigini dogrular


  @US002_TC03
  Scenario:US002_TC03 Kullanici Email kutusunu bos birakamaz
    And  Kullanici Username kutusuna herhangi bir karekterden olusan gecerli "Username" girer
    And Kullanici email kutusuna tiklar ve bos birakir
    And Kullanici New password kutusuna tiklar
    And Kullanici Email kutusunu bos birakinca "Your email is required." uyari mesajini goruntuler


  @US002_TC04 @Negative
  Scenario Outline:US002_TC04 Email adresi bes karekterden az ve "@" ve "." karakterleri olmadan doldurulamamalidir.

    And  Kullanici Username kutusuna herhangi bir karekterden olusan gecerli "Username" girer
    And  Kullanici Email kutusuna tiklar ve bes’ten az karakter "gjk2" girdiginde Your email is required to be at least five characters uyari mesajini goruntuler
    And  Kullanici Email kutusuna tiklar ve "<noktasiz>" email adresi girer yada "<et isaretsiz>" email adresi girdiginde This field is invalid uyari mesajini goruntuler


    Examples:
      | noktasiz        | et isaretsiz    |
      | team01@gmailcom | team01gmail.com |



  @US002_TC05 @Pozitive
  Scenario:US002_TC05 Email adresi "@" ve "." karakterleri kullanarak dogru email girebilmelidir

    And  Kullanici Username kutusuna herhangi bir karekterden olusan gecerli "Username" girer
    And Kullanici Email kutucuğuna mail adresi @ ve . karakterleri kullanarak "team01@gmail.com" girer.
    And Kullanici herhangi bir uyarı mesajı almaz



