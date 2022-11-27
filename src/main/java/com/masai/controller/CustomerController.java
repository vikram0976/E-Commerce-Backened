package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.service.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	@PostMapping("/register")
	public ResponseEntity<Customer> registerCustomer(@Valid @RequestBody Customer customer) throws CustomerException {
		Customer c = cs.registerCustomer(customer);
		return new ResponseEntity<Customer>(c,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<Customer> viewCustomer(@PathVariable("id") int customerId) throws CustomerException {
		Customer c=cs.viewCustomer(customerId);
		return new ResponseEntity<Customer>(c,HttpStatus.ACCEPTED);
	}
	
}
