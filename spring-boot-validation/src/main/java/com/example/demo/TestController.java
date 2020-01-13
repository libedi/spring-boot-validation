package com.example.demo;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public void testValidMsg(@Valid TestModel model) {
		
	}
	
}
