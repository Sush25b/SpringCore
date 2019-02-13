package com.spring.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/** 3rd way to create bean  using @Bean Annotation 
 */
//HERE we create Bean by using @Bean annotation

public class College 
{
	/*@Value("Indian institute")
	private String collegename;   */
	
	
 	
	private Principal principal;
	
	//default constructor
	public College()
	{
	}

	//para constructor
	public College(Principal principal) 
	{
		this.principal = principal;
	}
	
	/*public void setPrinpical(Principal principal)
	{
		this.principal=principal;
		System.out.println(using setter);
	} */
	
	
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
	}
	
}
