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
    public Admin(Long id, String name) {
        super(id, name);
    }
}
