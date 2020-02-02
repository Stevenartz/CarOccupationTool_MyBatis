package com.uls.caroccupationtool.model.response.group;

import java.util.ArrayList;
import java.util.List;

public class GroupListRM {

	private List<GroupRM> groups = new ArrayList<>();

	public List<GroupRM> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupRM> groups) {
		this.groups = groups;
	}
	
}
