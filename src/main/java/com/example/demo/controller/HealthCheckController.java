package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HealthCheckController {

	@GetMapping("/")
	public ResponseEntity healthCheck() {
		return new ResponseEntity("success", HttpStatus.OK);
	}
	@GetMapping("/health/check")
	public ResponseEntity healthCheck1() {
		return new ResponseEntity("success", HttpStatus.OK);
	}
	@GetMapping("favicon.ico") @ResponseBody
	public void returnNoFavicon() { }



}
