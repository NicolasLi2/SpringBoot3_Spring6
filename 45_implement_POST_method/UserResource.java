package com.in28minutes.rest.webservices.restfulwebservices.user;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    //GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    //GET /users
    @GetMapping("/users/{id}")
    public User retrieveAllUsers(@PathVariable int id) {
        return service.findOne(id);
    }

    //POST /users
    @PostMapping("/users")
    public void createsUser(@RequestBody User user) {
        service.save(user);
        //use "Talend API Tester" can send post, use this tool can add a new user
    }
}
