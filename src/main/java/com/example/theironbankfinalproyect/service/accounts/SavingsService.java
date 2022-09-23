package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Savings;

import java.util.List;

public interface SavingsService {
    List<Savings> findAll();

    Savings findById(Long id);

    Savings save(Savings savings);

    void deleteById(Long id);

}
