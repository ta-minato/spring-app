package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.User;

@Controller
public class MainController {
	

    @GetMapping("/")
    public String getUsers(Model model) {
        List<User> users = Arrays.asList(
                new User("Alice", "alice@example.com"),
                new User("Bob", "bob@example.com"),
                new User("Charlie", "charlie@example.com")
        );

        model.addAttribute("users", users);
        return "users";
    }
}
