package org.example.spring_jpa.controller;


import org.example.spring_jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.example.spring_jpa.entity.User;
import org.springframework.ui.Model;
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user(Model model) {
        System.out.println("✅ Đã gọi được /user");
        Iterable<User> users = userService.getListUser();
        model.addAttribute("users", users);
        System.out.println(model.getAttribute("users"));
        return "test";
    }

}
