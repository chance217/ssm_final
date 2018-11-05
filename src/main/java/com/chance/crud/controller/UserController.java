package com.chance.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chance.crud.bean.Msg;
import com.chance.crud.bean.User;
import com.chance.crud.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	 @RequestMapping(value="/users")
	@ResponseBody
	public Msg getUserWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn) {
		PageHelper.startPage(pn, 2);
		List<User> users = userService.getAllUser();
		PageInfo page = new PageInfo(users,5);
		
		return Msg.success().add("pageInfo", page);
		
	}
	
	//@RequestMapping("/users")
	public String Users(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model ) {
		//引入mybatis分布查询pagehelper
		//每页显示2条数据
		PageHelper.startPage(pn, 2);
		List<User> users=	userService.getAllUser();
		//显示几个页码
		PageInfo page = new PageInfo(users,3);
		model.addAttribute("pageInfo", page);
		return "list";
	}
}
