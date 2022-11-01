package wizardDeposits;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "wizard_deposits")
public class WizardDeposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 60, nullable = false)
    private String lastName;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(nullable = false)
    private Integer age;

    @Column(name = "magic_wand_creator", length = 100, nullable = false)
    private String magicWandCreator;

    @Column(name = "magic_wand_size", nullable = false)
    private Integer magic_wand_size;

    @Column(name = "deposit_group", length = 20, nullable = false)
    private String depositGroup;

    @Column(name = "deposit_start_date")
    private LocalDateTime depositStartDate;

    @Column(name = "deposit_amount", precision = 2)
    private Double depositAmount;

    @Column(name = "deposit_interest")
    private Double depositInterest;

    @Column(name = "deposit_charge")
    private Double depositCharge;

    @Column(name = "deposit_expiration_date")
    private LocalDateTime depositExpirationDate;
    @Column(name = "is_deposit_expired")
    private boolean isDepositExpired;


    public WizardDeposit() {
    }

    public WizardDeposit(String firstName, String lastName, Integer age, String magicWandCreator,
                         Integer magic_wand_size, String depositGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.magicWandCreator = magicWandCreator;
        this.magic_wand_size = magic_wand_size;
        this.depositGroup = depositGroup;
    }
}
