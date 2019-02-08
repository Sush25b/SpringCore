package com.spring.springcore.IOCset;

public class CI_EmployeeDepentObj 
{
	private int id;
	private String name;
	private String city;
	private CI_AddressDepentObj address;
	
	
	public CI_EmployeeDepentObj() {
		
	}


	public CI_EmployeeDepentObj(int id, String name, String city, CI_AddressDepentObj address) 
	{

		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
	}


	@Override
	public String toString() {
		return "CI_EmployeeDepentObj [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
}
