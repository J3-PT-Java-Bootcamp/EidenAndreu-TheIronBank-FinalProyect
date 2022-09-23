package com.example.theironbankfinalproyect.dto.users;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.model.users.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
    private List<Checking> checking;
    private String name;
    private Date dateOfBirth;
    private Address address;
    private String phoneNumber;
    private String email;
    private String hashedKey;

}
