package com.example.ListPostGo.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserListForm {
	
	private String message;
	
	private String sessionId;
	
	private List<UserTableDto> listUserTable;
}
