package net.cls.shoppingbackend.dao;

import java.util.List;

import net.cls.shoppingbackend.dto.Category;

public interface CategoryDAO {

	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
	boolean update(Category category);
	boolean delete(Category category);
	
	
	
	
}
