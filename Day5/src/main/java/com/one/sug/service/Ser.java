package com.one.sug.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.sug.model.Day5model;
import com.one.sug.repository.Day5Repo;
@Service
public class Ser
{
	@Autowired
	Day5Repo ar;
	public Day5model getAllDetails(Day5model id)
	{
		return ar.save(id);
	}
	public List<Day5model> findAll()
	{
		return ar.findAll();
	}
	public Optional<Day5model> getDetailsById(int id)
	{
		return ar.findById(id);
	}
	public Day5model getDetailsById1(Day5model id)
	{
		return ar.save(id);
	}
	public void getDetailsById2(int id)
	{
		ar.deleteById(id);
	}
}