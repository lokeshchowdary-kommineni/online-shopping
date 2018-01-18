package com.lokeshchowdary.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lokeshchowdary.shoppingbackend.dao.CategoryDAO;
import com.lokeshchowdary.shoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		
		context=new AnnotationConfigApplicationContext();
		context.scan("com.lokeshchowdary.shoppingbackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
	}
	
//	@Test
//	public void testAddCategory() {
//		
//		category=new Category();
//		
//		category.setName("Television");
//		category.setDescription("This is a Television");
//		category.setImageURL("CAT_1.png");
//		
//		assertEquals("Successfully add a category inside the table",true,categoryDAO.add(category));
//		
//	}
	
//	@Test
//	public void testGetCategory(){
//		
//		category=categoryDAO.get(1);
//		assertEquals("Successfully fetched a single category from the table","Television",category.getName());
//		
//	}
	
//	@Test
//	public void testUpdateCategory() {
//	
//		category=categoryDAO.get(1);
//		category.setName("TV");
//		assertEquals("Successfully updated a single category on the table",true,categoryDAO.update(category));
//		
//	}
	
//	@Test
//	public void testDeleteCategory() {
//	
//		category=categoryDAO.get(1);
//		assertEquals("Successfully deleted a single category on the table",true,categoryDAO.delete(category));
//		
//	}
	
//	@Test
//	public void testListCategory() {
//	
//		category=categoryDAO.get(1);
//		assertEquals("Successfully fetched the list of category from the table",0,categoryDAO.list().size());
//		
//	}
	
	@Test
	public void testCRUDCategory() {
	
		category=new Category();
		
		category.setName("Laptop");
		category.setDescription("This is a Laptop");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully add a category inside the table",true,categoryDAO.add(category));
		
		category=new Category();
		
		category.setName("Television");
		category.setDescription("This is a Television");
		category.setImageURL("CAT_2.png");
		assertEquals("Successfully add a category inside the table",true,categoryDAO.add(category));
		
		category=new Category();
		
		category.setName("Mobile");
		category.setDescription("This is a Mobile");
		category.setImageURL("CAT_3.png");
		assertEquals("Successfully add a category inside the table",true,categoryDAO.add(category));
		
		//fetching and updating the category
		
		category=categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully updated a single category on the table",true,categoryDAO.update(category));
		
		//delete the category
		assertEquals("Successfully deleted a single category on the table",true,categoryDAO.delete(category));
		
		//fetching the list
		assertEquals("Successfully fetched the list of category from the table",2,categoryDAO.list().size());
		
	}

}
