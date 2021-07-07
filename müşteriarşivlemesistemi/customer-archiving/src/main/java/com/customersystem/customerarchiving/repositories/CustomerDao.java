package com.customersystem.customerarchiving.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customersystem.customerarchiving.models.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	Customer getById(int id);
	Customer findSystemUserById(int id);
}
