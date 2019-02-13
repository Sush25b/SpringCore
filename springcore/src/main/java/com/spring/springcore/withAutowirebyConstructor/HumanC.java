package com.spring.springcore.withAutowirebyConstructor;

import com.spring.springcore.withAutowirebyType.HeartT;

public class HumanC 
{
	/* Dependency1 
	for these dependency>>> Spring is going to inject object 
		By using Setter Method--->written below
			like>>>> 	Heart heart=new Heart();  */
			private HeartC heart;
			
			
			//constructor
			public HumanC(HeartC heart) 
			{	System.out.println("heart object===>created   by constructor method call");
				this.heart = heart;
			}
			
			
			//setter for Heart Class
			public void setHeart(HeartC heart)
			{
				System.out.println("heart object===>created   by setter method call");
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
}
