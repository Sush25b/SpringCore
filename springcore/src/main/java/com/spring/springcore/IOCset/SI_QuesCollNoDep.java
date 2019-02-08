//no depent ,and we use LISt here
package com.spring.springcore.IOCset;

import java.util.Iterator;
import java.util.List;

//These class dont have any Dependent Object
public class SI_QuesCollNoDep 
{
	private int id;
	private String name;
	
	//as each question can have multiple answers
		//here we use list--->for answers
	private List<String> answers;
	
	
	//getter setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	//display details
	public void displayInfo()
	{
		System.out.println("id:"+id+"  name:"+name);
		System.out.println("answers list is:");
		Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext())
	    {  
	        System.out.println(itr.next());  
	    }
    }
}
