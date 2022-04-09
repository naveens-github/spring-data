package com.spring.data.jpa.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.entity.DeptEntity;
import com.spring.data.jpa.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	
	public List<EmployeeEntity> findByJob(String job);

	public List<EmployeeEntity> findByEmpName(String empName);

	public List<EmployeeEntity> findBySalary(Long salary);

	public List<EmployeeEntity> findByDeptEntity(DeptEntity deptEntity);

	public List<EmployeeEntity> findByManager(Long manager);

	public List<EmployeeEntity> findByHireDate(Date hireDate);

	public List<EmployeeEntity> findByEmpNameContaining(String name);

	public List<EmployeeEntity> findByEmpNameStartingWith(String letter);

	@Query(value = "select * from emp", nativeQuery = true)
	public List<EmployeeEntity> findAllRecords();

}
