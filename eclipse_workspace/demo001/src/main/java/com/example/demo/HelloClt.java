package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClt {
	@RequestMapping(value= {"/hello"})
	public String sayhello() {
		return "hello world!";
	}
}

