package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {

	@GetMapping("")
	public String sayHello() {
		return "Hello";
	}
	
	@PostMapping("")
	public String sayHello(@RequestBody String name) {
	return "Hello " + name + "!";
}

	@GetMapping("/{name}")
	public String sayHelloCustom(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}
