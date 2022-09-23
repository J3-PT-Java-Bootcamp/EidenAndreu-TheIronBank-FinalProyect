package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.*;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.utils.Money;
import com.example.theironbankfinalproyect.model.accounts.AccountType;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import static com.example.theironbankfinalproyect.model.accounts.AccountType.*;

public interface AccountService {
    List<Account> findAll();


    Account createAccount(Long id, AccountType accountType, AccountHolder primaryOwner, Optional<AccountHolder> secondaryOwner, Money balance);

    Account findById(Long id);

    Account save(Account account);

    void deleteById(Long id);

}
