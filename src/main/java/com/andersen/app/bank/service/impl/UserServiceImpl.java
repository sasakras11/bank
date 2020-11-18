package com.andersen.app.bank.service.impl;

import com.andersen.app.bank.entity.User;
import com.andersen.app.bank.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User login(String email, String password) {
        return null;
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
