package com.sorpage.sug.surepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sorpage.sug.modal.LoginModal;


@Repository
public interface LoginRep extends JpaRepository<LoginModal,Integer>{
	LoginModal findByUsername(String username);

}