package com.uls.caroccupationtool.jdbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uls.caroccupationtool.jdbc.entity.GroupEntity;
import com.uls.caroccupationtool.jdbc.entity.UserEntity;

@Mapper
public interface UserGroupMapper {

	List<UserEntity> getUsers(@Param("groupId") int groupId);
	List<GroupEntity> getGroups(@Param("userId") int userId);
	
}
