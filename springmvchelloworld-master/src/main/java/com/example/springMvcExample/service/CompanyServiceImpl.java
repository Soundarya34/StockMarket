package com.example.springMvcExample.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMvcExample.dao.CompanyDao;
import com.example.springMvcExample.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	@Override
	public boolean insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.insertCompany(company);
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.getCompanyList();
	}
}
