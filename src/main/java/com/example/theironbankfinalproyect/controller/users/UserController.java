package com.example.theironbankfinalproyect.controller.users;

import com.example.theironbankfinalproyect.model.users.User;
import com.example.theironbankfinalproyect.service.users.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    ResponseEntity<List<User>> findAll(){
        var users = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
}
