package com.nicolaslahehe.app.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicolaslahehe.app.rest.Models.user;
import com.nicolaslahehe.app.rest.Repo.UserRepo;

@RestController
public class Apicontroller {

    @Autowired
    private UserRepo UserRepo;
    
    @GetMapping(value = "/")
    public String getpage() {
        return "Welcome to Dota, you suck!";
    }

    @GetMapping(value = "/users")
    public List<user> getUsers() {
        return UserRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser (@RequestBody user user) {
        UserRepo.save(user);
        return "SEND IT, Smooth operator!";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser (@PathVariable long id, @RequestBody user user){
        user updatedUser = UserRepo.findById(id).get();
        updatedUser.setDriver(user.getDriver());
        updatedUser.setQuote(user.getQuote());
        updatedUser.setChampionships(user.getChampionships());
        updatedUser.setOccupation(user.getOccupation());
        UserRepo.save(updatedUser);
        return "Fernando is faster than you";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteUser (@PathVariable long id){
        user deleteUser = UserRepo.findById(id).get();
        UserRepo.delete(deleteUser);
        return "Retired! Karma! Shitty "+id;
    }
}
