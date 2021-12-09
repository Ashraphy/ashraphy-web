package com.ashraphy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AshraphyController {
	
	@RequestMapping("/")
	public String getHello() {
		return "Hello";
	}

}
