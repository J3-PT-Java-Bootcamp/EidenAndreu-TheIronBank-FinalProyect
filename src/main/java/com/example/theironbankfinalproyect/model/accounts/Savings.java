package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.Money;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Savings extends Account{

    public Savings(AccountHolder primaryOwner, AccountHolder secondaryOwner, Money balance, Long secretKey, Instant creationTime, Status status, BigDecimal minimumBalance, BigDecimal penaltyFee, Instant lastUpdateTime, BigDecimal interestRate) {
        super(primaryOwner, secondaryOwner, balance);
        this.secretKey = secretKey;
        this.creationTime = creationTime;
        this.status = status;
        this.minimumBalance = minimumBalance;
        this.penaltyFee = penaltyFee;
        this.lastUpdateTime = lastUpdateTime;
        this.interestRate = interestRate;
    }

    @Column(name = "secret_key")
    private Long secretKey;

    @CreationTimestamp
    private Instant creationTime;

    @Column(name = "status")
    private Status status;

    private BigDecimal minimumBalance;
    private BigDecimal penaltyFee;

    @UpdateTimestamp
    private Instant lastUpdateTime;

    @Column (name="interestRate")
    private BigDecimal interestRate;


}
