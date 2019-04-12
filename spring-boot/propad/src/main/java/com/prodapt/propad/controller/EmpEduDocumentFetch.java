package com.prodapt.propad.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prodapt.propad.dto.EmployeeEduDTO;
import com.prodapt.propad.model.PropadEmpEduDetails;
import com.prodapt.propad.model.PropadEmpProfDetails;
import com.prodapt.propad.service.EmpEdu;


@RestController
@CrossOrigin("*")
@RequestMapping("/getemployeeedudetails")
public class EmpEduDocumentFetch {
	@Autowired
	EmpEdu empEdu;
	public EmpEduDocumentFetch(EmpEdu empEdu) {
		// TODO Auto-generated constructor stub
		this.empEdu = empEdu;
	}	
	@RequestMapping(value = "/get-edu-documents/{emp_id}", method = RequestMethod.GET)
	public List<PropadEmpEduDetails> getUsers(@PathVariable("emp_id") int emp_id) {
		System.out.println("in get");
		return this.empEdu.getOneRow(emp_id);
}
	
	
}
