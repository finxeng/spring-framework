package com.lovejobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello/string")
	public String returnString() {
		return "index";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
