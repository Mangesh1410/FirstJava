package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(path = "/welcome")
	public String getMessage() {

		return "Welcome  To Java.";
	}

	@RequestMapping(path = "/mobinext")
	public String getWelcomeToMN() {

		return "<h2>Welcome  To MobiNext Tech.</h2>";
	}
}
