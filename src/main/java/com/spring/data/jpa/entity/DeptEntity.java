package com.spring.data.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class DeptEntity {

	@Id
	@Column(name = "deptno")
	private Long deptNo;
	@Column(name = "dname")
	private String dName;
	@Column(name = "loc")
	private String loc;

	public Long getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
