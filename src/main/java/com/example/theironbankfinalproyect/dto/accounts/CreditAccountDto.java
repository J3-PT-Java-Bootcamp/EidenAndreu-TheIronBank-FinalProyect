package com.example.theironbankfinalproyect.dto.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreditAccountDto {
    private double balance;
    private User user;
    private Instant creationTime;
    private Status status;
    private double penaltyFee;
    private Instant lastUpdateTime;
    private int creditLimit;
    private double interestRate;
}
