package com.prodapt.propad.dto;



	import java.sql.Blob;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class EmployeeProfDTO {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int ep_id;
		private int ep_emp_id;
		private Blob ep_service_cert1;
		private String ep_service_cert1_text;
		private Blob ep_service_cert2;
		private String ep_service_cert2_text;
		private Blob ep_service_cert3;
		private String ep_service_cert3_text;
		private Blob ep_payslip1;
		private String ep_payslip1_text;
		private Blob ep_payslip2;
		private String ep_payslip2_text;
		private Blob ep_payslip3;
		private String ep_payslip3_text;
		public int getEp_id() {
			return ep_id;
		}
		public void setEp_id(int ep_id) {
			this.ep_id = ep_id;
		}
		public int getEp_emp_id() {
			return ep_emp_id;
		}
		public void setEp_emp_id(int ep_emp_id) {
			this.ep_emp_id = ep_emp_id;
		}
		public Blob getEp_service_cert1() {
			return ep_service_cert1;
		}
		public void setEp_service_cert1(Blob ep_service_cert1) {
			this.ep_service_cert1 = ep_service_cert1;
		}
		public String getEp_service_cert1_text() {
			return ep_service_cert1_text;
		}
		public void setEp_service_cert1_text(String ep_service_cert1_text) {
			this.ep_service_cert1_text = ep_service_cert1_text;
		}
		public Blob getEp_service_cert2() {
			return ep_service_cert2;
		}
		public void setEp_service_cert2(Blob ep_service_cert2) {
			this.ep_service_cert2 = ep_service_cert2;
		}
		public String getEp_service_cert2_text() {
			return ep_service_cert2_text;
		}
		public void setEp_service_cert2_text(String ep_service_cert2_text) {
			this.ep_service_cert2_text = ep_service_cert2_text;
		}
		public Blob getEp_service_cert3() {
			return ep_service_cert3;
		}
		public void setEp_service_cert3(Blob ep_service_cert3) {
			this.ep_service_cert3 = ep_service_cert3;
		}
		public String getEp_service_cert3_text() {
			return ep_service_cert3_text;
		}
		public void setEp_service_cert3_text(String ep_service_cert3_text) {
			this.ep_service_cert3_text = ep_service_cert3_text;
		}
		public Blob getEp_payslip1() {
			return ep_payslip1;
		}
		public void setEp_payslip1(Blob ep_payslip1) {
			this.ep_payslip1 = ep_payslip1;
		}
		public String getEp_payslip1_text() {
			return ep_payslip1_text;
		}
		public void setEp_payslip1_text(String ep_payslip1_text) {
			this.ep_payslip1_text = ep_payslip1_text;
		}
		public Blob getEp_payslip2() {
			return ep_payslip2;
		}
		public void setEp_payslip2(Blob ep_payslip2) {
			this.ep_payslip2 = ep_payslip2;
		}
		public String getEp_payslip2_text() {
			return ep_payslip2_text;
		}
		public void setEp_payslip2_text(String ep_payslip2_text) {
			this.ep_payslip2_text = ep_payslip2_text;
		}
		public Blob getEp_payslip3() {
			return ep_payslip3;
		}
		public void setEp_payslip3(Blob ep_payslip3) {
			this.ep_payslip3 = ep_payslip3;
		}
		public String getEp_payslip3_text() {
			return ep_payslip3_text;
		}
		public void setEp_payslip3_text(String ep_payslip3_text) {
			this.ep_payslip3_text = ep_payslip3_text;
		}
		
		
}
