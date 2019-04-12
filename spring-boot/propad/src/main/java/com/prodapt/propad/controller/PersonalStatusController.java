package com.prodapt.propad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prodapt.propad.service.EmpPer;

public class PersonalStatusController {
	@Autowired
	EmpPer empPer;
	public PersonalStatusController(EmpPer empPer) {
		// TODO Auto-generated constructor stub
		this.empPer = empPer;
	}
	
	@RequestMapping(value = "/get-edu-status/{emp_id}", method = RequestMethod.GET)
	public Integer getedudocuments(@PathVariable("emp_id") int emp_id ) {
		return this.empPer.countnull(emp_id);
	}
	
}
