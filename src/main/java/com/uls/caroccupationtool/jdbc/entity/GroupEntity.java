package com.uls.caroccupationtool.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class GroupEntity {

	private int id;
	private String name;
	private List<UserEntity> users = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<UserEntity> getUsers() {
		return users;
	}
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "GroupEntity [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
	
}
