package com.example.ListPostGo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ListPostGo.dto.ModelAttributeUser;
import com.example.ListPostGo.dto.UserListForm;
import com.example.ListPostGo.dto.UserTableDto;
import com.example.ListPostGo.service.UserServiceGo;

@Controller
public class ListPostGoController {
	@Autowired
	private UserServiceGo userService;
	
	@ModelAttribute("message")
	public String setMessage() {
		return "@Modelattribute";
	}
	
	@GetMapping("/userlist")
	public String viewUserList(Model model) {
		
		List<UserTableDto> listuserdto = userService.selectAllUserTable();
		
		UserListForm userListForm = new UserListForm();
		
		userListForm.setMessage("TESTユーザー一覧");
		userListForm.setListUserTable(listuserdto);
		
		model.addAttribute("userListForm", userListForm);
	
		return "list";
		
	}
	
	@PostMapping("listUpdate")
	public String updateList(@ModelAttribute("UserListForm") ModelAttributeUser user, Model model) {
		
		List<UserTableDto> listuserdto = user.getListUserTable();
		
		long num = userService.updateUser(listuserdto);
		
		return "redirect:/userlist";
	}
}
