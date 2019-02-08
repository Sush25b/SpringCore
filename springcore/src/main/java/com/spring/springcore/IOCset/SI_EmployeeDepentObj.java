package com.spring.springcore.IOCset;

public class SI_EmployeeDepentObj
{
	private int id;
	private String name;
	private String city;
	private SI_AddressDepentObj address;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public SI_AddressDepentObj getAddress() {
		return address;
	}
	public void setAddress(SI_AddressDepentObj address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SI_EmployeeDepentObj [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	
}
