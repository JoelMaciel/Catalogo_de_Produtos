package com.joel.joel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joel.joel.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
