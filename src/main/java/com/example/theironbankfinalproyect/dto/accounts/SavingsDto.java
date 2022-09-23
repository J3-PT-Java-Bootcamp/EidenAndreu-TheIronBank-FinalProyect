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
import javax.validation.constraints.Max;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SavingsDto {

    @DecimalMax("1000")
    @DecimalMin("100")
    private Money balance;

    private Long secretKey;
    private User user;
    private Instant creationTime;
    private Status status;

    @DecimalMax("1000")
    private BigDecimal minimumBalance;

    private BigDecimal penaltyFee = BigDecimal.valueOf(40);
    private Instant lastUpdateTime;

    @DecimalMax("0.5")
    @DecimalMin("0.0025")
    private BigDecimal interestRate;
}
