package com.spring.data.jpa.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class EmployeeEntity {

	@Id
	@Column(name = "empno")
	private Long empNo;
	@Column(name = "empname")
	private String empName;
	@Column(name = "job")
	private String job;
	@Column(name = "comm")
	private Long comm;
	@Column(name = "sal")
	private Long salary;
	@Column(name = "mgr")
	private Long manager;
	@Column(name = "hiredate")
	private Date hireDate;
	@Column(name = "active")
	private Boolean active;
	@ManyToOne
	@JoinColumn(name = "deptno", referencedColumnName = "deptno")
	private DeptEntity deptEntity;

	public Long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Long getComm() {
		return comm;
	}

	public void setComm(Long comm) {
		this.comm = comm;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getManager() {
		return manager;
	}

	public void setManager(Long manager) {
		this.manager = manager;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public DeptEntity getDeptEntity() {
		return deptEntity;
	}

	public void setDeptEntity(DeptEntity deptEntity) {
		this.deptEntity = deptEntity;
	}

}
