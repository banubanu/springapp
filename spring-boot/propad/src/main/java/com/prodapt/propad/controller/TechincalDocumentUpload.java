package com.prodapt.propad.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.prodapt.propad.dto.EmpTechDTO;
import com.prodapt.propad.model.PropadEmpTechDetails;
import com.prodapt.propad.service.EmpTech;

@RestController
@CrossOrigin("*")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RequestMapping("/uploadtechdocuments")
public class TechincalDocumentUpload {
		
		@Autowired
		EmpTech empTech;
		public TechincalDocumentUpload(EmpTech empTech) {
			// TODO Auto-generated constructor stub
			this.empTech = empTech;
		}
		
	
	
	@RequestMapping(value = "/upload-document", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public PropadEmpTechDetails uploaddocumentModel( @RequestPart(required = false) Map<String, String> json, EmpTechDTO emptech, @RequestParam("file") MultipartFile file, @RequestParam("file1") MultipartFile file1,@RequestParam("file2") MultipartFile file2,@RequestParam("file3") MultipartFile file3,@RequestParam("file4") MultipartFile file4) throws IOException, SerialException, SQLException {
		System.out.println("test"+file.getOriginalFilename());
		System.out.println(file.getBytes());
//		System.out.println(emptech.getEt_tech_cert1());
		
	PropadEmpTechDetails pet = new PropadEmpTechDetails();
//  pet.setEt_tech_cert1(((EmpTechDTO) file).getEt_tech_cert1());
//	pet.setEt_emp_id(et_emp_id);
	pet.setEt_emp_id(emptech.getEt_emp_id());
	pet.setEt_tech_cert1(file.getBytes());
		pet.setEt_tech_cert1_text(emptech.getEt_tech_cert1_text());
        pet.setEt_tech_cert2(file1.getBytes());
        pet.setEt_tech_cert2_text(emptech.getEt_tech_cert2_text());
        pet.setEt_tech_cert3(file2.getBytes());
        pet.setEt_tech_cert3_text(emptech.getEt_tech_cert3_text());
        pet.setEt_tech_cert4(file3.getBytes());
        pet.setEt_tech_cert4_text(emptech.getEt_tech_cert4_text());
        pet.setEt_tech_cert5(file4.getBytes());
        pet.setEt_tech_cert5_text(emptech.getEt_tech_cert5_text());
        pet.setEt_tech_comments(emptech.getEt_tech_comments());
		return this.empTech.save(pet) ;
	}
	}







	
	
	
	