package com.uls.caroccupationtool.model.response.user;

import java.util.ArrayList;
import java.util.List;

public class UserListRM {

	private List<UserRM> users = new ArrayList<>();

	public List<UserRM> getUsers() {
		return users;
	}

	public void setUsers(List<UserRM> users) {
		this.users = users;
	}
	
	
}
