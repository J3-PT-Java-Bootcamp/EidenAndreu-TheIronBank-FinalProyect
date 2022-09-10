package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    Account findById(Long id);

    Account save(Account account);

    void deleteById(Long id);

}
