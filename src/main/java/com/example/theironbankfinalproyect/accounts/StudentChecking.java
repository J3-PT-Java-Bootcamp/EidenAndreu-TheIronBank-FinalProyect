package com.example.theironbankfinalproyect.accounts;

import com.example.theironbankfinalproyect.users.Status;

import java.util.Date;

public class StudentChecking extends Checking{
    public StudentChecking(Long id, Double balance, Long secretKey, String user, Double penaltyFee, Date creationDay, Status status) {
        super(id, balance, secretKey, user, penaltyFee, creationDay, status);
    }
}
