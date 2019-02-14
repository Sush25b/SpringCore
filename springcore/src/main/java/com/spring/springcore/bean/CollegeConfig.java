package com.spring.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*NOTE: INSTEAD of xml file we use these file 

@Configuration -->says to Spring>>>>> these is a Configuration Class 
					and all the Beans Class r here

Step 1:   HERE inside these file we r going to Configure===> Beans using @Bean Annotation
		    not by using <bean> tag  OR  @Component  */

@Configuration
public class CollegeConfig 
{
	
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	
	/**Step2: Here we need to create obj for College class
	 * 			the method below collegeBean()===>will create & return Object of College
	 * 				and it is also the Bean id/name
	 * 	the new object is ...then stored in IOC container
	 */
	//Bean 1st created
	@Bean						 //Bean(name="colb") we can give diff name to Bean
	public College collegeBean() //collegebean -->is my bean id  
	{
		College college=new College( principalBean());
		return college;
	}
	
	
	@Bean						 //Bean(name="colb") we can give diff name to Bean
	public College collegeBean2() //collegebean -->is my bean id  
	{
		//if their is Depency in College Class i.e principal 
		College college=new College(principalBean());
		return college;
	}
	
}
