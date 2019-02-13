package com.spring.springcore.withoutAutowire;

public class Human 
{
	/* Dependency
		for these dependency>>> Spring is going to inject object 
			By usig Setter Method--->written below
				like>>>> 	Heart heart=new Heart();  */
	private Heart heart;
	
	//setter for Heart Class
	public void setHeart(Heart heart)
	{
		System.out.println("heart object===>created");
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
