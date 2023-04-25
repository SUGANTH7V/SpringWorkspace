package com.tamil.sug.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.sug.model.TamilModel;

@Repository
public interface TamilRep extends JpaRepository<TamilModel ,Integer> {

	

	

}
