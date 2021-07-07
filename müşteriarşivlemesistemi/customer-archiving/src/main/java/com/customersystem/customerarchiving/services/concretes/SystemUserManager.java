package com.customersystem.customerarchiving.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void update(int id,SystemUser systemUser) {
		this.systemUserDao.save(systemUser);
	}

}
