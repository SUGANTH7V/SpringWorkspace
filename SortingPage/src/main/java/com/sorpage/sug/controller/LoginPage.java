package com.sorpage.sug.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sorpage.sug.modal.LoginModal;
import com.sorpage.sug.suservice.LoginSer;


@RestController
public class LoginPage {
@Autowired
LoginSer usrService;
@PostMapping("/Login")
	public String validateUser(@RequestBody LoginModal u)
	{
	System.out.println(u.getUsername());
		return usrService.validateUser(u.getUsername(),u.getPassword());
	}
@PostMapping("/add")
public LoginModal LoginModal(@RequestBody LoginModal u)
{
return usrService.saveUser(u);
}


}