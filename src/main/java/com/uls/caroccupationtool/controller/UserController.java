package com.uls.caroccupationtool.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uls.caroccupationtool.exception.custom.NotFoundException;
import com.uls.caroccupationtool.jdbc.entity.GroupEntity;
import com.uls.caroccupationtool.jdbc.entity.UserEntity;
import com.uls.caroccupationtool.jdbc.mapper.UserGroupMapper;
import com.uls.caroccupationtool.jdbc.mapper.UserMapper;
import com.uls.caroccupationtool.model.response.group.GroupListRM;
import com.uls.caroccupationtool.model.response.group.GroupRM;
import com.uls.caroccupationtool.model.response.user.UserListRM;
import com.uls.caroccupationtool.model.response.user.UserRM;


@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserGroupMapper userGroupMapper;
	
	@GetMapping
	public UserListRM getUsers() {
		List<UserEntity> users = userMapper.selectAllUsers();
		
		UserListRM responseModel = new UserListRM();
		for (UserEntity u : users) {
			UserRM userR = new UserRM();
			userR.setId(u.getId());
			userR.setEmail(u.getEmail());
			userR.setFirstname(u.getFirstname());
			userR.setLastname(u.getLastname());
			responseModel.getUsers().add(userR);
		}
		
		return responseModel;
	}
	
	@GetMapping(path = "/{userId}")
	public UserRM getUser(@PathVariable int userId) throws Exception {
		UserEntity userEntity = userMapper.lookupUserById(userId);
		
		if (userEntity == null) {
			throw new NotFoundException("User with id: '" + userId + "' not found!");
		}
		
		UserRM userR = new UserRM();
		userR.setId(userEntity.getId());
		userR.setEmail(userEntity.getEmail());
		userR.setFirstname(userEntity.getFirstname());
		userR.setLastname(userEntity.getLastname());
		
		return userR;
	}
	
	@GetMapping(path = "/{userId}/groups")
	public GroupListRM getGroupsFromUserById(@PathVariable int userId) {
		List<GroupEntity> groups = userGroupMapper.getGroups(userId);
		
		GroupListRM responseModel = new GroupListRM();
		for (GroupEntity g : groups) {
			GroupRM groupR = new GroupRM();
			groupR.setId(g.getId());
			groupR.setName(g.getName());
			responseModel.getGroups().add(groupR);
		}
		
		return responseModel;
	}
	
	@GetMapping(path = "/{userId}/groups/{groupId}")
	public GroupRM getGroupByIdFromUserById(@PathVariable int userId, @PathVariable int groupId) {
		List<GroupEntity> groups = userGroupMapper.getGroups(userId);
		GroupRM responseModel = null;
		for (GroupEntity g : groups) {
			if (g.getId() == groupId) {
				responseModel = new GroupRM();
				responseModel.setId(g.getId());
				responseModel.setName(g.getName());
				break;
			}
		}
		return responseModel;
	}
	
}
