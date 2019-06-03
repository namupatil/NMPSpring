package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String manifacturer;
	private double price;
	private String Catagory;
	private Date mgDate;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manifacturer=" + manifacturer + ", price=" + price
				+ ", Catagory=" + Catagory + ", mgDate=" + mgDate + "]";
	}
	public Product(int id, String name, String manifacturer, double price, String catagory, Date mgDate) {
		super();
		this.id = id;
		this.name = name;
		this.manifacturer = manifacturer;
		this.price = price;
		this.Catagory = catagory;
		this.mgDate = mgDate;
		
	}
	public Product() {}
	public String getCatagory() {
		return Catagory;
	}
	public void setCatagory(String catagory) {
		Catagory = catagory;
	}
	public Date getMgDate() {
		return mgDate;
	}
	public void setMgDate(Date mgDate) {
		this.mgDate = mgDate;
	}
	public Product(int id, String name, String manifacturer, double price) {
		super();
		this.id = id;
		this.name = name;
		this.manifacturer = manifacturer;
		this.price = price;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
