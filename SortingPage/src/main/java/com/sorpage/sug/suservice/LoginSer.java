package com.sorpage.sug.suservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sorpage.sug.modal.LoginModal;
import com.sorpage.sug.surepository.LoginRep;


@Service
public class LoginSer {
	@Autowired
	LoginRep userRepo;
public LoginModal saveUser (LoginModal u)
{
 return userRepo.save(u);
}
public String validateUser(String username,String password)
{
	String result="";
	LoginModal u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
	}
