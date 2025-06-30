package com.tomignoul.store.service.user;

import com.tomignoul.store.model.User;

import java.util.Optional;

public interface UserService {
    void addUser(User user);

    Optional<User> getUserById(long id);
    User requireUserById(long id);



}
