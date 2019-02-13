package com.spring.springcore.withAutowirebyType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.withAutowirebyName.HumanN;

public class BodyT 
{
	  public static void main(String[] args) {  
          
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("withAutowireT.xml");  
	          
	    	//we get human object
	        HumanT human=(HumanT)context.getBean("human");  
	        human.startPumping();       
	    }  
}
