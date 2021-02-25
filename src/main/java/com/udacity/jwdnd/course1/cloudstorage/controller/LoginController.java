package com.udacity.jwdnd.course1.cloudstorage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping()
    public String getLoginPage(@ModelAttribute("flashAttribute") Object signupSuccess,Model model){
        log.info("Open login page: /login");

        return "login";
    }
}
