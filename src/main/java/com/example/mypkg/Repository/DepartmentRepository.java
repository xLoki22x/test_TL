package com.example.mypkg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mypkg.model.Department;
import com.example.mypkg.model.DepartmentDetail;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
	
	
	@Query(value = "SELECT D. * FROM  DEPARTMENT DMD\r\n"
			+ "inner join DEPARTMENT_DETAIL D on D .DEPARTMENT_ID = DMD.DEPARTMENT_ID\r\n"
			+ "where DMD.DEPARTMENT_ID = :DEPARTMENTID;",nativeQuery = true)
	List<DepartmentDetail> findmember(@Param("DEPARTMENTID") String DEPARTMENTID);
	
	@Query(value = "SELECT * FROM DEPARTMENT where DEPARTMENT_ID = :id",nativeQuery = true)
	Department findByid(@Param("id") String id);

	@Query(value = "SELECT * FROM DEPARTMENT where ORG_CODE = :id",nativeQuery = true)
	List<Department> findByORG_CODE(@Param("id") String id);
	
}
