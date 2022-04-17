package com.joel.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joel.java.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
