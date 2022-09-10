package com.example.theironbankfinalproyect.controller.accounts;

import com.example.theironbankfinalproyect.model.accounts.Checking;
import com.example.theironbankfinalproyect.service.accounts.CheckingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/checking")
public class CheckingController {

    private final CheckingService checkingService;


    public CheckingController(CheckingService checkingService) {
        this.checkingService = checkingService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Checking> findById(@PathVariable Long id){
        Checking checking = checkingService.findById(id);
        return ResponseEntity.ok(checking);
    }

    @GetMapping
    ResponseEntity<List<Checking>> findAll(){
        var checkings = checkingService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(checkings);
    }
}
