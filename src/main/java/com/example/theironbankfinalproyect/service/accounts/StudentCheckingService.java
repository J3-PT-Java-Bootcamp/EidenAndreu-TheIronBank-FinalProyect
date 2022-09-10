package com.example.theironbankfinalproyect.service.accounts;

import com.example.theironbankfinalproyect.model.accounts.StudentChecking;

import java.util.List;

public interface StudentCheckingService {
    List<StudentChecking> findAll();

    StudentChecking findById(Long id);

    StudentChecking save(StudentChecking studentChecking);

    void deleteById(Long id);

}
