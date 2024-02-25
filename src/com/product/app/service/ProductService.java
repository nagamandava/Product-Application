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

	public List<Product> getTextFromProduct(String Apple) {
		
		List<Product> prods = new ArrayList<>();
		for(Product product:products) {
			if(product.getName().contains(Apple)||product.getPlace().contains(Apple)) {
				prods.add(product);
			}
		}
		return prods;
		
	}

}
