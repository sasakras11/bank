package com.andersen.app.bank.service;

import com.andersen.app.bank.exception.BankApplicationException;
import org.springframework.stereotype.Component;

@Component
public class Validator {

    private static final String PASSWORD_PATTERN = "[a-zA-Z0-9]{8,}";
    private static final String EMAIL_PATTERN = "^(.+)@(.+)$"; // TODO make better pattern
    private static final String NAME_PATTERN = "[a-zA-Z]{2,12}";
    private static final String REGISTER_PAGE_NAME = "register";
    private static final String ADD_BULLETIN_PAGE = "add_bulletin";

    public void validateName(String name) {
        if (!name.matches(NAME_PATTERN)) {
            throw new BankApplicationException(
                    "not valid name. Length should be (2-12) characters and contain only latin symbols",
                    REGISTER_PAGE_NAME); // edit
        }
    }

    public void validateEmail(String email) {
        if (!email.matches(EMAIL_PATTERN)) {
            throw new BankApplicationException("not valid email", REGISTER_PAGE_NAME);
        }
    }

    public void validatePassword(String pass) {
        if (!pass.matches(PASSWORD_PATTERN)) {
            throw new BankApplicationException(
                    "not valid password(should be more then 8 characters long and only latin symbols and numbers)",
                    REGISTER_PAGE_NAME);
        }
    }

    public void validateBulletinHeader(String header) {
        if (header.length() < 8 || header.length() > 30) {
            throw new BankApplicationException(
                    "header length should be from 8 to 30 characters long", ADD_BULLETIN_PAGE);
        }
    }

    public void validateBulletinText(String text) {
        if (text.length() > 300 || text.length() < 20) {
            throw new BankApplicationException(
                    "text length should be from 20 to 300 characters long", ADD_BULLETIN_PAGE);
        }
    }

    public void validateFileExtension(String filename) {
        if (!filename.endsWith(".jpeg") && !filename.endsWith(".jpg") && !filename.endsWith(".png")) {
            throw new BankApplicationException(
                    String.format(
                            "you can load only .jpg or .png file, file, you uploaded %s type",
                            filename.substring(filename.lastIndexOf('.')).trim()),
                    ADD_BULLETIN_PAGE);
        }
    }
}