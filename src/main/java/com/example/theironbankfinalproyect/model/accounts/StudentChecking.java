package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.users.Status;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
public class StudentChecking extends Checking{
    public StudentChecking(Long id, Double balance, Long secretKey, User user, Double penaltyFee, Date creationDay, Status status) {
        super(id, balance, secretKey, user, penaltyFee, creationDay, status);
    }
}
