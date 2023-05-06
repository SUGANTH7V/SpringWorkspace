package com.sorpage.sug.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sorpage.sug.modal.SuModal;
import com.sorpage.sug.suservice.SuService;

@RestController
public class SuController {
	@Autowired
	SuService ar;
	@GetMapping("/sort/{field}")
	public List<SuModal> sortmodal(@PathVariable String field)
	{
		return ar.sortmodal(field);
	}
	@GetMapping("/pagging/{offset}/{pagesize}")
	public List<SuModal> paggingmodal(@PathVariable int offset,@PathVariable int pagesize )
	{
		return ar.paggingmodal(offset,pagesize);
		
	}
	@GetMapping("/pagging/{offset}/{pagesize}/{field}")
	public List<SuModal> paggingmodal(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field )
	{
		return ar.paggingmodal(offset,pagesize,field);
	}

}
