package com.example.theironbankfinalproyect.service.users;


import com.example.theironbankfinalproyect.model.users.Admin;


import java.util.List;

public interface AdminService {
    List<Admin> findAll();

    Admin findById(Long id);

    Admin save(Admin admin);

    void deleteById(Long id);
}
