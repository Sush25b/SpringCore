package com.spring.springcore.IOCset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SI_Test {  
    public static void main(String[] args) {  
          
    	ApplicationContext context =  new ClassPathXmlApplicationContext("SI_applcontentEmp.xml");  
          
        SI_Employee e1=(SI_Employee)context.getBean("empobj1");  
        e1.display();
        
        SI_Employee e2=(SI_Employee)context.getBean("empobj2");  
        e2.display();
        
    }  
}  