package com.bootcamp.demo_sb_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo_sb_restapi.controller.model.User;

public interface UserOperation {


@GetMapping(value = "/users")
  User[] getUsers();

@GetMapping(value = "/getuser")
  User getUser(@RequestParam String userID);
// PostMapping // Create 0 - 1

// PatchMapping // Edie column
}
