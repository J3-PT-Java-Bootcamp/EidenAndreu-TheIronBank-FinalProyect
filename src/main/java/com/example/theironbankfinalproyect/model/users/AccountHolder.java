package com.example.theironbankfinalproyect.model.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class AccountHolder extends User{
    public AccountHolder(String name, Date dateOfBirth, String address, String number, String email) {
        super(name, dateOfBirth, address, number, email);
    }
}
