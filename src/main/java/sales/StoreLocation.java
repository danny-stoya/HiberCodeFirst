package sales;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "store_location")
public class StoreLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "location_name", nullable = false)
    private String locationName;
    @OneToMany(mappedBy = "storeLocation", cascade = CascadeType.PERSIST)
    private Set<Sale> sales;

    public StoreLocation() {
    }

    public StoreLocation(String locationName) {
        this.locationName = locationName;
    }
}
