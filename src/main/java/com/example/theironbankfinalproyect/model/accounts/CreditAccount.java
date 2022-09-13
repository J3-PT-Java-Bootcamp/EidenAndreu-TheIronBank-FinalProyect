package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccount extends Account{
    public CreditAccount(long id, User user, BigDecimal balance, BigDecimal creditLimit, BigDecimal interestRate, BigDecimal penaltyFee) {
        super(id, user);
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;
    }

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "creditLimit")
    private BigDecimal creditLimit;

    @Column(name = "interestRate")
    private BigDecimal interestRate;

    @Column(name = "PenaltyFee")
    private BigDecimal penaltyFee;


}
