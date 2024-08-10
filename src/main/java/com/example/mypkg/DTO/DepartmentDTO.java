package com.example.mypkg.DTO;

public class DepartmentDTO {
    private String departmentId;
    private String departmentName;
    private String managerName;
    private String orgCode;

    public DepartmentDTO(){}
    
    public DepartmentDTO(String departmentId, String departmentName, String managerName, String orgCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerName = managerName;
        this.orgCode = orgCode;
    }
}
