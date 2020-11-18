package com.andersen.app.bank.controller;


import com.andersen.app.bank.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AuthController {

    private final UserRepository userRepository;


    @GetMapping(value = "/")
    public ModelAndView getLoginPage() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",userRepository.findById(1));
        modelAndView.setViewName("login");

        return modelAndView;
    }}
