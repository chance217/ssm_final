package com.chance.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("welcome")
	public String welcomePage() {
		
		return "welcome";
	}
}
