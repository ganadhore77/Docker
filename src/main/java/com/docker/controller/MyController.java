package com.docker.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/welcometodocker/{name}")
	public ResponseEntity<String> welcometodocker(@PathVariable String name) {
		String msg = "Welcome to Docker ";
		LocalTime time = LocalTime.now();
		if (name.isEmpty()) {
			return new ResponseEntity<String>(msg+ " Time : "+time, HttpStatus.OK);
		} else {
			msg += name;
		
			return new ResponseEntity<String>(msg+ " Time : "+time, HttpStatus.OK);
		}

	}
}