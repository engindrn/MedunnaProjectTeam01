package pojos.us005_Pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class countryilk {
    private Integer id;
    private String name;


    public countryilk(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public countryilk() {
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

    @Override
    public String toString() {
        return "country2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}









