package com.example.mypkg.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENT_DETAIL")
public class DepartmentDetail {

	@Id
    private String employeeId;
    
    private String departmentId;
    
    public DepartmentDetail() {}
    
    public String getemployeeId() {
		return this.employeeId;
	}

	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getdepartmentId() {
		return this.departmentId;
	}

	public void setdepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}
