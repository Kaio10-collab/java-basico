package entidade;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Produto {

    private String name;
    private Double price;
    private Integer quantity;

    public double total() {
        return price * quantity;
    }
}
