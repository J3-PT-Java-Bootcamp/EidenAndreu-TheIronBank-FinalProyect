package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.User;
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
    public CreditAccount(Long id, Double balance, User user, Double penaltyFee, int creditLimit, double interestRate) {
        super(id, balance, user, penaltyFee);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    private int creditLimit;

    private double interestRate;


}
