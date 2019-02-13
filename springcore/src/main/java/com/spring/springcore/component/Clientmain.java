package com.spring.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.autowireAnnotSetQualifer.HumanQ;

public class Clientmain
{
	public static void main(String[] args) {  
        
		/*NOTE: we deleted xml file her--->as we using another tag instead
		  
	      //here the spring will call--->springcoreBeans.xml
	    	ApplicationContext context =  new ClassPathXmlApplicationContext("springcoreBeans.xml");  
	         System.out.println("file loaded springcoreBeans.xml");
	     */
		
		//STEP1: call goes to CollegeConfig.class
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
         College college= (College)context.getBean("collegeBean");
         System.out.println("College object==>created by spring is: "+college);
         college.test();
	    }  
}
