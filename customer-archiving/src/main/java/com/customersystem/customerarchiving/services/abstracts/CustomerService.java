package com.customersystem.customerarchiving.services.abstracts;

import java.util.List;

import com.customersystem.customerarchiving.models.Customer;

public interface CustomerService {
	List<Customer> getAll();
	void add(Customer customer);
	void delete(int id);
	void update(Customer customer);
	Customer getById(int id);
	
}


