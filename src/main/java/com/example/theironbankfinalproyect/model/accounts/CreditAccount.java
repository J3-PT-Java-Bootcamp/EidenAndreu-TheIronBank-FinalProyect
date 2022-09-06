package com.example.theironbankfinalproyect.model.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccount extends Checking{
    public CreditAccount(Long id, Double balance, String user, Double penaltyFee, int creditLimit, double interestRate) {
        super(id, balance, user, penaltyFee);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    int creditLimit;

    double interestRate;


}
