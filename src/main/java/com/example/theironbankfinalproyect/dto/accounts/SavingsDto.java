package com.example.theironbankfinalproyect.dto.accounts;

import com.example.theironbankfinalproyect.model.Money;
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
public class SavingsDto {
    private Money balance;
    private Long secretKey;
    private User user;
    private Instant creationTime;
    private Status status;
    private BigDecimal minimumBalance;
    private BigDecimal penaltyFee;
    private Instant lastUpdateTime;
    private BigDecimal interestRate;
}
