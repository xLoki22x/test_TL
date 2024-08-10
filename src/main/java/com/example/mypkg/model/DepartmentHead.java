package com.example.mypkg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENT_HEAD")
public class DepartmentHead {
	
	@Id
	private String departmentId;
	
	private String employeeId;

	public DepartmentHead() {}
	
	public String getdepartmentId() {
		return this.departmentId;
	}

	public void setdepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getemployeeId() {
		return this.employeeId;
	}

	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}
