package com.spring.springcore.IOCset;

import java.util.Iterator;
import java.util.List;

public class SI_QuesCollDepObj 
{
	private int id;
	private String name;
	//as each question can have multiple answers
		//here we use list--->for answers
	private List<SI_AnswerCollDepObj> answers;
	

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

	public List<SI_AnswerCollDepObj> getAnswers() {
		return answers;
	}

	public void setAnswers(List<SI_AnswerCollDepObj> answers) {
		this.answers = answers;
	}
	
	//display details
		public void displayInfo()
		{
			System.out.println("id:"+id+"  name:"+name);
			System.out.println("answers list is:");
			Iterator<SI_AnswerCollDepObj> itr=answers.iterator();  
		    while(itr.hasNext())
		    {  
		        System.out.println(itr.next());  
		    }
	    }
		

}
