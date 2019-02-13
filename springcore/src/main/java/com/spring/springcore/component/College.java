package com.spring.springcore.component;

import org.springframework.stereotype.Component;


/** 2ways to create bean  using @component & <bean> tag
 * 
 * @Component --> work same as that of <bean tag> ,the tag show that it is a Bean
 *  
 * 		& id of that beans is given like  @Component("id")  
 *									     i.e @Component("collegeBean")
 *
 *By seeing @component tag..spring will create object for that Class
 */

//STEP3: as @compoent is their Spring create Object for these class and store in IOC container
@Component("collegeBean")
public class College 
{
	public void test()
	{
		System.out.println("testing this method");
	}
}
