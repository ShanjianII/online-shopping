package net.cls.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.cls.shoppingbackend.dao.CategoryDAO;
import net.cls.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	
	static {
		
		Category category=new Category();
		
		//adding first category;
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for Television");
		category.setImaageURl("CAT_1.png");
		categories.add(category);
		
		//adding second category;
		category=new Category();
		
		
		category.setId(2);
		category.setName("mobile");
		category.setDescription("This is some description for mobile");
		category.setImaageURl("CAT_2.png");
		categories.add(category);
		
		//adding third category;
		category=new Category();
		
		
		category.setId(3);
		category.setName("laptop");
		category.setDescription("This is some description for laptop");
		category.setImaageURl("CAT_3.png");
		categories.add(category);
		
		
	}
	
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
