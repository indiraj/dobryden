package com.dobryden.DAO;

import org.springframework.stereotype.Service;

import com.dobryden.model.Product;

@Service
public interface ProductDAO {

	public boolean insert_product(Product p);
}
