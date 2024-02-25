package com.product.app.service;

import java.util.ArrayList;
import java.util.List;

import com.product.app.model.Product;

/***
 * 
 * @author mandava
 *
 */
public class ProductService {

	List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);

	}

	public List<Product> getAllProducts() {
		return products;

	}

	public Product getProduct(String name) {
		for (Product product : products) {
			if (product.getName().equals(name))
				return product;
		}
		return null;

	}

}
