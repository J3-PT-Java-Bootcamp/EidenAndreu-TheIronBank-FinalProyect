package com.example.theironbankfinalproyect.users;

import java.util.Date;

public class AccountHolder extends User{
    public AccountHolder(String name, Date dateOfBirth, String country, String city, String postalCode, String street, String number, String floor, String door, String email) {
        super(name, dateOfBirth, country, city, postalCode, street, number, floor, door, email);
    }
}
