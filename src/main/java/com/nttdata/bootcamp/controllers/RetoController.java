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
	
	@GetMapping("/value1")
	public String value1() {
		return this.value1;
	}
}
