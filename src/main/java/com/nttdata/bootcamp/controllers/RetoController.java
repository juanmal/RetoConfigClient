package com.nttdata.bootcamp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RetoController {
	
	@Value("${some.value1}")
	private String value1;

	@Value("${some.value2}")
	private String value2;

	@Value("${some.value3}")
	private String value3;

	@Value("${some.value4}")
	private String value4;

	@Value("${some.value5}")
	private String value5;
	
	@GetMapping("/values")
	public String values() {
		String cad = "Variable1: " + this.value1 
				+ "\nVariable2: " + this.value2
				+ "\nVariable3: " + this.value3
				+ "\nVariable4: " + this.value4
				+ "\nVariable5: " + this.value5;
		return cad;
	}
}
