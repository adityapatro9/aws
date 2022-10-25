package com.aditya.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.aws.pojo.Person;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String getHomeMessage() {
		return "Welcome to the AWS World!!";
	}
	
	// Move the below to dedicated Controllers
	
	@GetMapping("/author-details")
	public Person getAuthor() {
		return new Person("Aditya","Patro","9040300382");
	}
	

}
