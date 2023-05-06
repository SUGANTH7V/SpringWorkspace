package com.one.sug.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.sug.modal.companydetails;
import com.one.sug.ser.Serv;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class control {

		@Autowired
		Serv pService;
		@Tag(name="Get" ,description="get data")
		@GetMapping("/getAllPersons")
		public List<companydetails> fetchAllPersons() {
			List<companydetails> pList=pService.fetchAllPersons();
			return pList;
		}
		
		@PostMapping("/savePersons") 
		public companydetails savePersons(@RequestBody companydetails p) {
			return pService.savePersons(p);
		}
	}