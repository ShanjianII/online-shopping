package net.cls.shoppingbackend.TEST;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.cls.shoppingbackend.dao.CategoryDAO;
import net.cls.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.cls.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

//	@Test
//	public void testAddCategory() {
//		category=new Category();
//		
//		category.setName("mobile");
//		category.setDescription("This is some description for Television");
//		category.setImaageURl("CAT_111.png");
//		
//		assertEquals("Successfully added a category inside the table!", true,categoryDAO.add(category));
//		
//		
//	}

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category=categoryDAO.get(2);
	 * assertEquals("Successfully fetched a single category from the table!",
	 * "laptop",category.getName()); // }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category=categoryDAO.get(2);
	 * assertEquals("Successfully fetched a single category from the table!",
	 * "laptop",category.getName()); // }
	 */
//	@Test
//	public void testUpdateCategory() {
//		
//
//		 category=categoryDAO.get(2);
//		 category.setName("TV");
//		 
//		 assertEquals("Successfully updated a single category in the table!",true,categoryDAO.update(category));
//		
//	}
//	@Test
//	public void testDeleteCategory() {
//		 category=categoryDAO.get(2);
//		 
//		 assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
//		
//	}
//	@Test
//	public void testListCategory() {
//		 
//		 assertEquals("Successfully fetched the list of categories from the table!",3,categoryDAO.list().size());
//		
//	}
	
//	@Test
//	public void testCRUDCategory() {
//		category=new Category();
//		
//		category.setName("12mobile");
//		category.setDescription("This is some description for Television");
//		category.setImaageURl("CAT_111.png");
//		
//		assertEquals("Successfully added a category inside the table!", true,categoryDAO.add(category));
//		
//		
//	}
	
}
