package com.example.theironbankfinalproyect.controller.accounts;

import com.example.theironbankfinalproyect.model.accounts.Account;
import com.example.theironbankfinalproyect.service.accounts.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping ("/createAccount")
    ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account createdAccount = accountService.createAccount(account.getId(),account.getAccountType(),account.getPrimaryOwner(), Optional.of(account.getSecondaryOwner()), account.getBalance());
        return ResponseEntity.ok(createdAccount);
    }

    @GetMapping
    ResponseEntity<List<Account>> findALl(){
        var accounts = accountService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(accounts);
    }

}

