package com.example.theironbankfinalproyect.model.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    Date dateOfBirth;

    String address;

    String phoneNumber;
    String email;
    String hashedKey;

    public User(String name, Date dateOfBirth, String address, String phoneNumber, String email, String hashedKey) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hashedKey = hashedKey;
    }

    public User(String name, Date dateOfBirth, String address, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, String hashedKey) {
        this.id = id;
        this.name = name;
        this.hashedKey = hashedKey;
    }
}
