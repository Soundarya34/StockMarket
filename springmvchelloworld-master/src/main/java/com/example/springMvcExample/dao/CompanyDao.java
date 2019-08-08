package com.example.springMvcExample.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.springMvcExample.model.Company;



public interface CompanyDao {

	public boolean insertCompany(Company company) throws SQLException;

	public Company updateCompany(Company company);

	public List<Company> getCompanyList() throws SQLException;

}
