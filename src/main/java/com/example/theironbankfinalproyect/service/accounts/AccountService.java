package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Account;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.utils.Money;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> findAll();

    Account createAccount(Long id, AccountHolder primaryOwner, Optional<AccountHolder> secondaryOwner, Money balance);

    Account findById(Long id);

    Account save(Account account);

    void deleteById(Long id);

}
