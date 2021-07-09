package com.customersystem.customerarchiving.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customersystem.customerarchiving.models.SystemUser;

@Repository
public interface SystemUserDao extends JpaRepository<SystemUser, Integer>{
	SystemUser getById(int id);
	SystemUser findSystemUserByEmail(String email);

}
