package com.dobryden.DAO;

import org.springframework.stereotype.Service;

import com.dobryden.model.Category;



@Service
public interface CategoryDAO
{
	public boolean insert_Category(Category d);
}
