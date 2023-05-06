package com.sorpage.sug.suservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sorpage.sug.modal.SignupModel;
import com.sorpage.sug.surepository.SignupRepository;



@Service
public class SignupService
{
	@Autowired
	SignupRepository sr;
	public List<SignupModel> getUserDetail()
	{
		return sr.findAll();
	}
	public SignupModel saveUserDetail(SignupModel u)
	{
		return sr.save(u);
	}
	
}