package com.spring.data.jpa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.jpa.entity.DeptEntity;
import com.spring.data.jpa.entity.EmployeeEntity;
import com.spring.data.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeEntity findEmployeeById(Long empId) {
		return employeeRepository.findById(empId).get();
	}

	public List<EmployeeEntity> findByJob(String job) {
		return employeeRepository.findByJob(job);
	}

	public List<EmployeeEntity> findByEmpName(String empName) {
		return employeeRepository.findByEmpName(empName);
	}

	public List<EmployeeEntity> findBySal(Long salary) {
		return employeeRepository.findBySalary(salary);
	}

	public List<EmployeeEntity> findByDeptEntity(DeptEntity deptEntity) {
		return employeeRepository.findByDeptEntity(deptEntity);
	}

	public List<EmployeeEntity> findByManager(Long manager) {
		return employeeRepository.findByManager(manager);
	}

	public List<EmployeeEntity> findByHireDate(Date hireDate) {
		return employeeRepository.findByHireDate(hireDate);
	}

	public List<EmployeeEntity> findByEmpNameContaining(String name) {
		return employeeRepository.findByEmpNameContaining(name);
	}

	public List<EmployeeEntity> findByEmpNameStartingWith(String letter) {
		return employeeRepository.findByEmpNameStartingWith(letter);
	}

	public List<EmployeeEntity> findAllRecords() {
		return employeeRepository.findAllRecords();
	}

}
