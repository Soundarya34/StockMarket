package com.example.springMvcExample.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springMvcExample.model.Company;



public interface CompanyService {

	public boolean insertCompany(Company company) throws SQLException;

	public Company updateCompany(Company company);

	public List<Company> getCompanyList() throws SQLException;
}
