package com.example.theironbankfinalproyect.model.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ThirdParty extends User{

    public ThirdParty(long id, String name, String hashedKey) {
        super(id, name);
        this.hashedKey = hashedKey;
    }

    private String hashedKey;

    public ThirdParty(long id, String name) {
        super(id, name);
    }
}
