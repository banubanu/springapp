package com.prodapt.propad.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prodapt.propad.model.PropadEmpProfDetails;

@Repository
public interface EmpProfRepository extends JpaRepository<PropadEmpProfDetails, Integer> {
	@Query(value = "SELECT ((CASE WHEN et_tech_cert1 IS NULL THEN 1 ELSE 0 END)+ (CASE WHEN et_tech_cert2 IS NULL THEN 1 ELSE 0 END)+(CASE WHEN et_tech_cert3 IS NULL THEN 1 ELSE 0 END)+(CASE WHEN et_tech_cert4 IS NULL THEN 1 ELSE 0 END)+(CASE WHEN et_tech_cert5 IS NULL THEN 1 ELSE 0 END)) AS sum_of_nulls FROM propad_emp_tech_details where et_emp_id=?1", nativeQuery = true)
	public Integer countnull(Integer et_emp_id);
	
	@Query(value="select * from propad_emp_prof_details where et_emp_id=?1", nativeQuery = true)
	public List<PropadEmpProfDetails> getOneRow(int emp_id);

}

