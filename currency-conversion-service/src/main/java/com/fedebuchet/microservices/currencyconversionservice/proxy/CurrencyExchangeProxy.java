package com.fedebuchet.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fedebuchet.microservices.currencyconversionservice.entity.CurrencyConversion;

//Nombre del servicio y ruta del mismo al que queremos llamar
@FeignClient(name="currency-exchange",url = "localhost:8010")
public interface CurrencyExchangeProxy {

	@GetMapping(value="/currency-exchange/from{from}/USD/to/{to}")
	public CurrencyConversion retrieveExchangeValue
	(@PathVariable(value="from")String from,
	@PathVariable(value="to")String to);

	
}