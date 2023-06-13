package com.one.sug.ServiceCompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.one.sug.CompanyModel.Usermodel;
import com.one.sug.RepositoryCompany.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository crepo;

	public List<Usermodel> sorting(String CompanyName) {
		// TODO Auto-generated method stub
		return crepo.findAll(Sort.by(CompanyName).descending());
	}

	public List<Usermodel> page(int num, int size) {
		// TODO Auto-generated method stub
		Page<Usermodel> p=crepo.findAll(PageRequest.of(num, size));
		return p.getContent(); 
	}

	public List<Usermodel> paginationsorting(int pnum, int psize, String name) {
		// TODO Auto-generated method stub
		Page<Usermodel> p=crepo.findAll(PageRequest.of(pnum, psize, Sort.by(name).descending()));
		return p.getContent();
	}
	
	}


