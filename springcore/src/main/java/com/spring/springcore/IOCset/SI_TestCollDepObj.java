package com.spring.springcore.IOCset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SI_TestCollDepObj 
{
	public static void main(String[] args) {  
        
    	ApplicationContext context=  new ClassPathXmlApplicationContext("SI_appcQuesCollDep.xml");  
          
    	SI_QuesCollDepObj q1=(SI_QuesCollDepObj)context.getBean("ques1");  
        q1.displayInfo();
        
    }  
}
