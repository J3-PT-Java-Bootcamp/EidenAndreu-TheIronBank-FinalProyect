package com.example.theironbankfinalproyect.repository.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.model.accounts.Savings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavingsRepository extends JpaRepository<Savings, Long> {
    List<Savings> findAllById (Long id);
}
