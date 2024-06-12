package com.example.ListPostGo.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserListForm {
	
	private String message;
	
	private List<UserTableDto> listUserTable;
}
