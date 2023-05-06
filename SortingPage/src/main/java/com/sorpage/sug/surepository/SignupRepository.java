package com.sorpage.sug.surepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sorpage.sug.modal.SignupModel;



@Repository
public interface SignupRepository extends JpaRepository<SignupModel,Integer>
{
	
}