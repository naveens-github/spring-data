package com.spring.data.jpa.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "/api1", produces = MediaType.TEXT_PLAIN_VALUE)
	public String method1() {
		return "Sample Spring data JPA";
	}

}
