package com.customersystem.customerarchiving.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customersystem.customerarchiving.models.SystemUser;
import com.customersystem.customerarchiving.services.abstracts.SystemUserService;

@RestController
@RequestMapping(value="/api/systemuser")

public class SystemUserController {
	private SystemUserService systemUserService;

	@Autowired
	public SystemUserController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}

	@GetMapping("/getall")
	public List<SystemUser> getAll() {
		return this.systemUserService.getAll();

	}

	@PostMapping("/add")
	public void add(@RequestBody SystemUser systemUser) {
		this.systemUserService.add(systemUser);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @Valid @RequestBody SystemUser systemUser) {
		this.systemUserService.update(id, systemUser);
		systemUser.setEmail(systemUser.getEmail());
		systemUser.setPassword(systemUser.getPassword());

	}

	@PostMapping("/delete")
	public void delete(@RequestParam("id") int id) {
		this.systemUserService.delete(id);
	}

}
