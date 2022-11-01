package salesDB;

import entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Entity(name = "customers")
@Setter
@Getter
@NoArgsConstructor
public class Customer extends BaseEntity {
    private String name;
    private String email;
    @Column(name = "credit_card_number")
    private String creditCardNumber;
    @OneToMany
    private Set<Sale> sales;

}
