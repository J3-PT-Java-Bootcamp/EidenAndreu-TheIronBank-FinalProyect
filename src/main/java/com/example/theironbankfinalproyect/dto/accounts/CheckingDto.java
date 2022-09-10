package com.example.theironbankfinalproyect.dto.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CheckingDto {
    @Min(200)
    private double balance;

    private Long secretKey;
    private User user;
    private Instant creationTime;
    private Status status;
    private double minimumBalance;
    private double penaltyFee;
    private double monthlyMaintenanceFee;
    private Instant lastUpdateTime;



}
