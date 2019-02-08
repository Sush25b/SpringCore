package com.spring.springcore.IOCset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CI_TestCollDepObj 
{
	public static void main(String[] args) 
	{  
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("CI_applcontentEmpDepobj.xml");  
	          
	    	CI_EmployeeDepentObj e1=(CI_EmployeeDepentObj)context.getBean("empobj1");  
	        System.out.println(e1);   
	}  
}
