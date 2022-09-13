package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Checking extends Account {
    public Checking(long id, User user, BigDecimal balance, Long secretKey, Instant creationTime, Status status, BigDecimal minimumBalance, BigDecimal penaltyFee, BigDecimal monthlyMaintenanceFee, Instant lastUpdateTime) {
        super(id, user);
        this.balance = balance;
        this.secretKey = secretKey;
        this.creationTime = creationTime;
        this.status = status;
        this.minimumBalance = minimumBalance;
        this.penaltyFee = penaltyFee;
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
        this.lastUpdateTime = lastUpdateTime;
    }

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "secret_key")
    private Long secretKey;

    @CreationTimestamp
    private Instant creationTime;

    @Column(name = "status")
    private Status status;

    private BigDecimal minimumBalance;
    private BigDecimal penaltyFee;
    private BigDecimal monthlyMaintenanceFee;

    @UpdateTimestamp
    private Instant lastUpdateTime;

}
