package com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.model.UserDto;
import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	
	 @Autowired
	    private UserService userService;

	    @PostMapping
	    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
	        return ResponseEntity.ok(userService.createUser(userDto));
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
	        return ResponseEntity.ok(userService.getUserById(id));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<UserDto> updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
	        return ResponseEntity.ok(userService.updateUser(id, userDto));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }

	    @GetMapping
	    public ResponseEntity<List<UserDto>> getAllUsers() {
	        return ResponseEntity.ok(userService.getAllUsers());
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
