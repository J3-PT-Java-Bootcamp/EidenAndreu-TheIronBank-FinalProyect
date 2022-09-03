package com.example.theironbankfinalproyect.accounts;

import com.example.theironbankfinalproyect.users.Status;

import java.util.Date;

public class Savings extends Checking{
    public Savings(Long id, Double balance, Long secretKey, String user, Double minimumBalance, Double penaltyFee, Date creationDay, Status status) {
        super(id, balance, secretKey, user, minimumBalance, penaltyFee, creationDay, status);
    }
}
