package com.devtool.sug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class suga {
	
	@GetMapping("/Landingpage")
	public String Landingpage(@RequestParam String name,@RequestParam String password)
	{
		if(name.equals("admin")&& password.equals("1234"))
		{
			return "true";
		}
		else
			
		{
			return "falied";
		}
	}

}
