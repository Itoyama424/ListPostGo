package com.example.ListPostGo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ListPostGo.dto.UserTableDto;
import com.example.ListPostGo.entity.UserTable;
import com.example.ListPostGo.repository.UserTableMapper;

@Service
public class UserServiceGo {
	
	@Autowired
	private UserTableMapper userTableMapper;
	
	public List<UserTableDto> selectAllUserTable() {
		
		List<UserTable> userTables = userTableMapper.selectAllUsers();
		
		List<UserTableDto> listUserDtos = new ArrayList<UserTableDto>();
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		for( UserTable userTable : userTables) {
			UserTableDto dto = new UserTableDto();
			dto.setId(userTable.getId());
			dto.setAddress(userTable.getAddress());
			dto.setName(userTable.getName());
			dto.setPhone(userTable.getPhone());
			dto.setUpdateTime(sd.format( userTable.getUpdateTime()));
			
			listUserDtos.add(dto);
		}
		
		return listUserDtos;
	}
	
	public long updateUser(List<UserTableDto> listUserDto) {
		
		long num = 0;
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		
		for(UserTableDto dto : listUserDto) {
			UserTable userTable = new UserTable();
			userTable.setId(dto.getId());
			userTable.setAddress(dto.getAddress());
			userTable.setName(dto.getName());
			userTable.setPhone(dto.getPhone());
			userTable.setUpdateTime(new Date());
			
			userTableMapper.updateUser(userTable);
			num++;
		}
		
		return num;
	}
}
