package com.example.demo.Home;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class Home implements GraphQLQueryResolver{

	
	
	public String hello() {
		
		return " helloe world !";
	}
	
	public String test() {
		
		return "我是你爸爸";
	}
	
	
	String name="Leon";
	String age ="20";
	String country ="tw";
	
	
	
	
	
}
