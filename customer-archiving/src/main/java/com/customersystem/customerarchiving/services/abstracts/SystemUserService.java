package com.customersystem.customerarchiving.services.abstracts;

import java.util.List;

import com.customersystem.customerarchiving.models.SystemUser;

public interface SystemUserService {
	List<SystemUser> getAll();
	void add(SystemUser systemUser);
	void delete(int id);
	void update(int id, SystemUser systemUser);
}
