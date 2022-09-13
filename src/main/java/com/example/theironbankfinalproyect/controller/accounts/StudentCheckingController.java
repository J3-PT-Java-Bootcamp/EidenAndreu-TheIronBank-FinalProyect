package com.example.theironbankfinalproyect.controller.accounts;

import com.example.theironbankfinalproyect.model.accounts.StudentChecking;
import com.example.theironbankfinalproyect.service.accounts.StudentCheckingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentChecking")
public class StudentCheckingController {


      private final StudentCheckingService studentCheckingService;

    public StudentCheckingController(StudentCheckingService studentCheckingService) {
        this.studentCheckingService = studentCheckingService;
    }


    @GetMapping("/{id}")
    ResponseEntity<StudentChecking> findById(@PathVariable Long id){
        StudentChecking studentChecking = studentCheckingService.findById(id);
        return ResponseEntity.ok(studentChecking);
    }

    @GetMapping
    ResponseEntity<List<StudentChecking>> findAll(){
        var studentCheckings = studentCheckingService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(studentCheckings);
    }

}
