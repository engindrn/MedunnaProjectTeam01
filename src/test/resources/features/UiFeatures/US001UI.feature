
Feature:US001_Kayit olmak icin SSN, Firstname ve Lastname bilgileri girilebilmelidir.

  Background: Register alanina giris
    Given  Kullanici "medunna_url" sayfasina gider
    And    Kullanici Anasayfada kullanici ikonuna tiklar
    And    Kullanici ikonu altindaki register'i tiklar


  @TC01 @Pozitive
  Scenario:US001_TC01 Gecerli bir SSN, 3. ve 5. rakamdan sonra "-" icermeli ve 9 rakamdan olusmalidir


    And   Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer
    And   Kullanici dogru SSN girdigini dogrular
    And    Kullanici browseri kapatir

  @TC02 @Negative
  Scenario Outline:US001_T02 Kullanici Gecerli bir SSN, 3. ve 5. rakamdan sonra "-" icermeli ve 9 rakamdan olusmalidir

    And    Kullanici acilan sayfada SSN kutusu icerisine "<karekter>"lerden ve "<harf>"lerden  olusan SSN girer
    And    Kullanici Your SSN is invalid' uyari mesajini goruntuler
    And    Kullanici browseri kapatir
    Examples:
      | karekter    | harf       |
      | *-/-\- @#$$ | aaa-bb-aaa |
      | ass-**-dd1  | ccc-cc-ccc |

  @TC03 @Negative
  Scenario Outline:US001_TC03 Kullanici gecerli bir SSN, 3. ve 5. rakamdan sonra "-" icermeli ve 9 rakamdan olusmalidir

    And    Kullanici acilan sayfada SSN kutusunun icerisine "<8ile10haneli>"rakam girer yada "<2.ve6.rakamlardan sonra ->"  iceren bir SSN girer
    And    Kullanici Your SSN is invalid' uyari mesajini goruntuler
    And    Kullanici browseri kapatir

    Examples:
      | 8ile10haneli | 2.ve6.rakamlardan sonra - |
      | 456-12-78520 | 45-612-7852               |
      | 456-12-785   | 4561-2-7852               |
      | 456-127-852  | 4565-22-5555              |


  @TC04
  Scenario:US001_TC04 SSN bos birakilamaz

    And    Kullanici SSN kutucuguna tiklar ve bos birakir
    And    Kullanici FirstName kutusuna tiklar
    And    KUllanici SSN kutucugunu bos birakinca 'Your SSN is required.' uyari mesajini goruntuler
    And    Kullanici browseri kapatir


  @TC05
  Scenario:US001_TC05  FirstName kutusu bos birakilamaz

    When   Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer
    Then   Kullanici FirstName kutusuna tiklar ve bos birakir
    And    Kullanici LastName kutusuna tiklar
    And    KUllanici FirstName kutucugunu bos birakinca Your FirstName is required. uyari mesajini goruntuler
    And    Kullanici browseri kapatir

  @TC06
  Scenario Outline:US001_TC06 Herhangi bir karakter iceren gecerli bir FirstName olmalidir

    When   Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer
    And    Kullanici FirstName kutusunun icerisine herhangi bir "<karekterlerden ve rakamlardan>" olusan isim girer
    And    Kullanici dogru Firstname girdigini dogrular
    And    Kullanici browseri kapatir


    Examples:
      | karekterlerden ve rakamlardan |
      | 11**--??44                    |
      | ..                            |
      | 1/.*sa                        |


  @TC07
  Scenario:US001_TC07 LastName kutusu bos birakilamaz

    When   Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer
    Then   Kullanici FirstName kutusuna gecerli bir isim girer
    Then   Kullanici LastName kutusuna tiklar ve bos birakir
    And    Kullanici User name kutusuna tiklar
    And    KUllanici LastName kutucugunu bos birakinca Your LastName is required. uyari mesajini goruntuler
    And    Kullanici browseri kapatir


  @TC09
  Scenario Outline:US001_TC08 Herhangi bir karakter iceren gecerli bir LastName olmalidir

    When   Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer
    Then   Kullanici FirstName kutusuna gecerli bir isim girer
    Then   Kullanici Last Name kutusuna herhangi bir "<karekterlerden>" olusan soyisim girer
    And    Kullanici dogru LastName girdigini dogrular
    And    Kullanici browseri kapatir

    Examples:
      | karekterlerden |
      | 11**--??44     |
      | .              |
      | 1/.*sa         |

