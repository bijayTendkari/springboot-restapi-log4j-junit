package com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hibernate.mysql.log4j.junit.mockito.practice.Practice.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
