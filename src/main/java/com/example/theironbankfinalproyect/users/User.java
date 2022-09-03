package com.example.theironbankfinalproyect.users;

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
    String country;
    String city;
    String postalCode;
    String street;
    String number;
    String floor;
    String door;
    String email;
    String hashedKey;

    public User(String name, Date dateOfBirth, String country, String city, String postalCode, String street, String number, String floor, String door, String email, String hashedKey) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
        this.email = email;
        this.hashedKey = hashedKey;
    }

    public User(String name, Date dateOfBirth, String country, String city, String postalCode, String street, String number, String floor, String door, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
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
