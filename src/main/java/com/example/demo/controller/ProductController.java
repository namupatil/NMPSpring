package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

 

@RestController
@RequestMapping("/products")
public class ProductController
{

	@Autowired
	ProductRepository productrepo;
	
	@RequestMapping("/")
	public List<Product> getList()
	{
		return productrepo.findByOrderByName();
	}
	
	@RequestMapping("/company/{manifacturer}")
	public List<Product> getListBycompany(@PathVariable(value="manifacturer") String manifacturer)
	{
		return productrepo.findByManifacturerOrderByManifacturer(manifacturer);
	}
}
		
