package com.spring.springcore.withoutAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{
	    public static void main(String[] args) {  
	          
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("withoutAutowire.xml");  
	          
	    	//we get human object
	        Human human=(Human)context.getBean("human");  
	        human.startPumping();
	        
	    }  

}
