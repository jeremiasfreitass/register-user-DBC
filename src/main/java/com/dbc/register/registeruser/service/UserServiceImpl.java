package com.dbc.register.registeruser.service;

import com.dbc.register.registeruser.model.User;
import com.dbc.register.registeruser.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(User user) {
        User userSaved = this.userRepository.save(user);
        //Chamar o kafka service
        return userSaved;
    }
}
