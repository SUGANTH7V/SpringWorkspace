package com.one.sug.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.sug.model.Day5model;


@Repository
public interface Day5Repo extends JpaRepository<Day5model,Integer>
{

	Day5model save(int a);
}