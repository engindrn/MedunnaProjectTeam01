package pojos.us005_Pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class country2 {

  private Integer id;
  private String name;

  public country2(Integer id, String name) {
    this.id = id;
    this.name = name;

  }

  public country2() {
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
    return "countrypojo{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}

