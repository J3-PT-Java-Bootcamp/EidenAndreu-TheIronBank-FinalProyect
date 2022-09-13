package com.example.theironbankfinalproyect.controller.accounts;

import com.example.theironbankfinalproyect.model.accounts.CreditAccount;
import com.example.theironbankfinalproyect.service.accounts.CreditAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creditAccount")
public class CreditAccountController {

    private final CreditAccountService creditAccountService;


    public CreditAccountController(CreditAccountService creditAccountService) {
        this.creditAccountService = creditAccountService;
    }

    @GetMapping("/{id}")
    ResponseEntity<CreditAccount> findById(@PathVariable Long id){
        CreditAccount creditAccount = creditAccountService.findById(id);
        return ResponseEntity.ok(creditAccount);
    }

    @GetMapping
    ResponseEntity<List<CreditAccount>> findAll(){
        var creditAccounts = creditAccountService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(creditAccounts);
    }
}
