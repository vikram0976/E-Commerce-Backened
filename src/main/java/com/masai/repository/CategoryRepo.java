package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

	public List<Category> findByName(String name);
	
}
