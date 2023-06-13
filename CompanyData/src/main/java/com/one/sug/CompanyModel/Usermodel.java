package com.one.sug.CompanyModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usermodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Comid;
	@Column(name ="CompanyName",nullable=false)
	private String CompanyName;
	private String CompanyAddress ;
	private String Email;
	private String LevelOfOffice;
	private String TypeOfBussiness;
	private String Website;
	public Long getComid() {
		return Comid;
	}
	public void setComid(Long comid) {
		Comid = comid;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getLevelOfOffice() {
		return LevelOfOffice;
	}
	public void setLevelOfOffice(String levelOfOffice) {
		LevelOfOffice = levelOfOffice;
	}
	public String getTypeOfBussiness() {
		return TypeOfBussiness;
	}
	public void setTypeOfBussiness(String typeOfBussiness) {
		TypeOfBussiness = typeOfBussiness;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	@Override
	public String toString() {
		return "Usermodel [Comid=" + Comid + ", CompanyName=" + CompanyName + ", CompanyAddress=" + CompanyAddress
				+ ", Email=" + Email + ", LevelOfOffice=" + LevelOfOffice + ", TypeOfBussiness=" + TypeOfBussiness
				+ ", Website=" + Website + "]";
	}



}
