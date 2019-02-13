package com.spring.springcore.autowireAnnotSetQualifer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.autowireAnnotatonConstructor.HumanA;

public class BodyQ 
{
	 public static void main(String[] args) {  
         
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("autowireAnnotSetQualifer.xml");  
	          
	    	//we get human object
	        HumanQ human=(HumanQ)context.getBean("human");  
	        human.startPumping();
	        human.d();
	        
	    }  
}
