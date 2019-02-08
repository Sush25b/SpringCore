package com.spring.springcore.IOCset;

public class SI_Employee
{
	private int id;
	private String name;
	private String city;
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}


	public void setName(String name)
{
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display()
	{
		System.out.println("id:"+id+"  "+"name:"+name+" city:"+city);
	}
	
}

/*
//no parameter
Employee()
{		
}

//with 1 parameter
Employee(int id)
{		
	this.id=id;
}

//with 1 parameter
Employee(String name)
{
	this.name=name;
}

//with 2 parameter
Employee(int id,String name)
{
	this.name=name;
	this.id=id;
}
*/