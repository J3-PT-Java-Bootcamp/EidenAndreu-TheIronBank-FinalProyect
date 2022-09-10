package com.example.theironbankfinalproyect.repository.users;


import com.example.theironbankfinalproyect.model.users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
