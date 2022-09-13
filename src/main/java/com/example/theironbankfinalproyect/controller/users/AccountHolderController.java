package com.example.theironbankfinalproyect.controller.users;

import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.service.users.AccountHolderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accountHolder")
public class AccountHolderController {

    private final AccountHolderService accountHolderService;


    public AccountHolderController(AccountHolderService accountHolderService) {
        this.accountHolderService = accountHolderService;
    }

    @GetMapping("/{id}")
    ResponseEntity<AccountHolder> findById(@PathVariable Long id){
        AccountHolder accountHolder = accountHolderService.findById(id);
        return ResponseEntity.ok(accountHolder);
    }

    @GetMapping
    ResponseEntity<List<AccountHolder>> findAll(){
        var accountHolders = accountHolderService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(accountHolders);
    }
}
