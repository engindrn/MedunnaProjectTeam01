@med
Feature: US011 My Appointments" Physician (Doctor) tarafından düzenlenebilmeli

  Background: Ortak adimlar
    Given Doktor medunna sayfasina gider
    Then  Doktor kisi simgesinin uzerine tiklar
    And  Doktor acilan pencerede Sign in ' in uzerine tiklar
    Then  Doktor username alanina gecerli bir username girer
    And  Doktor password alanina gecerli bir password girer
    And  Doktor Sign in butonuna tiklar
    And  Doktor my pages sekmesine tiklar
    And  Doktor acilan pencerede my appointments sekmesine tiklar


  @med1
  Scenario: TC001 Doktor "Create or edit an appointment" işlemlerini yapar
    And  Doktor  edit butonuna tiklar
    And  Doktor Create or Edit an Appoinment yazisini gorur
    And  Doktor status alanindan bir opsiyon secer
    And  Doktor save butotuna tiklar
    Then  Doktor the appointment is updated with identifier 303971 yazisini gorur
    And  sayfayi kapatir


  @med2
  Scenario: TC002 "Bir randevu güncellendiğinde; kullanıcı (doktor), hastanın aşağıdaki bilgilerini görmelidir :
  "id, start and end date, Status, physician and patient"
    And Doktor acilan sayfada hastanin  ID, Start Date Time, End Date Time, Status, Physician ve Patient bilgilerinin goruldugunu dogrular
    And  sayfayi kapatir


  @med3
  Scenario: TC003 Doktor "Anamnesis, Treatment ve Diagnosis" alanlarını doldurmak zorundadır
    And  Doktor  edit butonuna tiklar
    And  Doktor Anamnesis, Treatment ve Diagnosis alanlarini bos birakir
    And  Doktor save butotuna tiklar
    And  Doktor Anemnesis bolumunde This field is required yazisini gorur
    And  Doktor Treatment bolumunde This field is required yazisini gorur
    And  Doktor Diagnosis bolumunde This field is required yazisini gorur
    And  sayfayi kapatir


  @med4.1
  Scenario: "Prescription ve description" isteğe bağlı olmalıdır.
    And  Doktor  edit butonuna tiklar
    And  Doktor prescription ve description alanlarini bos birakir
    And  Doktor save butotuna tiklar
    And  Doktor the appointment is updated with identifier 303971 yazisini gorur
    And  sayfayi kapatir


  @med4.2
  Scenario: "Prescription ve description" isteğe bağlı olmalıdır.
    And  Doktor  edit butonuna tiklar
    And  Doktor prescription ve description alanlarina bilgiler girer
    And  Doktor save butotuna tiklar
    And  Doktor the appointment is updated with identifier 303971 yazisini gorur
    And  sayfayi kapatir


  @med5
  Scenario: "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmelidir.
    And  Doktor  edit butonuna tiklar
    And  Doktor status alanini tiklar ve PENDING opsiyonunu secer
    And  Doktor status alanini tiklar ve  COMPLETED opsiyonunu secer
    And  Doktor status alanini tiklar ve CANCELLED opsiyonunu secer
    And  sayfayi kapatir

