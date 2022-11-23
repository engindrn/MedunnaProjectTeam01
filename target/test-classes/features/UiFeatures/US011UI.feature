@US011
Feature: US011 My Appointments" Physician (Doctor) tarafından düzenlenebilmeli

  Background: Ortak adimlar
    Given Doktor11 medunna sayfasina gider
    Then  Doktor11 kisi simgesinin uzerine tiklar
    And  Doktor11 acilan pencerede Sign in ' in uzerine tiklar
    Then  Doktor11 username alanina gecerli bir username girer
    And  Doktor11 password alanina gecerli bir password girer
    And  Doktor11 Sign in butonuna tiklar
    And  Doktor11 my pages sekmesine tiklar
    And  Doktor11 acilan pencerede my appointments sekmesine tiklar


  @US011-1
  Scenario: TC001 Doktor "Create or edit an appointment" işlemlerini yapar
    And  Doktor11  edit butonuna tiklar
    And  Doktor11 Create or Edit an Appoinment yazisini gorur
    And  Doktor11 status alanindan bir opsiyon secer
    And  Doktor11 save butotuna tiklar
    Then  Doktor11 the appointment is updated with identifier 303971 yazisini gorur
    And  sayfayi11 kapatir


  @@US011-2
  Scenario: TC002 "Bir randevu güncellendiğinde; kullanıcı (doktor), hastanın aşağıdaki bilgilerini görmelidir :
  "id, start and end date, Status, physician and patient"
    And Doktor11 acilan sayfada hastanin  ID, Start Date Time, End Date Time, Status, Physician ve Patient bilgilerinin goruldugunu dogrular
    And  sayfayi11 kapatir


  @US011-3
  Scenario: TC003 Doktor "Anamnesis, Treatment ve Diagnosis" alanlarını doldurmak zorundadır
    And  Doktor11  edit butonuna tiklar
    And  Doktor11 Anamnesis, Treatment ve Diagnosis alanlarini bos birakir
    And  Doktor11 save butotuna tiklar
    And  Doktor11 Anemnesis bolumunde This field is required yazisini gorur
    And  Doktor11 Treatment bolumunde This field is required yazisini gorur
    And  Doktor11 Diagnosis bolumunde This field is required yazisini gorur
    And  sayfayi11 kapatir


  @US011-4.1
  Scenario: "Prescription ve description" isteğe bağlı olmalıdır.
    And  Doktor11  edit butonuna tiklar
    And  Doktor11 prescription ve description alanlarini bos birakir
    And  Doktor11 save butotuna tiklar
    And  Doktor11 the appointment is updated with identifier 303971 yazisini gorur
    And  sayfayi11 kapatir


  @US011-4.2
  Scenario: "Prescription ve description" isteğe bağlı olmalıdır.
    And  Doktor11  edit butonuna tiklar
    And  Doktor11 prescription ve description alanlarina bilgiler girer
    And  Doktor11 save butotuna tiklar
    And  Doktor11 the appointment is updated with identifier 303971 yazisini gorur
    And  sayfayi11 kapatir


  @US011-5
  Scenario: "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmelidir.
    And  Doktor11  edit butonuna tiklar
    And  Doktor11 status alanini tiklar ve PENDING opsiyonunu secer
    And  Doktor11 status alanini tiklar ve  COMPLETED opsiyonunu secer
    And  Doktor11 status alanini tiklar ve CANCELLED opsiyonunu secer
    And  sayfayi11 kapatir
