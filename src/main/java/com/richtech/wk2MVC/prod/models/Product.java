package com.richtech.wk2MVC.prod.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
	
@Id
	int Id ;
	String name ;
	float price;
	
	
	public Product(int id, String name, float price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
