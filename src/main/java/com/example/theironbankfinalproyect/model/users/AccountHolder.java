package com.example.theironbankfinalproyect.model.users;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountHolder extends User{

    public AccountHolder(long id,  String name, Date dateOfBirth, Address address, String phoneNumber, String email, String hashedKey) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hashedKey = hashedKey;
    }

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Embedded
    private Address address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;
    private String hashedKey;
}
