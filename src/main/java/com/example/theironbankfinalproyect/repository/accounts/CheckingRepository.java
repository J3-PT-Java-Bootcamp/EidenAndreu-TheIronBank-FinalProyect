package com.example.theironbankfinalproyect.repository.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckingRepository extends JpaRepository<Checking, Long> {
    List<Checking> findAllById (Long id);

}
