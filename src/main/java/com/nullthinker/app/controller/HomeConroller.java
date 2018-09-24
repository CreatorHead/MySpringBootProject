package com.nullthinker.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeConroller {
	
	@RequestMapping("/index")
	public String home() {
		System.out.println("Got request for home page");
		return "Home";
	}
}
