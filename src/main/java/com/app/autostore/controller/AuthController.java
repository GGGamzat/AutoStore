package com.app.autostore.controller;

import com.app.autostore.entity.User;
import com.app.autostore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    private UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/registration")
    public String showRegPage() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(@RequestParam(required = true, defaultValue = "!@") String username,
                               @RequestParam (required = true, defaultValue = "!@") String password) {
        if(!(username.equals("!@") & password.equals("!@"))) {
            System.out.println(username + " " + password);
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            if(userService.saveUser(user))
                System.out.println("GOOD");
            else
                System.out.println("BAD");
        }
        return "redirect:/home";
    }
}