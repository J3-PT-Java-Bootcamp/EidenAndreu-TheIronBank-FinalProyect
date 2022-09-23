package com.example.theironbankfinalproyect.utils;

import com.example.theironbankfinalproyect.model.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{


    final
    TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction transfer(Money amount, long fromAccount, long toAccount, User user) {
        Transaction transaction = Transaction.transfer(amount, fromAccount, toAccount, user);
        transactionRepository.save(transaction);
        return transaction;
    }

}