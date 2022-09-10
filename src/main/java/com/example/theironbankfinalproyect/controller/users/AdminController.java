package com.example.theironbankfinalproyect.controller.users;

import com.example.theironbankfinalproyect.model.users.Admin;
import com.example.theironbankfinalproyect.service.users.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Admin> findById(@PathVariable Long id){
        Admin admin = adminService.findById(id);
        return ResponseEntity.ok(admin);
    }

    @GetMapping
    ResponseEntity<List<Admin>> findAll(){
        var admins = adminService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(admins);
    }
}
