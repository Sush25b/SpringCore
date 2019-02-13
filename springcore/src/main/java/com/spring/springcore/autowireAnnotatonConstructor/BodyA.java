package com.spring.springcore.autowireAnnotatonConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.withoutAutowire.Human;

public class BodyA
{
	 public static void main(String[] args) {  
         
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("AutowireAnnotationConstructor.xml");  
	          
	    	//we get human object
	        HumanA human=(HumanA)context.getBean("human");  
	        human.startPumping();
	        
	    }  

}
