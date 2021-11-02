package com.thanh.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHelo() {
		// TODO Auto-generated constructor stub
		return "Hello World! time on server is: " + LocalDateTime.now();
	}

}
