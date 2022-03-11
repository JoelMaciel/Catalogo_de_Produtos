package com.joel.joel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joel.joel.entities.Category;

@RestController
@RequestMapping(value= "/categories")
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books Joel"));
		list.add(new Category(2L, "Eletronics Maciel"));
		return ResponseEntity.ok().body(list);
	}
	
	

}









