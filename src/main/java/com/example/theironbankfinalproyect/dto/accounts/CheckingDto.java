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
public class CheckingDto {
    private Money balance;
// cambiar double por Money y BigDecimal
    private Long secretKey;
    private User user;
    private Instant creationTime;
    private Status status;

    private double minimumBalance;

   // @DecimalMin(0.75)
    private BigDecimal penaltyFee;
    private BigDecimal monthlyMaintenanceFee;
    private Instant lastUpdateTime;



}
