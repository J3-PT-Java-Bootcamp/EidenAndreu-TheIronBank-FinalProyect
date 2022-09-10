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
    public AccountHolder(Long id, String name, Date dateOfBirth, Address address, String number, String email) {
        super(id, name, dateOfBirth, address, number, email);
    }
}
