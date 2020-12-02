package com.andersen.app.bank.service.impl;

import com.andersen.app.bank.entity.User;
import com.andersen.app.bank.exception.BankApplicationException;
import com.andersen.app.bank.repository.UserRepository;
import com.andersen.app.bank.service.PasswordEncoder;
import com.andersen.app.bank.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public User login(String email, String password){
    Optional<User> byEmail = userRepository.findByEmail(email);
    boolean loggedIn = false;
    if (byEmail.isPresent()) {
        loggedIn = passwordEncoder.matches(password, byEmail.get().getPassword());
    }

    if (!loggedIn) {
        throw new BankApplicationException("wrong credentials", "login");
    }
    log.info(
            String.format(
            "user with email [%s] and password [%s] logged in successfully", email, password));
    return byEmail.get();
    }

    @Override
    public User register(String email, String password, String firstName, String lastName) {
        return null;
    }

    @Override
    public User editUser(int id, String newEmail, String newPassword, String newFirstName) {
        return null;
    }

    @Override
    public User editUserFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }
}
