package com.customersystem.customerarchiving.services.abstracts;

import java.util.List;


import com.customersystem.customerarchiving.models.File;

public interface FileService {
	List<File> getAll();
	void add(File file);
	void delete(int id);
	void update(int id, File file);

}
