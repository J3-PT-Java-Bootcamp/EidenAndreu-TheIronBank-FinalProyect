package com.example.theironbankfinalproyect.service.users;

import com.example.theironbankfinalproyect.model.users.User;
import com.example.theironbankfinalproyect.model.users.UserType;


import java.util.List;

public interface UserService {

    User createUser(Long id, String name, UserType userType);

    List<User> findAll();

    User findById(Long id);

    User save(User user);

    void deleteById(Long id);

}
