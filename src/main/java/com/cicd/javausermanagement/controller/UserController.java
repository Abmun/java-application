package com.cicd.javausermanagement.controller;
import com.cicd.javausermanagement.model.User;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        // Implement user creation logic
        // You can use a service to handle user management
        return "User added: " + user.getUsername();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        // Implement user deletion logic
        // You can use a service to handle user management
        return "User deleted with ID: " + id;
    }
}

