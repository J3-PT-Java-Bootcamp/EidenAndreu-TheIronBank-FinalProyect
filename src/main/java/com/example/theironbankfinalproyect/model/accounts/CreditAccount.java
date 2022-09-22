package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.utils.Money;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccount extends Account{

    public CreditAccount(AccountHolder primaryOwner, AccountHolder secondaryOwner, Money balance, BigDecimal creditLimit, BigDecimal interestRate, BigDecimal penaltyFee) {
        super(primaryOwner, secondaryOwner, balance);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;
    }
    @CreationTimestamp
    private Instant creationTime;
    @Column(name = "creditLimit")
    private BigDecimal creditLimit;

    @Column(name = "interestRate")
    private BigDecimal interestRate;

    @Column(name = "PenaltyFee")
    private BigDecimal penaltyFee = BigDecimal.valueOf(40);


    public CreditAccount(AccountHolder primaryOwner, Money balance, Instant creationTime) {
        super(primaryOwner, balance);
        this.creationTime = creationTime;
    }
}
