package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeControler {
	
	@GetMapping("/getStr")
	public String getStr() {
		return "Welcome Jhon cena :: To Docker Compsoe File  ";
	}

}
