package com.spring.data.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.data.jpa.entity.StudentEntity;
import com.spring.data.jpa.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentEntity findById(Long stdId) {
		return studentRepository.findById(stdId).get();
	}

	@Transactional
	public StudentEntity saveStudent(StudentEntity input) {
		StudentEntity result = studentRepository.save(input);
		return result;

	}

}
