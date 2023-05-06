package com.one.sug.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.sug.modal.companydetails;
import com.one.sug.repo.personrep;



@Service
public class Serv {
	@Autowired
	personrep personRepo;
	
	public List<companydetails> fetchAllPersons(){
		return personRepo.findAll();
	}
	
	public companydetails savePersons(companydetails p) {
		return personRepo.save(p);
	}
	
}