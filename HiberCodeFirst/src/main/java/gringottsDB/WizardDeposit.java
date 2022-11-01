package gringottsDB;

import entities.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "wizard_deposits")
@Getter
@Setter
@NoArgsConstructor
public class WizardDeposit extends BaseEntity {
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 60, nullable = false)
    private String lastName;
    @Column(length = 1000)
    private String notes;
    @Column(columnDefinition = "TINYINT", nullable = false)
    private Integer age;
    @Column(name = "magic_wand_creator", length = 100)
    private String magicWandCreator;
    @Column(name = "magic_wand_size")
    private Short magicWandSize;
    @Column(name = "deposit_group", length = 20)
    private String depositGroup;
    @Column(name = "deposit_start_date")
    private LocalDateTime depositStartDate;
    @Column(name = "deposit_amount", precision = 10, scale = 2)
    private BigDecimal depositAmount;
    @Column(name = "deposit_interest", precision = 10, scale = 2)
    private BigDecimal depositInterest;
    @Column(name = "deposit_charge", precision = 10, scale = 2)
    private BigDecimal depositCharge;
    @Column(name = "deposit_expiration_date")
    private LocalDateTime depositExpirationDate;
    @Column(name = "is_deposit_expired")
    private Boolean isDepositExpired;

    public WizardDeposit(String firstName, String lastName, String notes, Integer age, String magicWandCreator,
                         Short magicWandSize, String depositGroup, LocalDateTime depositStartDate,
                         BigDecimal depositAmount, BigDecimal depositInterest, BigDecimal depositCharge,
                         LocalDateTime depositExpirationDate, Boolean isDepositExpired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
        this.age = age;
        this.magicWandCreator = magicWandCreator;
        this.magicWandSize = magicWandSize;
        this.depositGroup = depositGroup;
        this.depositStartDate = depositStartDate;
        this.depositAmount = depositAmount;
        this.depositInterest = depositInterest;
        this.depositCharge = depositCharge;
        this.depositExpirationDate = depositExpirationDate;
        this.isDepositExpired = isDepositExpired;
    }
}
