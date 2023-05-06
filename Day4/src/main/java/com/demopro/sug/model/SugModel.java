package com.demopro.sug.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SugModel {
	@Id
	private int reg;
	private String name;
	private String dept;
	private String email;
	
	SugModel(){}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
