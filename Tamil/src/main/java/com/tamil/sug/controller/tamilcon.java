package com.tamil.sug.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.sug.model.TamilModel;
import com.tamil.sug.repository.TamilRep;

@RestController
public class tamilcon {
	@Autowired
	TamilRep si;
	@GetMapping("/url")
	public List<TamilModel> gelalldetails(){
		return si.findAll();	
	}
	@PostMapping("/save")
	public TamilModel saveall (@RequestBody TamilModel id) {
		return si.save(id);
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteDetailsById(@PathVariable int id) {
		
		si.deleteById(id);
		return "Details Deleted";
	}
	

}
