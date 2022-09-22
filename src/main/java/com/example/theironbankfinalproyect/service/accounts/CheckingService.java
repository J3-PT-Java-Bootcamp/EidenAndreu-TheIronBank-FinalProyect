package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.AccountType;
import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.utils.Money;


import java.time.Instant;
import java.util.List;

public interface CheckingService {
    List<Checking> findAll();

    Checking newChecking(long secretKey, Instant creationTime, Money balance);

    Checking findById(Long id);

    Checking save(Checking checking);

    void deleteById(Long id);

}
