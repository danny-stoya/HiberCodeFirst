package sales;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(optional = false)
    @JoinColumn
    private Product product;
    @ManyToOne(optional = false)
    private Customer customer;
    @ManyToOne(optional = false)
    private StoreLocation storeLocation;
    @Column(nullable = false)
    private LocalDate date;

    public Sale() {
    }

    public Sale(Product product, Customer customer, StoreLocation storeLocation, LocalDate date) {
        this.product = product;
        this.customer = customer;
        this.storeLocation = storeLocation;
        this.date = date;
    }
}
