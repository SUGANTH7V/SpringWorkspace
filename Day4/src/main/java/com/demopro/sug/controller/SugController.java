package com.demopro.sug.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demopro.sug.model.SugModel;
import com.demopro.sug.repository.SugRep;

@RestController

public class SugController {
@Autowired
SugRep obj;
@GetMapping("/app")
public List<SugModel> getdetails(){
	return obj.findAll();
}

@PostMapping("/save")
public SugModel SaveAll(@RequestBody SugModel reg) {
	
	return obj.save(reg);
	
}
@PutMapping("/put")
public SugModel SaveAlll(@RequestBody SugModel reg) {
	
	return obj.save(reg);
}

@GetMapping("/app/{id}")

public SugModel getDetailsById(@PathVariable int id) {
	
	return obj.findById(id).orElse(null);
}

@DeleteMapping("/app/{id}")
public String deleteDetailsById(@PathVariable int id) {
	
	obj.deleteById(id);
	return "Details Deleted";
}
}
