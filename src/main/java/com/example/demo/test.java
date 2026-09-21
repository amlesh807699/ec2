package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class test {

    // GET
    @GetMapping("/hello")
    public String hello() {
        return "Hello from AWS EC2!";
    }

    // GET with path variable
    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id) {
        return "User ID: " + id;
    }

    // POST
    @PostMapping("/users")
    public Map<String, Object> createUser(@RequestBody Map<String, Object> user) {
        return Map.of(
                "message", "User created successfully",
                "user", user
        );
    }

    // PUT
    @PutMapping("/users/{id}")
    public String updateUser(
            @PathVariable int id,
            @RequestBody Map<String, Object> user) {

        return "User " + id + " updated: " + user;
    }

    // DELETE
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User " + id + " deleted successfully";
    }
}