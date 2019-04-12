package com.prodapt.propad.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.prodapt.propad.dto.EmpTechDTO;
import com.prodapt.propad.dto.EmployeePerDTO;
import com.prodapt.propad.model.PropadEmpPerDetails;
import com.prodapt.propad.service.EmpPer;

@RestController
@CrossOrigin("*")
@RequestMapping("/getper")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmpPerUpload {
	@Autowired
	EmpPer empPer;
	public EmpPerUpload(EmpPer empPer)
	{
		this.empPer = empPer;
	}
	
	@RequestMapping(value = "/upload-personal-document", method = RequestMethod.POST)
	public PropadEmpPerDetails uploadpersonaldocument(@RequestPart(required = false) Map<String, String> json, EmployeePerDTO empper, @RequestParam("aadhar") MultipartFile aadhar, @RequestParam("passport") MultipartFile passport,@RequestParam("pancard") MultipartFile pancard,@RequestParam("addressproof") MultipartFile addressproof ) throws IOException, SerialException, SQLException {
//		System.out.println("personal "+file.getOriginalFilename());
//		System.out.println(file.getBytes());
//		System.out.println(emptech.getEt_tech_cert1());
		System.out.println("hi");
		PropadEmpPerDetails pep = new PropadEmpPerDetails();
//
		pep.setEp_per_emp_id(empper.getEp_per_emp_id());
		pep.setEp_per_aadhar(aadhar.getBytes());
		pep.setEp_per_aadhar_text(empper.getEp_per_aadhar_text());
		pep.setEp_per_addressproof(addressproof.getBytes());
		pep.setEp_per_addressproof_text(empper.getEp_per_addressproof_text());
		pep.setEp_per_pan(pancard.getBytes());
		pep.setEp_per_pan_text(empper.getEp_per_pan_text());
		pep.setEp_per_pp(passport.getBytes());
		System.out.println(passport.getBytes());
		pep.setEp_per_pp_text(empper.getEp_per_pp_text());
		
		return this.empPer.save(pep) ;
	}

	
	

}









		
		
		
		
	








	
	
	
	













