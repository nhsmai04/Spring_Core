package org.example.spring_jpa.controller;



import org.example.spring_jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.example.spring_jpa.entity.User;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("/")
    public String user(Model model) {
        model.addAttribute("users",userService.getAllUsers());
        return "index";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "new";
    }

    @PostMapping("/adduser")
    public String newUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {
       model.addAttribute("user",userService.getUserById(id));
       return "edit";
    }
    @PostMapping("/edituser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @PostMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable("id")  int id) {
        userService.deleteUserById(id);
        return "redirect:/";
    }
}
