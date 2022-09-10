package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;


import java.util.List;

public interface CheckingService {
    List<Checking> findAll();

    Checking findById(Long id);

    Checking save(Checking checking);

    void deleteById(Long id);

}
