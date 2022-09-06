package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Savings extends Checking{
    public Savings(Long id, Double balance, Long secretKey, User user, Double minimumBalance, Double penaltyFee, Date creationDay, Status status) {
        super(id, balance, secretKey, user, minimumBalance, penaltyFee, creationDay, status);
    }

    double interestRate;
}
