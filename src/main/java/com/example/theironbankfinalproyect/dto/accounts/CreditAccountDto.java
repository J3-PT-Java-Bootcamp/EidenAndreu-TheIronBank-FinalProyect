package com.example.theironbankfinalproyect.dto.accounts;

import com.example.theironbankfinalproyect.utils.Money;
import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreditAccountDto {
    private Money balance;
    private User user;
    private Instant creationTime;
    private Status status;
    private BigDecimal penaltyFee;
    private Instant lastUpdateTime;

    private int creditLimit;

    private BigDecimal interestRate;
}
