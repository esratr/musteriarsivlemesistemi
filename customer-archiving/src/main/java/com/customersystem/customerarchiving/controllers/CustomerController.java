package com.customersystem.customerarchiving.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customersystem.customerarchiving.models.Customer;
import com.customersystem.customerarchiving.services.abstracts.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAll(){
		return this.customerService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Customer customer){
		 this.customerService.add(customer);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Customer customer){
		
	 this.customerService.update(customer);
	}

	@PostMapping("/delete/{id}")
	public void delete(@RequestParam("id") int id){
		 this.customerService.delete(id);
	}
	
	@GetMapping("/getbyid/{id}")
	public Customer getById(@RequestParam("id") int id){
		return this.customerService.getById(id);
	}
}
