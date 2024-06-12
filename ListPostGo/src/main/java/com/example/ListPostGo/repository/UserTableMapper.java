package com.example.ListPostGo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ListPostGo.entity.UserTable;

@Mapper
public interface UserTableMapper {
	
	List<UserTable> selectAllUsers();
	
	long updateUser(UserTable userTable);

}
