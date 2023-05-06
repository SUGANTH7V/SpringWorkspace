package com.demopro.sug.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demopro.sug.model.SugModel;

@Repository
public interface SugRep extends JpaRepository <SugModel,Integer> {

}
