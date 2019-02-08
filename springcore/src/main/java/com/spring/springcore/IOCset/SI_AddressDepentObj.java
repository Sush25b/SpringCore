package com.spring.springcore.IOCset;

public class SI_AddressDepentObj
{
	private  String Addressline;
	private String State;
	private String city;
	
	//getter setters
	public String getAddressline() {
		return Addressline;
	}
	public void setAddressline(String addressline) {
		Addressline = addressline;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//display details
	@Override
	public String toString() {
		return "SI_AddressDepentObj [Addreesline=" + Addressline + ", State=" + State + ", city=" + city + "]";
	}
	
}
