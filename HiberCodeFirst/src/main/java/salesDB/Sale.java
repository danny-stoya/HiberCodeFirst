package salesDB;

import entities.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "sales")
@Getter
@Setter
@NoArgsConstructor
public class Sale extends BaseEntity {
    @ManyToOne
    private Product product;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private StoreLocation storeLocation;
    private LocalDateTime date;

    public Sale(Product product, Customer customer, StoreLocation storeLocation, LocalDateTime date) {
        this.product = product;
        this.customer = customer;
        this.storeLocation = storeLocation;
        this.date = date;
    }
}
