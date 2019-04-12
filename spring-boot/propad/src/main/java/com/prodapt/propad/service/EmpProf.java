package com.prodapt.propad.service;

import java.util.List;

import com.prodapt.propad.model.PropadEmpProfDetails;



public interface EmpProf {
	List<PropadEmpProfDetails> getAll();
	
	List<PropadEmpProfDetails> getOneRow(int emp_id);
	PropadEmpProfDetails save(PropadEmpProfDetails  ppd);
	


}
