package com.example.ListPostGo.dto;

import java.util.List;

import lombok.Data;

@Data
public class ModelAttributeUser {

	private String message;
	
	private String sessionId;
	
	private List<UserTableDto> listUserTable;
}
