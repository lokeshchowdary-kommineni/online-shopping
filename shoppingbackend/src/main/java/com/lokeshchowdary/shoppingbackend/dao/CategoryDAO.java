package com.lokeshchowdary.shoppingbackend.dao;

import java.util.List;

import com.lokeshchowdary.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
