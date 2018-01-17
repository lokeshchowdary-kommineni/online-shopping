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
	
	@Test
	public void testAddCategory() {
		
		category=new Category();
		
		category.setName("Television");
		category.setDescription("This is a Television");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully add a category inside the table",true,categoryDAO.add(category));
		
	}
	

}
