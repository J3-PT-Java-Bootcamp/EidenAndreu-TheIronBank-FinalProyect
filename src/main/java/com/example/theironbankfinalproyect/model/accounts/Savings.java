package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Savings extends Account{

    public Savings(long id, User user, double balance, Long secretKey, Instant creationTime, Status status, double minimumBalance, double penaltyFee, Instant lastUpdateTime, double interestRate) {
        super(id, user);
        this.balance = balance;
        this.secretKey = secretKey;
        this.creationTime = creationTime;
        this.status = status;
        this.minimumBalance = minimumBalance;
        this.penaltyFee = penaltyFee;
        this.lastUpdateTime = lastUpdateTime;
        this.interestRate = interestRate;
    }

    @Column(name = "balance")
    private double balance;

    @Column(name = "secret_key")
    private Long secretKey;

    @CreationTimestamp
    private Instant creationTime;

    @Column(name = "status")
    private Status status;

    private double minimumBalance;
    private double penaltyFee;

    @UpdateTimestamp
    private Instant lastUpdateTime;

    @Column (name="interestRate")
    private double interestRate;


}
