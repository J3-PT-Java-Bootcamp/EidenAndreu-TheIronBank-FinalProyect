package com.example.theironbankfinalproyect.repository.users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Admin extends JpaRepository<Admin, Long> {

}
