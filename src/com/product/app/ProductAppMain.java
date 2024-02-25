package com.product.app;

import java.util.List;

import com.product.app.model.Product;
import com.product.app.service.ProductService;

/***
 * 
 * @author mandava
 *
 */
public class ProductAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product product1=new Product("Apple","Phone","AtlantaAppleStore",12);

		ProductService products = new ProductService();
		products.addProduct(new Product("Apple", "Phone", "AtlantaAppleStore", 12));
		products.addProduct(new Product("Samsung", "Phone", "AtlantaAppleStore", 12));
		products.addProduct(new Product("Moto", "Phone", "AtlantaAppleStore", 12));
		products.addProduct(new Product("Lenova", "Laptop", "Walmart", 12));

		List<Product> allProducts = products.getAllProducts();
		for (Product product : allProducts) {
			System.out.println(product);
		}
		System.out.println("=======================================");
		System.out.println("a particular product");

		Product product = products.getProduct("Apple");
		System.out.println(product);
		System.out.println("=======================================");
		System.out.println("a particular text");
		
		List<Product> prods =products.getTextFromProduct("Apple");
		for(Product product1:prods) {
			System.out.println(product1);
		}
		
		

	}

}
