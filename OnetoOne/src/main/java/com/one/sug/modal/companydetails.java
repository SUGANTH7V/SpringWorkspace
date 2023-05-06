package com.one.sug.modal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="person")
public class companydetails {

	@Id
	@GeneratedValue
	private Long id;
	private String type_of_business;
	private String email;
	private String no_of_employees;
	private String working_language;
	private String turnover;
	private int  yearextablish;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType_of_business() {
		return type_of_business;
	}

	public void setType_of_business(String type_of_business) {
		this.type_of_business = type_of_business;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNo_of_employees() {
		return no_of_employees;
	}

	public void setNo_of_employees(String no_of_employees) {
		this.no_of_employees = no_of_employees;
	}

	public String getWorking_language() {
		return working_language;
	}

	public void setWorking_language(String working_language) {
		this.working_language = working_language;
	}

	public String getTurnover() {
		return turnover;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}

	public int getYearextablish() {
		return yearextablish;
	}

	public void setYearextablish(int yearextablish) {
		this.yearextablish = yearextablish;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", type_of_business=" + type_of_business + ", email=" + email + ", no_of_employees="
				+ no_of_employees + ", working_language=" + working_language + ", turnover=" + turnover
				+ ", yearextablish=" + yearextablish + ", address=" + address + "]";
	}

	
}