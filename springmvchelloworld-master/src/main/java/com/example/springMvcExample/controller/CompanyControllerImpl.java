package com.example.springMvcExample.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springMvcExample.model.Company;
import com.example.springMvcExample.service.CompanyService;
import com.example.springMvcExample.service.CompanyServiceImpl;

@Controller
public class CompanyControllerImpl implements CompanyController {

	@Autowired
	private CompanyService companyService;

	@Override
	public boolean insertCompany(Company company) throws SQLException {
		return companyService.insertCompany(company);

	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(path = "/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList", companyService.getCompanyList());
		return mv;
	}

}