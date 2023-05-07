package com.geekster.EcommerceAPI.controllers;

import com.geekster.EcommerceAPI.models.User;
import com.geekster.EcommerceAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping(value = "/user")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

}
