package pojos;
import com.fasterxml.jackson.annotation.*;
import lombok.*;
@Data  // getter setter tostring
@NoArgsConstructor   // parametresiz cons.
@AllArgsConstructor  // parametreli cons.
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItemsPojo {
    private String name;
    private String description;
    private Double price;
    private String defaultValMin;
    private String defaultValMax;
}