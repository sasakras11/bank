package com.andersen.app.bank.service;


import com.andersen.app.bank.entity.User;

public interface UserService {

    User login(String email, String password);

    User register(String email, String password, String firstName, String lastName);

    User editUser(int id, String newEmail, String newPassword, String newFirstName);

    User editUserFirstNameAndLastName(String firstName, String lastName);
}
