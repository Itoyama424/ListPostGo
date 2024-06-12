package com.example.ListPostGo.dto;

import java.util.List;

import lombok.Data;

@Data
public class ModelAttributeUser {

	private String message;
	
	private List<UserTableDto> listUserTable;
}
