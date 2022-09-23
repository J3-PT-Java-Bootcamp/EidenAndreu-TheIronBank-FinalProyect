package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.*;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.utils.Money;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import static com.example.theironbankfinalproyect.model.accounts.AccountType.*;
import static com.example.theironbankfinalproyect.model.accounts.AccountType.STUDENTCHECKING;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account createAccount(Long id, AccountType accountType, AccountHolder primaryOwner, Optional<AccountHolder> secondaryOwner, Money balance) {
        switch (accountType) {
            case CHECKING:
                Checking checkingAccount = new Checking(primaryOwner, balance, Instant.now());
                break;
            case CREDITACCOUNT:
                CreditAccount creditAccount = new CreditAccount(primaryOwner, balance, Instant.now());
                break;
            case SAVINGS:
                Savings savingAccount = new Savings(primaryOwner, balance, Instant.now());
                break;
            case STUDENTCHECKING:
                StudentChecking studentChecking = new StudentChecking(primaryOwner, balance, Instant.now());
                break;
            default:
                System.out.println("You must select one account type");
                break;
        }

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
