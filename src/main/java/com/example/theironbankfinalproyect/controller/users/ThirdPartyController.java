package com.example.theironbankfinalproyect.controller.users;

import com.example.theironbankfinalproyect.model.users.ThirdParty;
import com.example.theironbankfinalproyect.service.users.ThirdPartyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/thirdParty")
public class ThirdPartyController {
    private final ThirdPartyService thirdPartyService;

    public ThirdPartyController(ThirdPartyService thirdPartyService) {
        this.thirdPartyService = thirdPartyService;
    }

    @GetMapping("/{id}")
    ResponseEntity<ThirdParty> findByid(@PathVariable Long id){
        ThirdParty thirdParty = thirdPartyService.findById(id);
        return ResponseEntity.ok(thirdParty);
    }

    @GetMapping
    ResponseEntity<List<ThirdParty>> findAll(){
        var thirdparties = thirdPartyService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(thirdparties);
    }
}
