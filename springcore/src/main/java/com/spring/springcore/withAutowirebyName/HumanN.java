package com.spring.springcore.withAutowirebyName;

public class HumanN 
{
	/* Dependency1 
		for these dependency>>> Spring is going to inject object 
			By using Setter Method--->written below
				like>>>> 	Heart heart=new Heart();  */
	private HeartN heart;
	
	//setter for Heart Class
	public void setHeart(HeartN heart)
	{
		System.out.println("heart object===>created by using setter method");
		this.heart= heart;
	}
	
	//method
	public void startPumping()
	{
		if(heart!=null)
		{	
			heart.pump();
		}
		else
		{
			System.out.println("you r dead");
		}
	}
	
	public void d()
	{
		System.out.println("**");
	}
}
