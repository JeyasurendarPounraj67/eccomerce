package com.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Item;
import com.ecommerce.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@GetMapping
	public @ResponseBody List<Item> getAllFlights() {
		return customerService.getAllItems();
	}
	
	@GetMapping("/{flight-id}")
	public @ResponseBody List<Item> getFlightById(@PathVariable("flight-id") String flightId) {
		return customerService.getItemById(flightId);
	}
    
}
 