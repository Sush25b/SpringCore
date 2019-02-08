package com.spring.springcore.IOCset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//These class dont have any Dependent Object
public class Si_TestCollNoDep 
{
	 public static void main(String[] args) {  
         
	    	ApplicationContext context=  new ClassPathXmlApplicationContext("SI_appcQuesCollNoDep.xml");  
	          
	    	SI_QuesCollNoDep q1=(SI_QuesCollNoDep)context.getBean("ques1");  
	        q1.displayInfo();
	        
	    }  
}
