package com.example.Welcomedemo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Welcomedemo.model.Student;
import com.example.Welcomedemo.repository.REPOSITORY;

@Service
public class Servicemethod {
@Autowired
REPOSITORY obj;
public List<Student> getalldetails(){
	return obj.findAll();
}
}
