package com.bootcamp.demo_sb_restapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.controller.model.UserRequest;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;

public interface UserOperation {

//@1. PathVariable
// 2. RequestParam
// 3. RequestBody
@GetMapping(value = "/users")
  User[] getUsers();

@GetMapping(value = "/getuser")
  User getUser(@RequestParam String userID);
// PostMapping // Create 0 - 1
@PostMapping(value="/create/user")
User createNewUser(@RequestBody UserRequest userForm);

@GetMapping(value = "/dbuser/{id}")
UserEnity getUserFromDB(@PathVariable Long id);
// PatchMapping // Edie column
@DeleteMapping(value = "/delete/{id}")
void deleteUser(@PathVariable Long id);
}
