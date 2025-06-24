package com.tomignoul.store;

import com.tomignoul.store.model.Address;
import com.tomignoul.store.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tomignoul.store.model.User;
import com.tomignoul.store.model.UserRole;


@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

    private final UserRepository userRepository;
    Address address1 = new Address("street", "city", "1", "2299", "Belgium");

    public StoreApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @Override
    public void run(String... args) {
        User user = new User();
        user.setFirstName("Zane");
        user.setLastName("Tester");
        user.setEmail("zane@store.com");
        user.setPassword("test123");
        user.setAddress(address1);
        user.setRole(UserRole.CUSTOMER);

        userRepository.save(user);
    }
}

