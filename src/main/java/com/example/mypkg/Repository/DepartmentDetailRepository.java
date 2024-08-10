package com.example.mypkg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mypkg.model.DepartmentDetail;

@Repository
public interface DepartmentDetailRepository extends JpaRepository<DepartmentDetail, String> {

	@Query(value = "SELECT DD.* FROM  DEPARTMENT DMD\r\n"
			+ "inner join DEPARTMENT_DETAIL DD on DD .DEPARTMENT_ID = DMD.DEPARTMENT_ID\r\n"
			+ "where DMD.DEPARTMENT_ID = :id",nativeQuery = true)
	List<DepartmentDetail> findDEPARTMENTDETAIL(@Param("id") String id);
	
 
	
}

