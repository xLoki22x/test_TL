package com.example.mypkg.DTO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.example.mypkg.model.EmployeeDetail;

public class EmployeeDTO {
    private String employeeId;
    private String employeeName;
    private String mobileNo;
    private Date startDate;
    private String departmentName;
	private List<EmployeeDetail> member;

   public EmployeeDTO(){}
	
   public EmployeeDTO(String employeeId,String employeeName,String mobileNo,Date startDate,String departmentName){
	   this.employeeId = employeeId;
	   this.employeeName = employeeName;
	   this.mobileNo = mobileNo;
	   this.startDate = startDate;
	   this.departmentName = departmentName;
   }

   public String getEmployeeId() {
       return employeeId;
   }

   public void setEmployeeId(String employeeId) {
       this.employeeId = employeeId;
   }

   public String getEmployeeName() {
       return employeeName;
   }

   public void setEmployeeName(String employeeName) {
       this.employeeName = employeeName;
   }

   public String getMobileNo() {
       return mobileNo;
   }

   public void setMobileNo(String mobileNo) {
       this.mobileNo = mobileNo;
   }

   public Date getStartDate() {
       return startDate;
   }

   public void setStartDate(Date startDate) {
       this.startDate = startDate;
   }

   public String getDepartmentName() {
       return departmentName;
   }

   public void setDepartmentName(String departmentName) {
       this.departmentName = departmentName;
   }
   
   public List<EmployeeDetail> getmember() {
       return member;
   }

   public  List<EmployeeDetail> setmember(List<EmployeeDetail> member) {
	   if(member == null) {
		   member = new ArrayList<EmployeeDetail>();
	   }
	return this.member = member;
   }

}
