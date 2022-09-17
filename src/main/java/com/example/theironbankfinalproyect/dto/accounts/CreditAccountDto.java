package com.example.theironbankfinalproyect.dto.accounts;

import com.example.theironbankfinalproyect.utils.Money;
import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreditAccountDto {

    @DecimalMax("100")
    private Money balance;

    private User user;
    private Instant creationTime;
    private Status status;
    private BigDecimal penaltyFee = BigDecimal.valueOf(40);
    private Instant lastUpdateTime;

    @DecimalMin("100")
    @DecimalMax("100_000")
    private int creditLimit;

    @DecimalMin("0.1")
    @DecimalMax("0.2")
    private BigDecimal interestRate;
}
