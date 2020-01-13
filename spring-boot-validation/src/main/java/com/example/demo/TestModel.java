package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class TestModel {
	
	@NotEmpty(message = "{valid.not-null}")
	private String name;

}
