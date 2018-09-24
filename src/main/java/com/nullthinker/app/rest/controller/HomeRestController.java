package com.nullthinker.app.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HomeRestController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
