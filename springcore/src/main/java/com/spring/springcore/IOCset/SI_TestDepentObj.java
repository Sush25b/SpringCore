package com.spring.springcore.IOCset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SI_TestDepentObj
{
	public static void main(String[] args) 
	{  
        
    	ApplicationContext context =  new ClassPathXmlApplicationContext("SI_applcontentEmpDepobj.xml");  
          
    	SI_EmployeeDepentObj e1=(SI_EmployeeDepentObj)context.getBean("empobj1");  
        System.out.println(e1);
    
    }  
}

