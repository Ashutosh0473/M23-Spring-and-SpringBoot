package com.cg.di;

public class Student {
	 private String StudentName;
	 private int StudentRoll;

	public int getStudentRoll() {
		return StudentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		StudentRoll = studentRoll;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	//userDefined Method
	 public void display()
	 {
		 System.out.println("StudentName is :"+StudentName);
	 }
}
