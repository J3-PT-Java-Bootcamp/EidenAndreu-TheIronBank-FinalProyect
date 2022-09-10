package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccount extends Account{
    public CreditAccount(long id, User user, double balance, int creditLimit, double interestRate, double penaltyFee) {
        super(id, user);
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;
    }

    @Column(name = "balance")
    private double balance;

    @Column(name = "creditLimit")
    private int creditLimit;

    @Column(name = "interestRate")
    private double interestRate;

    @Column(name = "PenaltyFee")
    private double penaltyFee;


}
