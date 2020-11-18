package com.andersen.app.bank.exception;

public class BankApplicationException extends RuntimeException{

    private final String pageName;

    public BankApplicationException(String cause, String pageNameToReturn) {
        super(cause);
        pageName = pageNameToReturn;
    }

    public String getPageName() {
        return pageName;
    }
}

