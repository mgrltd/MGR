package com.mgr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

	@GetMapping("/")
	private String information() {
		return "Hi Hello welcome To MGR app 0.0.1";
	}
	
	@GetMapping("/contact")
	private String hello() {
		return "M.Ramachandra,mgr@gmail.com,7093419328";
	}
}
