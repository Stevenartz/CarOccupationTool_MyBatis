package com.uls.caroccupationtool.jdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class UserEntity {

	private int id;
	private String email;
	private String firstname;
	private String lastname;
	private List<GroupEntity> groups = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List<GroupEntity> getGroups() {
		return groups;
	}
	public void setGroups(List<GroupEntity> groups) {
		this.groups = groups;
	}
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", groups=" + groups + "]";
	}
	
}
