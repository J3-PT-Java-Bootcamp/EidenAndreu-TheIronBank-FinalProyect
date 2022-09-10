package com.example.theironbankfinalproyect.controller.accounts;

import com.example.theironbankfinalproyect.model.accounts.Account;
import com.example.theironbankfinalproyect.service.accounts.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Account> findById(@PathVariable Long id){
        Account account = accountService.findById(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    ResponseEntity<List<Account>> findALl(){
        var accounts = accountService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(accounts);
    }
}
