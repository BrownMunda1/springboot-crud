package com.appointmentBooking.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	
	private LocalDate issueDate;
	private LocalDate appointmentDate;
	private String dealerName;
	private String custName;
	private int custContactno;
	private String custemail;
	
	public User(int appointmentId, LocalDate issueDate, LocalDate appointmentDate, String dealerName, String custName,
			int custContactno, String custemail) {
		super();
		this.appointmentId = appointmentId;
		this.issueDate = issueDate;
		this.appointmentDate = appointmentDate;
		this.dealerName = dealerName;
		this.custName = custName;
		this.custContactno = custContactno;
		this.custemail = custemail;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustContactno() {
		return custContactno;
	}
	public void setCustContactno(int custContactno) {
		this.custContactno = custContactno;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	
	
	@Override
	public String toString() {
		return "User [appointmentId=" + appointmentId + ", issueDate=" + issueDate + ", appointmentDate="
				+ appointmentDate + ", dealerName=" + dealerName + ", custName=" + custName + ", custContactno="
				+ custContactno + ", custemail=" + custemail + "]";
	}
	
	
}
