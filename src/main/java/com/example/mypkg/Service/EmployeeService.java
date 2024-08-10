package com.example.mypkg.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mypkg.DTO.DepartmentDTO;
import com.example.mypkg.DTO.EmployeeDTO;
import com.example.mypkg.Repository.DepartmentDetailRepository;
import com.example.mypkg.Repository.DepartmentHeadRepository;
import com.example.mypkg.Repository.DepartmentRepository;
import com.example.mypkg.Repository.EmployeeDetailRepository;
import com.example.mypkg.model.Department;
import com.example.mypkg.model.DepartmentDetail;
import com.example.mypkg.model.DepartmentHead;
import com.example.mypkg.model.EmployeeDetail;

@Service
public class EmployeeService {

    private EmployeeDetailRepository employeeDetailRepository;
    @Autowired
    private DepartmentHeadRepository departmentHeadRepository;
    @Autowired
    private DepartmentDetailRepository departmentDetailRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    
    @Autowired
    public EmployeeService(EmployeeDetailRepository employeeDetailRepository) {
        this.employeeDetailRepository = employeeDetailRepository;
    }
    

    public List<EmployeeDetail> findEmployee(String id) {
    	List<EmployeeDetail> EmployeeDetail = employeeDetailRepository.findByDEPARTMENTID(id);
    	return EmployeeDetail;
    }

    
    public EmployeeDTO findmember(String id) {
    	EmployeeDTO employee = new EmployeeDTO();
    	EmployeeDetail employeeDetail = employeeDetailRepository.findByid(id);
    	if(employeeDetail != null) {
    	employee.setEmployeeId(employeeDetail.getemployeeId());
    	employee.setEmployeeName(employeeDetail.getemployeeName());
    	employee.setMobileNo(employeeDetail.getmobileNo());
    	employee.setStartDate(employeeDetail.getstartDate());
    	DepartmentHead departmentHead = departmentHeadRepository.findByemployeeid(employeeDetail.getemployeeId());
    	Department Department = departmentRepository.findByid(departmentHead.getdepartmentId());
    	employee.setDepartmentName(Department.getdepartmentName());
    	List<EmployeeDetail> member = new ArrayList<EmployeeDetail>();
    	List<DepartmentDetail> departmentDetail = departmentDetailRepository.findDEPARTMENTDETAIL(departmentHead.getdepartmentId());
    	for(DepartmentDetail list :departmentDetail) {
    			if(list.getemployeeId()!= id) {
    		    	EmployeeDetail employeelist = employeeDetailRepository.findByid(id);
    		    	member.add(employeelist);
    			}
    		}
    	employee.setmember(member);
    	}
    	return employee;
    }
    
    public Map<String, String> findall() {
    	List<Department> Department = departmentRepository.findAll();
        Map<String, String> departmentMap = new HashMap<String, String>();
    	EmployeeDetail member = new EmployeeDetail() ;

        for(Department department:Department) {
        	String	parentId = department.getorgCode();
        	
        	if(parentId != "") {
        		if(!departmentMap.containsValue(department.getdepartmentId())) {
        		List<Department> listDepartment = departmentRepository.findByORG_CODE(parentId);
        		for(Department list:listDepartment) {
   		    	    member = employeeDetailRepository.findByDEPARTMENTIDONE(department.getdepartmentId());
            		departmentMap.put(list.getdepartmentId(),list.getdepartmentName()+member.getemployeeName());
            		
            		List<Department> listDepartment2 = departmentRepository.findByORG_CODE(list.getdepartmentId());
            		if(listDepartment2.size()>0) {
            			for(Department list2:listDepartment2) {
            				 member = employeeDetailRepository.findByDEPARTMENTIDONE(list2.getdepartmentId());
                     		departmentMap.put(list2.getdepartmentId(),list2.getdepartmentName()+member.getemployeeName());
            			}
            		}
        		}
        	}
        	}else {
		    	 member = employeeDetailRepository.findByDEPARTMENTIDONE(department.getdepartmentId());
        		departmentMap.put(department.getdepartmentId(),department.getdepartmentName()+ member.getemployeeName());
        	}
        	
        }

    	return departmentMap;
    }
    
    
    
}
