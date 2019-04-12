package com.prodapt.propad.dto;



	import java.sql.Blob;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	
	public class EmployeePerDTO {
		
		
		private int eper_id;
		private int ep_per_emp_id;
		private Blob ep_per_addressproof;
		private String ep_per_addressproof_text;
		private Blob ep_per_pp;
		private String ep_per_pp_text;
		private Blob ep_per_pan;
		private String ep_per_pan_text;
		private Blob ep_per_aadhar;
		private String ep_per_aadhar_text;
		
		public int getEper_id() {
			return eper_id;
		}
		public void setEper_id(int eper_id) {
			this.eper_id = eper_id;
		}
		public int getEp_per_emp_id() {
			return ep_per_emp_id;
		}
		public void setEp_per_emp_id(int ep_per_emp_id) {
			this.ep_per_emp_id = ep_per_emp_id;
		}
		public Blob getEp_per_addressproof() {
			return ep_per_addressproof;
		}
		public void setEp_per_addressproof(Blob ep_per_addressproof) {
			this.ep_per_addressproof = ep_per_addressproof;
		}
		public String getEp_per_addressproof_text() {
			return ep_per_addressproof_text;
		}
		public void setEp_per_addressproof_text(String ep_per_addressproof_text) {
			this.ep_per_addressproof_text = ep_per_addressproof_text;
		}
		public Blob getEp_per_pp() {
			return ep_per_pp;
		}
		public void setEp_per_pp(Blob ep_per_pp) {
			this.ep_per_pp = ep_per_pp;
		}
		public String getEp_per_pp_text() {
			return ep_per_pp_text;
		}
		public void setEp_per_pp_text(String ep_per_pp_text) {
			this.ep_per_pp_text = ep_per_pp_text;
		}
		public Blob getEp_per_pan() {
			return ep_per_pan;
		}
		public void setEp_per_pan(Blob ep_per_pan) {
			this.ep_per_pan = ep_per_pan;
		}
		public String getEp_per_pan_text() {
			return ep_per_pan_text;
		}
		public void setEp_per_pan_text(String ep_per_pan_text) {
			this.ep_per_pan_text = ep_per_pan_text;
		}
		public Blob getEp_per_aadhar() {
			return ep_per_aadhar;
		}
		public void setEp_per_aadhar(Blob ep_per_aadhar) {
			this.ep_per_aadhar = ep_per_aadhar;
		}
		public String getEp_per_aadhar_text() {
			return ep_per_aadhar_text;
		}
		public void setEp_per_aadhar_text(String ep_per_aadhar_text) {
			this.ep_per_aadhar_text = ep_per_aadhar_text;
		}
		
		
}
