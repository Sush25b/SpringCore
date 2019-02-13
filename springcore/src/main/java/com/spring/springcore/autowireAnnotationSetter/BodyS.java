package com.spring.springcore.autowireAnnotationSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.autowireAnnotatonConstructor.HumanA;

public class BodyS 
{
	 public static void main(String[] args) {  
        
	      //while create object===>as written in file
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("AutowireAnnotationSetter.xml");  
	          
	    	//we get human object
	        HumanS human=(HumanS)context.getBean("human");  
	        human.startPumping();
	        
	    }  
}
