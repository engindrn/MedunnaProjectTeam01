package pojos.us017_Pojos;

public class TestItemPostPojo {
    /*
   {
       "createdBy": "string",
           "createdDate": "2022-12-06T14:01:05.321Z",
           "defaultValMax": "string",
           "defaultValMin": "string",
           "description": "string",
           "id": 0,
           "name": "string",
           "price": 0
   }
   */
    private String defaultValMax;
    private String defaultValMin;
    private String description;
    private String name;
    private int price;

    public  TestItemPostPojo(String defaultValMax, String defaultValMin, String description, String name, int price) {
        this.defaultValMax = defaultValMax;
        this.defaultValMin = defaultValMin;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public  TestItemPostPojo() {
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "US017ApiStepDef{" +
                "defaultValMax='" + defaultValMax + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
