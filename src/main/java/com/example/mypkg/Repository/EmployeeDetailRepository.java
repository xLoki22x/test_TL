package com.example.mypkg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mypkg.model.EmployeeDetail;

@Repository
public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, String>{

	
	@Query(value = "SELECT * FROM EMPLOYEE_DETAIL where EMPLOYEE_ID = :id",nativeQuery = true)
	EmployeeDetail findByid(@Param("id") String id);
	
	@Query(value = "SELECT ED.* FROM DEPARTMENT_HEAD DH\r\n"
			+ "inner join EMPLOYEE_DETAIL ED on ED.EMPLOYEE_ID = DH.EMPLOYEE_ID \r\n"
			+ "where DH.DEPARTMENT_ID = :id",nativeQuery = true)
	EmployeeDetail findByDEPARTMENTIDONE(@Param("id") String id);
	
	
	@Query(value = "SELECT EPD.* FROM  DEPARTMENT_DETAIL DMD\r\n"
			+ "inner join EMPLOYEE_DETAIL EPD on DMD.EMPLOYEE_ID = EPD.EMPLOYEE_ID \r\n"
			+ "where DMD.DEPARTMENT_ID = :DEPARTMENTID",nativeQuery = true)
	List<EmployeeDetail> findByDEPARTMENTID(@Param("DEPARTMENTID") String DEPARTMENTID);
}
