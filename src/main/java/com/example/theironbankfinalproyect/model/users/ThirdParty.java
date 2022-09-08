package com.example.theironbankfinalproyect.model.users;

import javax.persistence.Entity;

@Entity
public class ThirdParty extends User{
    public ThirdParty(Long id, String name, String hashedKey) {
        super(id, name, hashedKey);
    }
}
