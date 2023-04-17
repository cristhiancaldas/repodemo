package com.app.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class BackendController {
	
	@GetMapping
	public String getDemo() {
		return "Microservice Demo 2023";
	}
	
}
