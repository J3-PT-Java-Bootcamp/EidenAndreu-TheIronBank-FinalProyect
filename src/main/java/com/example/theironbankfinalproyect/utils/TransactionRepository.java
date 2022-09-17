package com.example.theironbankfinalproyect.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository <Transaction, String>{

    public List<Transaction> findAll();


}
