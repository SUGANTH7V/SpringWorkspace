package com.one.sug.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.sug.modal.address;



@Repository
public interface addressrep extends JpaRepository<address, Long>{
	
}