package com.spring.data.jpa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.jpa.entity.DeptEntity;
import com.spring.data.jpa.entity.EmployeeEntity;
import com.spring.data.jpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/findEmployeeById/{empNo}")
	public EmployeeEntity findEmployeeById(@PathVariable(name = "empNo") Long empNo) {
		return employeeService.findEmployeeById(empNo);
	}

	@GetMapping(value = "/findByJob/{job}")
	public List<EmployeeEntity> findByJob(@PathVariable(name = "job") String job) {
		return employeeService.findByJob(job);
	}

	@GetMapping(value = "/findByEmpName/{empName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeEntity> findByEmpName(@PathVariable(name = "empName") String empName) {
		return employeeService.findByEmpName(empName);
	}

	@GetMapping(value= "/findBySal/{salary}")
	public List<EmployeeEntity> findBySal(@PathVariable(name = "salary") Long salary) {
		return employeeService.findBySal(salary);
	}

	@GetMapping(value = "/findByDeptEntity/{deptEntity}")
	public List<EmployeeEntity> findByDeptEntity(@PathVariable(name = "deptEntity") DeptEntity deptEntity) {
		return employeeService.findByDeptEntity(deptEntity);
	}

	@GetMapping(value = "/findByManager/{manager}")
	public List<EmployeeEntity> findByManager(@PathVariable(name = "manager") Long manager) {
		return employeeService.findByManager(manager);
	}

	@GetMapping(value = "/findByHireDate/{hireDate}")
	public List<EmployeeEntity> findByHireDate(
			@PathVariable(name = "hireDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date hireDate) {
		return employeeService.findByHireDate(hireDate);
	}

	@GetMapping(value = "/findByEmpNameContaining/{name}")
	public List<EmployeeEntity> findByEmpNameContaining(@PathVariable(name = "name") String name) {
		return employeeService.findByEmpNameContaining(name);
	}

	@GetMapping(value = "/findByEmpNameStartingWith/{letter}")
	public List<EmployeeEntity> findByEmpNameStartingWith(@PathVariable(name = "letter") String letter) {
		return employeeService.findByEmpNameStartingWith(letter);
	}

	@GetMapping(value = "/findAllRecords")
	public List<EmployeeEntity> findAllRecords() {
		return employeeService.findAllRecords();
	}

}
