package com.example.theironbankfinalproyect.model.users;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Admin extends User{
    public Admin(long id, String name, List<Checking> checking) {
        super(id, name);
        this.checking = checking;
    }

    public Admin(long id, String name) {
        super(id, name);
    }

    public Admin(String name) {
        super(name);
    }

    @OneToMany(mappedBy = "primaryOwner" )
    private List<Checking> checking;



}
