package com.spring.springcore.autowireAnnotatonConstructor;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.springcore.withoutAutowire.Heart;

public class HumanA 
{
	/* Dependency
	for these dependency>>> Spring is going to inject object 
		By usig Setter Method--->written below
					like>>>> 	Heart heart=new Heart();  */
		private HeartA heart;
		
		
		public HumanA() 
		{
		}

		@Autowired 
		public HumanA(HeartA heart) 
		{
			System.out.println("heart object===>created  by calling costructor");
			this.heart = heart;
		}
		
		//setter for Heart Class
		public void setHeart(HeartA heart)
		{
			System.out.println("heart object===>created  by caling setter method");
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
