package com.fedebuchet.microservices.currencyconversionservice.controllers;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fedebuchet.microservices.currencyconversionservice.entity.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@GetMapping(value = "/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<?> calculateCurrencyConversion(@PathVariable(value = "from") String from,
			@PathVariable(value = "to") String to, @PathVariable(value = "quantity") BigDecimal quantity) {
		return new ResponseEntity<>(new CurrencyConversion(1001L, from, to, quantity, BigDecimal.ONE, BigDecimal.ONE),
				HttpStatus.OK);
	}
}
