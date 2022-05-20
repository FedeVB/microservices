package com.fedebuchet.microservices.limitsservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fedebuchet.microservices.limitsservice.entity.Limit;

@RestController
public class LimitsController {

	@GetMapping(value="/limits")
	public ResponseEntity<?> getAll(){
		Limit limit=new Limit(1,9);
		return new ResponseEntity<>(limit,HttpStatus.OK);
	}
}
