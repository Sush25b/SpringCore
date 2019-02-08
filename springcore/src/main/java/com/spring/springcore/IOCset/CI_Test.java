package com.spring.springcore.IOCset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CI_Test 
{
	 public static void main(String[] args) {  
         
	    	ApplicationContext context=  new ClassPathXmlApplicationContext("CI_applcontentEmp.xml");  
	          
	        CI_Employee e1=(CI_Employee)context.getBean("empobj1");  
	        e1.display();
	        
	        CI_Employee e2=(CI_Employee)context.getBean("empobj2");  
	        e2.display();        
	    }  
}
