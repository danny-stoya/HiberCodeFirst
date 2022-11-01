package salesDB;

import entities.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product extends BaseEntity {
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private Set<Sale> sales;

    public Product(String name, Integer quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.sales = new HashSet<>();
    }
}


