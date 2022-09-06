package com.example.theironbankfinalproyect.model.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor

public class Admin extends User{
    public Admin(String name) {
        super(name);
    }
}
