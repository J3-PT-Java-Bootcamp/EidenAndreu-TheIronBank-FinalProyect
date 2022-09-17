package com.example.theironbankfinalproyect.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
        final
        TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transfer")
        public Transaction transfer(@RequestBody Transaction transaction) {
            return TransactionService.transfer(transaction.getAmount(), transaction.getFromAccount(), transaction.getToAccount(), transaction.getUser());
        }
    }

