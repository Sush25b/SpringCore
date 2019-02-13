package com.spring.springcore.withAutowirebyConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.withAutowirebyType.HumanT;

public class BodyC 
{
	public static void main(String[] args) {  
        
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("withAutowireC.xml");  
	          
	    	//we get human object
	        HumanC human=(HumanC)context.getBean("human");  
	        human.startPumping();       
	    }  
}
