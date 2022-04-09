package com.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

//	public List<StudentEntity> findByName(String stdName);
//
//	public List<StudentEntity> findByClgname(String stdClgName);

}
