package com.prodapt.propad.model;

import java.util.Arrays;
import java.sql.Blob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "propad_emp_tech_details")
public class PropadEmpTechDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int et_id;
	private int et_emp_id;
	private byte[] et_tech_cert1;
	private String et_tech_cert1_text;
	private byte[] et_tech_cert2;
	private String et_tech_cert2_text;
	private byte[] et_tech_cert3;
	private String et_tech_cert3_text;
	private byte[] et_tech_cert4;
	private String et_tech_cert4_text;
	private byte[] et_tech_cert5;
	private String et_tech_cert5_text;
	private String et_tech_comments;
	
	
	
	public String getEt_tech_comments() {
		return et_tech_comments;
	}
	public void setEt_tech_comments(String et_tech_comments) {
		this.et_tech_comments = et_tech_comments;
	}
	public int getEt_id() {
		return et_id;
	}
	public void setEt_id(int et_id) {
		this.et_id = et_id;
	}
	public int getEt_emp_id() {
		return et_emp_id;
	}
	public void setEt_emp_id(int et_emp_id) {
		this.et_emp_id = et_emp_id;
	}
	public byte[] getEt_tech_cert1() {
		return et_tech_cert1;
	}
	public void setEt_tech_cert1(byte[] bs) {
		this.et_tech_cert1 = bs;
	}
	public String getEt_tech_cert1_text() {
		return et_tech_cert1_text;
	}
	public void setEt_tech_cert1_text(String bs) {
		this.et_tech_cert1_text = bs;
	}
	public byte[] getEt_tech_cert2() {
		return et_tech_cert2;
	}
	public void setEt_tech_cert2(byte[] bs) {
		this.et_tech_cert2 = bs;
	}
	public String getEt_tech_cert2_text() {
		return et_tech_cert2_text;
	}
	public void setEt_tech_cert2_text(String et_tech_cert2_text) {
		this.et_tech_cert2_text = et_tech_cert2_text;
	}
	public byte[] getEt_tech_cert3() {
		return et_tech_cert3;
	}
	public void setEt_tech_cert3(byte[] bs) {
		this.et_tech_cert3 = bs;
	}
	public String getEt_tech_cert3_text() {
		return et_tech_cert3_text;
	}
	public void setEt_tech_cert3_text(String et_tech_cert3_text) {
		this.et_tech_cert3_text = et_tech_cert3_text;
	}
	public byte[] getEt_tech_cert4() {
		return et_tech_cert4;
	}
	public void setEt_tech_cert4(byte[] bs) {
		this.et_tech_cert4 = bs;
	}
	public String getEt_tech_cert4_text() {
		return et_tech_cert4_text;
	}
	public void setEt_tech_cert4_text(String et_tech_cert4_text) {
		this.et_tech_cert4_text = et_tech_cert4_text;
	}
	public byte[] getEt_tech_cert5() {
		return et_tech_cert5;
	}
	public void setEt_tech_cert5(byte[] bs) {
		this.et_tech_cert5 = bs;
	}
	public String getEt_tech_cert5_text() {
		return et_tech_cert5_text;
	}
	public void setEt_tech_cert5_text(String et_tech_cert5_text) {
		this.et_tech_cert5_text = et_tech_cert5_text;
	}
	@Override
	public String toString() {
		return "PropadEmpTechDetails [et_id=" + et_id + ", et_emp_id=" + et_emp_id + ", et_tech_cert1="
				+ Arrays.toString(et_tech_cert1) + ", et_tech_cert1_text=" + et_tech_cert1_text + ", et_tech_cert2="
				+ Arrays.toString(et_tech_cert2) + ", et_tech_cert2_text=" + et_tech_cert2_text + ", et_tech_cert3="
				+ Arrays.toString(et_tech_cert3) + ", et_tech_cert3_text=" + et_tech_cert3_text + ", et_tech_cert4="
				+ Arrays.toString(et_tech_cert4) + ", et_tech_cert4_text=" + et_tech_cert4_text + ", et_tech_cert5="
				+ Arrays.toString(et_tech_cert5) + ", et_tech_cert5_text=" + et_tech_cert5_text + ", et_tech_comments="
				+ et_tech_comments + "]";
	}
	}
