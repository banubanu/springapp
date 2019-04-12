package com.prodapt.propad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prodapt.propad.service.EmpEdu;

public class EduStatusController {

	@Autowired
	EmpEdu empEdu;
	public EduStatusController(EmpEdu empEdu) {
		// TODO Auto-generated constructor stub
		this.empEdu = empEdu;
	}	
	
	@RequestMapping(value = "/get-edu-status/{emp_id}", method = RequestMethod.GET)
	public Integer getedudocuments(@PathVariable("emp_id") int emp_id ) {
		return this.empEdu.countnull(emp_id);
	}
	
}
