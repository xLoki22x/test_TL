package com.example.mypkg.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
    private String departmentId;
	
    private String departmentName;
    
    private String orgCode;

    
    public  Department () {}

	public String getdepartmentId() {
		return this.departmentId;
	}

	public void setdepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getdepartmentName() {
		return this.departmentName;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getorgCode() {
		return this.orgCode;
	}

	public void setorgCode(String orgCode) {
		this.orgCode = orgCode;
	}
    
}
