package com.dbc.register.registeruser.controller;

import com.dbc.register.registeruser.model.User;
import com.dbc.register.registeruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return ResponseEntity.ok(this.userService.save(user));
    }

}
