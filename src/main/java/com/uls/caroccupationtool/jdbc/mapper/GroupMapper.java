package com.uls.caroccupationtool.jdbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uls.caroccupationtool.jdbc.entity.GroupEntity;

@Mapper
public interface GroupMapper {

	List<GroupEntity> selectAllGroups();
	
	GroupEntity lookupGroupById(@Param("groupId") int id);
	
}
