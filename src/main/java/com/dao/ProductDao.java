package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	//create
	@Transactional
	public void createProduct(Product product) {
		//means save and update
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	
	//get all products
	public List<Product> getProducts(){
		List<Product> products= this.hibernateTemplate.loadAll(Product.class);
		
		return products;
		
	}
	
//	delete product
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.get(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
//	get one product
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}

}
