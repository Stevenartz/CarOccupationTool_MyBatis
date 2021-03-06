package com.uls.caroccupationtool.jdbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uls.caroccupationtool.jdbc.entity.UserEntity;

@Mapper
public interface UserMapper {

	List<UserEntity> selectAllUsers();
	
	UserEntity lookupUserById(@Param("userId") int id);
	
}
