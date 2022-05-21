package com.fedebuchet.microservices.currencyexchangeservice.controllers;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fedebuchet.microservices.currencyexchangeservice.entity.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@GetMapping(value="/currency-exchange/from{from}/USD/to/{to}")
	public ResponseEntity<?> retrieveExchangeValue(@PathVariable(value="from")String from,@PathVariable(value="to")String to){
		return new ResponseEntity<>(new CurrencyExchange(1000L,from,to,BigDecimal.valueOf(50)),HttpStatus.OK);
	}
}
