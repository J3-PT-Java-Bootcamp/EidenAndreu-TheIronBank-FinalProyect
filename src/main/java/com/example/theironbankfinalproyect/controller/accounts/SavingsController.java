package com.example.theironbankfinalproyect.controller.accounts;

import com.example.theironbankfinalproyect.model.accounts.Savings;
import com.example.theironbankfinalproyect.service.accounts.SavingsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/savings")
public class SavingsController {

    private final SavingsService savingsService;

    public SavingsController(SavingsService savingsService) {
        this.savingsService = savingsService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Savings> findById(@PathVariable Long id) {
        Savings savings = savingsService.findById(id);
        return ResponseEntity.ok(savings);
    }

    @GetMapping
    ResponseEntity<List<Savings>> findAll(){
        var savings = savingsService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(savings);
    }
}
