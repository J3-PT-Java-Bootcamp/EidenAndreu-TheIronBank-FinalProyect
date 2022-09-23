package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.utils.Money;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class CheckingServiceImpl implements CheckingService {

    @Override
    public List<Checking> findAll() {
        return null;
    }

    @Override
    public Checking newChecking(long secretKey, Instant creationTime, Money balance) {
        return null;
    }

    @Override
    public Checking findById(Long id) {
        return null;
    }

    @Override
    public Checking save(Checking checking) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
