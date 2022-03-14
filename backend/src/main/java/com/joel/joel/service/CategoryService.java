package com.joel.joel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.joel.entities.Category;
import com.joel.joel.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository  repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}

}
