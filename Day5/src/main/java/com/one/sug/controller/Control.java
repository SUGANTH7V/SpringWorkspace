package com.one.sug.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.sug.model.Day5model;
import com.one.sug.service.Ser;


@RestController
public class Control
{
	@Autowired
	Ser as;
	@PostMapping("/")
	public String getAllDetails(@RequestBody Day5model id)
	{
		Day5model am=as.getAllDetails(id);
		String result="false";
		if(am!=null)
		{
			result="true";
		}
		return result;
	}
	@GetMapping("/")
	public List<Day5model> getAllDetails1()
	{
		return as.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Day5model> getDetailsById(@PathVariable int id)
	{
		return as.getDetailsById(id);
	}
	@PutMapping("/{id}")
	public Day5model getDetailsById1(@RequestBody Day5model id)
	{
		return as.getDetailsById1(id);
	}
	@DeleteMapping("/{id}")
	public String getDetailsById2(@PathVariable int id)
	{
		as.getDetailsById2(id);
		return "details deleted";
	}
}