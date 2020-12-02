package com.andersen.app.bank.controller;


import com.andersen.app.bank.exception.BankApplicationException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class GlobalExceptionHandler {

    @ExceptionHandler(BankApplicationException.class)
    public ModelAndView handleApplicationException(BankApplicationException e) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("messageToUser", e.getMessage());
        modelAndView.setViewName(e.getPageName());

        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleUnexpectedException() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
