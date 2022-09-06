package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Checking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "secret_key")
    private Long secretKey;

    @ManyToOne
    @JoinColumn(name = "user", referencedColumnName = "id")
    private User user;

    @CreationTimestamp
    private Instant creationTime;

    @Column(name = "status")
    private Status status;

    private Double minimumBalance;
    private Double penaltyFee;
    private Double monthlyMaintenanceFee;

    @UpdateTimestamp
    private Instant lastUpdateTime;

    public Checking(Double balance, Long secretKey, User user, Double minimumBalance, Double penaltyFee, Double monthlyMaintenanceFee, Instant creationTime, Status status) {
        this.balance = balance;
        this.secretKey = secretKey;
        this.user = user;
        this.minimumBalance = minimumBalance;
        this.penaltyFee = penaltyFee;
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
        this.creationTime = creationTime;
        this.status = status;
    }

    public Checking(Long id, Double balance, User user, Double penaltyFee) {
        this.id = id;
        this.balance = balance;
        this.user = user;
        this.penaltyFee = penaltyFee;
    }

    public Checking(Long id, Double balance, Long secretKey, User user, Double minimumBalance, Double penaltyFee, Instant creationTime, Status status) {
        this.id = id;
        this.balance = balance;
        this.secretKey = secretKey;
        this.user = user;
        this.minimumBalance = minimumBalance;
        this.penaltyFee = penaltyFee;
        this.creationTime = creationTime;
        this.status = status;
    }

    public Checking(Long id, Double balance, Long secretKey, User user, Double penaltyFee, Instant creationTime, Status status) {
        this.id = id;
        this.balance = balance;
        this.secretKey = secretKey;
        this.user = user;
        this.penaltyFee = penaltyFee;
        this.creationTime = creationTime;
        this.status = status;
    }
}
