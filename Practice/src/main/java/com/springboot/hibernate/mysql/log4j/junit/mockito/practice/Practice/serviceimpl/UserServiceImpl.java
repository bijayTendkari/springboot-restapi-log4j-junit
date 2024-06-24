package com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.model.User;
import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.model.UserDto;
import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.repo.UserRepo;
import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.service.UserService;
@Service
public class UserServiceImpl implements  UserService{
	
	  @Autowired
	    private UserRepo userRepo;

	
	
	

	@Override
	public UserDto createUser(UserDto userDto) {
		  User user = new User();
	        user.setName(userDto.getName());
	        user.setEmail(userDto.getEmail());
	        user = userRepo.save(user);
	        return convertToDto(user);
	}

	@Override
	public UserDto getUserById(Long id) {
		User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return convertToDto(user);}

	@Override
	public UserDto updateUser(Long id, UserDto userDto) {
		User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user = userRepo.save(user);
        return convertToDto(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

	@Override
	public List<UserDto> getAllUsers() {
		 return userRepo.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
	}
	
	
	
	
	private UserDto convertToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
