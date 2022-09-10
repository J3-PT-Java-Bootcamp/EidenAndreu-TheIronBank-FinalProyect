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
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentChecking extends Account{

    public StudentChecking(long id, User user, double balance, Long secretKey, Instant creationTime, Status status, double penaltyFee, Instant lastUpdateTime) {
        super(id, user);
        this.balance = balance;
        this.secretKey = secretKey;
        this.creationTime = creationTime;
        this.status = status;
        this.penaltyFee = penaltyFee;
        this.lastUpdateTime = lastUpdateTime;
    }

    @Column(name = "balance")
    private double balance;

    @Column(name = "secret_key")
    private Long secretKey;

    @CreationTimestamp
    private Instant creationTime;

    @Column(name = "status")
    private Status status;

    private double penaltyFee;

    @UpdateTimestamp
    private Instant lastUpdateTime;

}
