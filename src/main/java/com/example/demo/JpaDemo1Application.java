package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Author;
import com.example.demo.model.Post;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;

@SpringBootApplication
public class JpaDemo1Application {

	@Autowired 
	PostRepository postrepo;
	
	@Autowired
	AuthorRepository authorrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo1Application.class, args);
	}
	
	
	
@PostConstruct
void printPosts()
{
	Author author=new Author("Namrata","Patil");
	
	authorrepo.save(author);
	
	/*for(Post post: postrepo.findAll()) {
		System.out.println(post);
}*/
}
}
