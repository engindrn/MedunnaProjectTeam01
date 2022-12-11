package pojos.us005__Pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class cstatepojo {
    private Integer id;
    private String name;
    private pojos.us005__Pojos.countryilk countryilk;

    public cstatepojo(Integer id, String name, pojos.us005__Pojos.countryilk countryilk) {
        this.id = id;
        this.name = name;
        this.countryilk = countryilk;
    }

    public cstatepojo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public pojos.us005__Pojos.countryilk getCountryilk() {
        return countryilk;
    }

    public void setCountryilk(pojos.us005__Pojos.countryilk countryilk) {
        this.countryilk = countryilk;
    }

    @Override
    public String toString() {
        return "cstatepojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryilk=" + countryilk +
                '}';
    }
}














