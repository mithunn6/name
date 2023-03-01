package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class devx { 
	@RequestMapping("hello")
	public String dev(){
		String name ="devx";
		return "My name is "+name;
	}
}
