package com.one.sug.RepositoryCompany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.sug.CompanyModel.Usermodel;


@Repository
public interface UserRepository extends JpaRepository<Usermodel,Long> {

}
