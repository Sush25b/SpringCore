package com.spring.springcore.IOCset;

public class CI_AddressDepentObj 
{
	private  String Addressline;
	private String State;
	private String city;
	
	public CI_AddressDepentObj() {

	}

	public CI_AddressDepentObj(String addressline, String state, String city) {

		this.Addressline = addressline;
		this.State = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "CI_AddressDepentObj [Addressline=" + Addressline + ", State=" + State + ", city=" + city + "]";
	}
	
}
