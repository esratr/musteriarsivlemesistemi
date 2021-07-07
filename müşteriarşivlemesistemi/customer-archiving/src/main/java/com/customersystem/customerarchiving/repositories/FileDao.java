package com.customersystem.customerarchiving.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customersystem.customerarchiving.models.File;

@Repository
public interface FileDao extends JpaRepository<File, Integer>{
	File getFileById(int id);
	
	List<File> findFileByFileNo(int fileNo);

}
