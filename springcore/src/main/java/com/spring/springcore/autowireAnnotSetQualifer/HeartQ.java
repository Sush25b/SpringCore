package com.spring.springcore.autowireAnnotSetQualifer;

public class HeartQ
{
	/**
	 * for these variable==>in xml file,in HeartQ bean we have to give property tag
	 *   	as Spring doesnt inject vairable dependencies directly
	 * 			as Spring...doesnt know what value--->you r going to insert
	 * 					so...it doesnt Inject it, thats why we need to use property tag in HeartQ
	 */
	private String nameOfAnimal;
	private int noOfHeart;
	
	
		//getter and Setter
		public String getNameOfAnimal() {
			return nameOfAnimal;
		}
	
		public void setNameOfAnimal(String nameOfAnimal) {
			this.nameOfAnimal = nameOfAnimal;
		}
	
		public int getNoOfHeart() {
			return noOfHeart;
		}
	
		public void setNoOfHeart(int noOfHeart) {
			this.noOfHeart = noOfHeart;
		}
		

	//Method
	public void pump()
	{
		System.out.println("your heart is pumping");
		System.out.println("Alive");
	}
}
