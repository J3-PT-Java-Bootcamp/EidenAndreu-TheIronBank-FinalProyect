package com.example.theironbankfinalproyect.repository.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.model.accounts.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditAccountRepository extends JpaRepository <CreditAccount, Long> {
    List<CreditAccount> findAllById (Long id);
}
