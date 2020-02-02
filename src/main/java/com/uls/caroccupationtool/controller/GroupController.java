package com.uls.caroccupationtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uls.caroccupationtool.exception.custom.NotFoundException;
import com.uls.caroccupationtool.jdbc.entity.GroupEntity;
import com.uls.caroccupationtool.jdbc.mapper.GroupMapper;
import com.uls.caroccupationtool.jdbc.mapper.UserGroupMapper;

@RestController
@RequestMapping("groups")
public class GroupController {

	@Autowired
	private GroupMapper groupMapper;
	
	@Autowired
	private UserGroupMapper userGroupMapper;
	
	@GetMapping
	public List<GroupEntity> getGroups() {
		return groupMapper.selectAllGroups();
	}
	
	@GetMapping(path = "/{id}")
	public GroupEntity getGroup(@PathVariable int id) throws Exception {
		GroupEntity groupEntity = groupMapper.lookupGroupById(id);
		
		if (groupEntity == null) {
			throw new NotFoundException("Group with id: '" + id + "' not found!");
		} else {
			groupEntity.setUsers(userGroupMapper.getUsers(id));
		}
		return groupEntity;
	}
	
}
