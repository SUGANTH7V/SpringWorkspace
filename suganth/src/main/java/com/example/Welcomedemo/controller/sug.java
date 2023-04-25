package com.example.Welcomedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Welcomedemo.model.Student;
import com.example.Welcomedemo.repository.REPOSITORY;

@RestController
public class sug {
	@Autowired
	REPOSITORY obj;
	@GetMapping("/app")
	
	public List<Student> getalldetails(){
		return obj.findAll();
	}
}
