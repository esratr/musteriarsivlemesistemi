package com.customersystem.customerarchiving.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customersystem.customerarchiving.models.Customer;
import com.customersystem.customerarchiving.models.SystemUser;
import com.customersystem.customerarchiving.repositories.SystemUserDao;
import com.customersystem.customerarchiving.services.abstracts.SystemUserService;

@Service
public class SystemUserManager implements SystemUserService {
	
	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public List<SystemUser> getAll() {
		
		return this.systemUserDao.findAll();
	}

	@Override
	public void add(SystemUser systemUser) {
		this.systemUserDao.save(systemUser);
	}

	@Override
	public void delete(int id) {
		this.systemUserDao.deleteById(id);
		
	}

	@Override
	public void update(SystemUser systemUser) {
		SystemUser updatedSystemUser = this.systemUserDao.getById(systemUser.getId());
		if(updatedSystemUser!=null) {
			updatedSystemUser.setUserName(systemUser.getUserName());
			updatedSystemUser.setUserSurname(systemUser.getUserSurname());
			updatedSystemUser.setEmail(systemUser.getEmail());
			updatedSystemUser.setPassword(systemUser.getPassword());
			updatedSystemUser.setStaffNo(systemUser.getStaffNo());
			updatedSystemUser.setDateOfBirth(systemUser.getDateOfBirth());
			
			
			
			this.systemUserDao.save(updatedSystemUser);
		}
	
	}

}
