package com.spring.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/** 3rd way to create bean  using @Bean Annotation 
 */
//HERE we create Bean by using @Bean annotation

public class College 
{	
	//@Value(${college.Name})
	//@Value("Indian institute")
	private String collegename;  

	/**
	 * as we r using @Bean==> that create Object for particular class e.g
	 * 			@Bean 
	 * 			public method principalbean()
	 * 
	 */
	private Principal principal; //to set these dependency we need a para constructor-->of  College
	
	//default constructor
	public College()
	{
	}

	
	/*
	 * @Autowire
	 * public void setPrinpical(Principal principal)
	{
		this.principal=principal;
		System.out.println(using setter);
	} */
	

	//para constructor
	public College(Principal principal) 
	{
		this.principal = principal;
	}
	
	
	//method
	public void test()
	{
		System.out.println("testing this method");
	}
	
	//method
	public void test2()
	{
		System.out.println("testing this method");
		principal.principalInfo();
		System.out.println("My college name is:"+collegename);
	}
	
}
