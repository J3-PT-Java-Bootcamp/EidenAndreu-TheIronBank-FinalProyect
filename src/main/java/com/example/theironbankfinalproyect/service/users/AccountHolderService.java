package com.example.theironbankfinalproyect.service.users;


import com.example.theironbankfinalproyect.model.users.AccountHolder;


import java.util.List;


public interface AccountHolderService {
    List<AccountHolder> findAll();

    AccountHolder findById(Long id);

    AccountHolder save(AccountHolder accountHolder);

    void deleteById(Long id);

}