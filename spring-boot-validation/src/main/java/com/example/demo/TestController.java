package com.example.demo;

import javax.validation.Valid;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private final MessageSource messageSource;
	
	public TestController(final MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@GetMapping("/test")
	public void testValidMsg(@Valid TestModel model) {
		this.messageSource.getMessage("valid.not-null", null, LocaleContextHolder.getLocale());
	}
	
}
