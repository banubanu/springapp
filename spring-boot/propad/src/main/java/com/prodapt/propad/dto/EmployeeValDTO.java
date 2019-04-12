package com.prodapt.propad.dto;



	import java.sql.Date;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class EmployeeValDTO {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int ev_id;
		private int ev_emp_id;
		private Date ev_review_dt;
		private String ev_review_comments;
		public int getEv_id() {
			return ev_id;
		}
		public void setEv_id(int ev_id) {
			this.ev_id = ev_id;
		}
		public int getEv_emp_id() {
			return ev_emp_id;
		}
		public void setEv_emp_id(int ev_emp_id) {
			this.ev_emp_id = ev_emp_id;
		}
		public Date getEv_review_dt() {
			return ev_review_dt;
		}
		public void setEv_review_dt(Date ev_review_dt) {
			this.ev_review_dt = ev_review_dt;
		}
		public String getEv_review_comments() {
			return ev_review_comments;
		}
		public void setEv_review_comments(String ev_review_comments) {
			this.ev_review_comments = ev_review_comments;
		}
		
		
}
