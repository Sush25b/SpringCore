package com.spring.springcore.withAutowirebyType;

import com.spring.springcore.withAutowirebyName.HeartN;

public class HumanT 
{
	/* Dependency1 
	for these dependency>>> Spring is going to inject object 
		By using Setter Method--->written below
			like>>>> 	Heart heart=new Heart();  */
			private HeartT heart;

			
			//setter for Heart Class
			public void setHeart(HeartT heart)
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
