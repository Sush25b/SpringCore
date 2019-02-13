/**
 * @Autowire --->using setter
 * 
 * 1)first it will try to resolve with "byType"
 * 
 * 2) if byType fails.....then....it goes to resolve with 
 * 
 * 
 * 
 */

package com.spring.springcore.autowireAnnotationSetter;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanS 
{
	/* Dependency
	for these dependency>>> Spring is going to inject object 
		By usig Setter Method--->written below
					like>>>> 	Heart heart=new Heart();  */
		private HeartS heart;

		
		public HumanS() 
		{
		}

		//constructor
		public HumanS(HeartS heart) 
		{
			System.out.println("heart object===>created  by calling costructor");
			this.heart = heart;
		}

		//setter for Heart Class
		@Autowired 
		public void setHeart(HeartS heart)
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
