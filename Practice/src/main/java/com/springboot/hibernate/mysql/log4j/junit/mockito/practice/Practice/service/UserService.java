package com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.service;

import java.util.List;

import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.model.UserDto;

public interface UserService {

	  UserDto createUser(UserDto userDto);
	    UserDto getUserById(Long id);
	    UserDto updateUser(Long id, UserDto userDto);
	    void deleteUser(Long id);
	    List<UserDto> getAllUsers();
	
	
}
