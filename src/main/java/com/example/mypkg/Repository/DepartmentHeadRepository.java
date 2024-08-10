package com.example.mypkg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mypkg.model.DepartmentHead;

@Repository
public interface DepartmentHeadRepository extends JpaRepository<DepartmentHead, String> {

	
	@Query(value = "SELECT * FROM DEPARTMENT_HEAD where EMPLOYEE_ID = :mid" ,nativeQuery = true)
	DepartmentHead findByemployeeid(@Param("mid") String mid);
	
}
