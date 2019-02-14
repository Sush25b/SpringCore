package com.spring.springcore.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//NOTE: INSTEAD of xml file we use these file...as we deleted xml file

/**
 * @Configuration -->says Spring these is a Configuration Class 
 * 		and all the Beans Class r here
 * 		and from these class we r doing Component scanning
 * 
 * 		Component--->here means Classes
 *
 *@ComponentScan -->tells spring which package>>>classes it need to scan e.g College etc...like given below
 *							@Component				
 *							Class College
 *
 *So spring is going to READ these files...bzc @Configuration used ...
 *		NOTE: earlier we use xml file for Component(classes) scanning
 */

//STEP 2: from here as @ComponentScan is their..so spring scan all class of the packege
			//so call to College Class
@Configuration
@ComponentScan(basePackages = "com.spring.springcore.component")
public class CollegeConfig 
{
	
}