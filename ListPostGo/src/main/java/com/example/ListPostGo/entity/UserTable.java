package com.example.ListPostGo.entity;

import java.util.Date;

import lombok.Data;

@Data
public class UserTable {

	private int id;
	private String name;
	private String address;
	private String phone;
	private Date updateTime;
}
