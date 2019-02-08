package com.spring.springcore.IOCset;

public class CI_Employee 
{
	private int id;
	private String name;
	private String city;
	
	//constructor's
	public CI_Employee() 
	{
	}


	public CI_Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public CI_Employee(int id, String name, String city) 
	{
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//display details
	public void display()
	{
		System.out.println("id:"+id+"  "+"name:"+name+" city:"+city);
	}
	
}
