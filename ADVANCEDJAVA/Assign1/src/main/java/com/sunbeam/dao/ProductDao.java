package com.sunbeam.dao;

import com.sunbeam.entities.Product;

public interface ProductDao {
	String addProperty(Product product);
	Product getProductDetailsById(Long prodID);
}
