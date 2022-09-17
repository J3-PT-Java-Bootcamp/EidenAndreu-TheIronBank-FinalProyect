package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Account;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.utils.Money;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account createAccount(Long id, AccountHolder primaryOwner, Optional<AccountHolder> secondaryOwner, Money balance) {
        return null;
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

}
