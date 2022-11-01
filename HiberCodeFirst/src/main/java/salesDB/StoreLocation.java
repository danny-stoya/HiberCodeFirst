package salesDB;

import entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Entity(name = "store_location")
@Getter
@Setter
@NoArgsConstructor
public class StoreLocation extends BaseEntity {
    @Column(name = "location_name", unique = true)
    private String locationName;
    @OneToMany(mappedBy = "")
    private Set<Sale> sales;

}
