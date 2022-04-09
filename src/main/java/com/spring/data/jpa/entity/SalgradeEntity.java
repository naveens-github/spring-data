package com.spring.data.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salgrade")
public class SalgradeEntity {

	@Id
	@Column(name = "hisal")
	private Long hisal;
	@Column(name = "losal")
	private Long losal;
	@Column(name = "grade")
	private Long grade;

	public Long getHisal() {
		return hisal;
	}

	public void setHisal(Long hisal) {
		this.hisal = hisal;
	}

	public Long getLosal() {
		return losal;
	}

	public void setLosal(Long losal) {
		this.losal = losal;
	}

	public Long getGrade() {
		return grade;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}

}
