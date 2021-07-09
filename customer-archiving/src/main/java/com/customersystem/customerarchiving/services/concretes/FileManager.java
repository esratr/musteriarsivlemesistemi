package com.customersystem.customerarchiving.services.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customersystem.customerarchiving.models.File;
import com.customersystem.customerarchiving.repositories.FileDao;
import com.customersystem.customerarchiving.services.abstracts.FileService;

@Service
public class FileManager implements FileService {
	private FileDao fileDao;
	

	public FileManager(FileDao fileDao) {
		super();
		this.fileDao = fileDao;
	}

	@Override
	public List<File> getAll() {
		
		return this.fileDao.findAll();
	}

	@Override
	public void add(File file) {
	this.fileDao.save(file);
	}

	@Override
	public void delete(int id) {
		this.fileDao.deleteById(id);
		
	}

	@Override
	public void update(File file) {
		File updatedFile = this.fileDao.getById(file.getId());
		if (updatedFile!=null) {
			updatedFile.setDateOfUpload(file.getDateOfUpload());
			updatedFile.setFileNo(file.getFileNo());
			this.fileDao.save(updatedFile);
		}
		
	}

}
