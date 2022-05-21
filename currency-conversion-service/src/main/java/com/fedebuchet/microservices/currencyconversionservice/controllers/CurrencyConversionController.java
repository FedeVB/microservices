package com.fedebuchet.microservices.currencyconversionservice.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fedebuchet.microservices.currencyconversionservice.entity.CurrencyConversion;
import com.fedebuchet.microservices.currencyconversionservice.proxy.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	@GetMapping(value = "/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<?> calculateCurrencyConversion(@PathVariable(value = "from") String from,
			@PathVariable(value = "to") String to, @PathVariable(value = "quantity") BigDecimal quantity) {
		
		CurrencyConversion currencyConversion=currencyExchangeProxy.retrieveExchangeValue(from, to);
		
		return new ResponseEntity<>(new CurrencyConversion(currencyConversion.getId(), from, to,
				quantity,quantity.multiply(currencyConversion.getConversionMultiple()), currencyConversion.getConversionMultiple()),
				HttpStatus.OK);
	}
}
