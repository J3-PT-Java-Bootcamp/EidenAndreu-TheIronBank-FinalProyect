package com.example.theironbankfinalproyect.accounts;

import com.example.theironbankfinalproyect.users.Status;

import java.util.Date;

public class CreditAccount extends Checking{
    public CreditAccount(Long id, Double balance, String user, Double penaltyFee, int creditLimit, double interestRate) {
        super(id, balance, user, penaltyFee);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    int creditLimit;

    double interestRate;


}
