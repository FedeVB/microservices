package com.fedebuchet.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fedebuchet.microservices.currencyexchangeservice.entity.CurrencyExchange;
import com.fedebuchet.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

@SpringBootApplication
public class CurrencyExchangeServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	@Override
	public void run(String... args) throws Exception {
//		currencyExchangeRepository.save(new CurrencyExchange(1001L,"USD","INR",new BigDecimal(65)));
//		currencyExchangeRepository.save(new CurrencyExchange(1002L,"EUR","INR",new BigDecimal(75)));
//		currencyExchangeRepository.save(new CurrencyExchange(1003L,"AUD","INR",new BigDecimal(25)));
//		currencyExchangeRepository.findAll().forEach(c-> System.out.println(c.getId()));
	}

}
