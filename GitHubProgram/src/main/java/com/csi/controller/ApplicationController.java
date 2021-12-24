package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vikas")
public class ApplicationController {

	@GetMapping()
	public String sayHello()
	{
		return "Welcome to IT Industry";
	}
	@GetMapping("/services")
	public String sayCapgemini()
	{
		return "APPLICATION DEVELOPMENT | SOFTWARE TESTING";
	}
	@GetMapping("/address")
	public String sayCapgeminiAddress()
	{
		return "BANER | PUNE";
	}
}
