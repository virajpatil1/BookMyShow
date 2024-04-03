package com.project.bookmyshow.service;

import com.project.bookmyshow.models.User;
import com.project.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    public User createNewUser(String username, String password){

        User user = new User(username,password);

        return userRepository.save(user);
    }
}
