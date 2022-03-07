package com.CS393.Project.service;

import com.CS393.Project.model.Answer;
import com.CS393.Project.model.User;
import com.CS393.Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

}
