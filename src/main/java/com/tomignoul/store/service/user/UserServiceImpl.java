package com.tomignoul.store.service.user;

import com.tomignoul.store.model.User;
import com.tomignoul.store.repository.user.UserRepository;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    //constructor
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public void addUser(User user){
        userRepository.save(user);
    }

    
    @Override
    public Optional<User> getUserById(long id){
        return userRepository.findById(id);
    }
    
    @Override
    public User requireUserById(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

}
