package com.spring.data.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {

	@Id
	@Column(name = "id")
	private Long stdId;
	@Column(name = "name")
	private String stdName;
	@Column(name = "clgname")
	private String stdClgName;

	public Long getStdId() {
		return stdId;
	}

	public void setStdId(Long stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdClgName() {
		return stdClgName;
	}

	public void setStdClgName(String stdClgName) {
		this.stdClgName = stdClgName;
	}

}
