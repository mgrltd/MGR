package com.mgr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mgr")
public class AppController {

	@GetMapping("/")
	private String information() {
		return "MGR app 0.0.1";
	}
}
