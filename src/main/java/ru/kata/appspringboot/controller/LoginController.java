package ru.kata.appspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(value = "login")
    public String loginPage(Model model) {
        model.addAttribute("title", "Login page");
        return "pages/login";
    }

}
