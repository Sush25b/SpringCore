package com.spring.springcore.autowireAnnotSetQualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.springcore.autowireAnnotatonConstructor.HeartA;

public class HumanQ 
{
	/* Dependency
	for these dependency>>> Spring is going to inject object 
		By usig Setter Method--->written below
					like>>>> 	Heart heart=new Heart();  */
		private HeartQ heart;

		
		public HumanQ() 
		{
		}


		public HumanQ(HeartQ heart) 
		{
			System.out.println("heart object===>created  by calling costructor");
			this.heart = heart;
		}


		/**
		 * In setter 
		 * 			byType...it is going check then
		 *           here in xml we have 2 beans===> of HeartQ class...so error which one to choose??
		 * to specifiy the Spring that -->for what particular Object it need to do inject/insert
		 * into HeartQ object
		 *	
		 */
		//setter for Heart Class
		@Autowired
		@Qualifier("humanHeart")
		public void setHeart(HeartQ heart)
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
			System.out.println("nameOfAnimal: "+heart.getNameOfAnimal() +"\n"+"noOfHearts: "+heart.getNoOfHeart());
			
		}
}
