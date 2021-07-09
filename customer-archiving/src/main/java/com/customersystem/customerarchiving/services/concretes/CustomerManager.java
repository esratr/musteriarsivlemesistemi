package com.customersystem.customerarchiving.services.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customersystem.customerarchiving.models.Customer;
import com.customersystem.customerarchiving.repositories.CustomerDao;
import com.customersystem.customerarchiving.services.abstracts.CustomerService;

@Service
public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> getAll() {
		
		return this.customerDao.findAll();
	}

	@Override
	public void add(Customer customer) {
		 this.customerDao.save(customer);
	}

	@Override
	public void delete(int id) {
	this.customerDao.deleteById(id);
	}

	@Override
	public void update(Customer customer) {
		Customer updatedCustomer = this.customerDao.getById(customer.getId());
		if(updatedCustomer!=null) {
			updatedCustomer.setCustomerName(customer.getCustomerName());
			updatedCustomer.setAddress(customer.getAddress());
			updatedCustomer.setCustomerSurname(customer.getCustomerSurname());
			updatedCustomer.setCustomerNo(customer.getCustomerNo());
			updatedCustomer.setEmail(customer.getEmail());
			updatedCustomer.setDateOfBirth(customer.getDateOfBirth());
			updatedCustomer.setIdentityNumber(customer.getIdentityNumber());
			
			this.customerDao.save(updatedCustomer);
			
		}
		
	}

	@Override
	public Customer getById(int id) {
		
		return this.customerDao.getById(id);
	}


	

}
