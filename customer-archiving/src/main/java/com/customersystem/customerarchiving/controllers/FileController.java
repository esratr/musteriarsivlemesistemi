package com.customersystem.customerarchiving.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customersystem.customerarchiving.models.File;

import com.customersystem.customerarchiving.services.abstracts.FileService;

@RestController
@RequestMapping(value = "/api/files")
public class FileController {
	private FileService fileService;

	@Autowired
	public FileController(FileService fileService) {
		super();
		this.fileService = fileService;
	}

	@GetMapping("/getall")
	public List<File> getAll() {
		return this.fileService.getAll();

	}

	@PostMapping("/add")
	public void add(@RequestBody File file) {
		this.fileService.add(file);
	}

	@PutMapping("/update")
	public void update(@Valid @RequestBody File file) {
		this.fileService.update(file);
		
	}

	@PostMapping("/delete")
	public void delete(@RequestParam("id") int id) {
		this.fileService.delete(id);
	}

}
