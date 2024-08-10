package com.example.mypkg.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAIL")
public class EmployeeDetail {

	@Id
	private String employeeId;
	
	private String employeeName;
	private Date birthdate;
	private String mobileNo;
	private String email;
	private String address;
	private Date startDate;
	private Date terminateDate;


	public EmployeeDetail() {}
	
	
	public String getemployeeId() {
		return this.employeeId;
	}

	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getemployeeName() {
		return this.employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Date getbirthdate() {
		return this.birthdate;
	}

	public void setbirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getmobileNo() {
		return this.mobileNo;
	}

	public void setmobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getemail() {
		return this.email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
	public String getaddress() {
		return this.address;
	}

	public void setaddress(String address) {
		this.address = address;
	}
	
	public Date getstartDate() {
		return this.startDate;
	}

	public void setstartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getterminateDate() {
		return this.terminateDate;
	}

	public void setterminateDate(Date terminateDate) {
		this.terminateDate = terminateDate;
	}
	
}
