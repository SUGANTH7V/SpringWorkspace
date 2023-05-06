package com.one.sug.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.sug.modal.companydetails;




@Repository
public interface personrep extends JpaRepository<companydetails, Long>{
	
}