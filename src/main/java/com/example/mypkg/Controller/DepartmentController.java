package com.example.mypkg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mypkg.model.Department;
import com.example.mypkg.model.EmployeeDetail;

import jakarta.servlet.http.HttpServletResponse;

import com.example.mypkg.DTO.EmployeeDTO;
import com.example.mypkg.Service.DepartmentService;
import com.example.mypkg.Service.EmployeeService;

@RestController
@RequestMapping("/api/Department")
public class DepartmentController {

	private EmployeeService EmployeeService;

	
    @Autowired
    public DepartmentController(EmployeeService EmployeeService) {
        this.EmployeeService = EmployeeService;
    }

    
    @GetMapping(value = "/{id}")
    public List<EmployeeDetail>  getById(@PathVariable("id") String id) {
    	return EmployeeService.findEmployee(id); 
    }
    
    @GetMapping(value = "/member/{id}")
    public EmployeeDTO getByIdmember(@PathVariable("id") String id) {
    	return EmployeeService.findmember(id); 
    }
    
    @GetMapping(value = "/allmember")
    public Map<String, String>  getByall() {
    	return EmployeeService.findall(); 
    }
    
}
