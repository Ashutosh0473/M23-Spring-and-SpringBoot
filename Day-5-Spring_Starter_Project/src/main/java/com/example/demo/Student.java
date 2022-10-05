package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class Student 
{	
	
	private int rollno;
	private String name;
	public void disp()
	{
		System.out.println("Student classs");
	}
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
