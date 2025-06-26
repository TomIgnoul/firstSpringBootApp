package com.tomignoul.store.repository.user;

import com.tomignoul.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
