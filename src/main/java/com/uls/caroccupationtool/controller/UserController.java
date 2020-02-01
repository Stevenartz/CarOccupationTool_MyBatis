package com.uls.caroccupationtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uls.caroccupationtool.jdbc.entity.UserEntity;
import com.uls.caroccupationtool.jdbc.mapper.UserMapper;


@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@GetMapping
	public List<UserEntity> getUsers() {
		return userMapper.selectAllUsers();
	}
	
}
