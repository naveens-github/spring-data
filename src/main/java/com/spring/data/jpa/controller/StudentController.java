package com.spring.data.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.jpa.entity.StudentEntity;
import com.spring.data.jpa.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/findByStudentId/{stdId}")
	public StudentEntity findById(@PathVariable(name = "stdId") Long stdId) {
		return studentService.findById(stdId);
	}

	@PostMapping(value = "/saveStudent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentEntity saveStudent(@RequestBody StudentEntity input) {
		return studentService.saveStudent(input);
	}

}