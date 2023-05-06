package com.one.sug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.sug.Model.Day3Model;
import com.one.sug.repository.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Control {
	@Autowired
	Repo sd;
	@GetMapping("/student")
	public List<Day3Model> getdetails(){
		return sd.findAll();
	}
	@PostMapping("/students")
	public Day3Model SaveAll(@RequestBody Day3Model Id) {
		
		return sd.save(Id);	
		
	}
}
