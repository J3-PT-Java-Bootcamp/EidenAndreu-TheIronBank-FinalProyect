package com.example.theironbankfinalproyect.service.users;

import com.example.theironbankfinalproyect.model.users.User;


import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User save(User user);

    void deleteById(Long id);

}
