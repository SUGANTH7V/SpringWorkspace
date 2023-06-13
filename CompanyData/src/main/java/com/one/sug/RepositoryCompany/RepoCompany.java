package com.one.sug.RepositoryCompany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.sug.CompanyModel.ModelCompany;
@Repository
public interface RepoCompany extends JpaRepository<ModelCompany,Long> {



	ModelCompany findByEmail(String email);

}
