package com.spring.springcore.withAutowirebyName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BodyN 
{
	    public static void main(String[] args) {  
	          
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("withAutowireN.xml");  
	          
	    	//we get human object
	        HumanN human=(HumanN)context.getBean("human");  
	        human.startPumping();       
	    }  
}
