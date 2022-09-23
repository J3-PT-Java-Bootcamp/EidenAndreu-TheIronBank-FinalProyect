package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.model.accounts.CreditAccount;

import java.util.List;

public interface CreditAccountService {
    List<CreditAccount> findAll();

    CreditAccount findById(Long id);

    CreditAccount save(CreditAccount creditAccount);

    void deleteById(Long id);

}
