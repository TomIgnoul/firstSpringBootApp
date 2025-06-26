package com.tomignoul.store.service.user;

import com.tomignoul.store.model.User;
import com.tomignoul.store.repository.user.UserRepository;

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
}
