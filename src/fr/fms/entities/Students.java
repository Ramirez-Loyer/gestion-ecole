package fr.fms.entities;

import java.util.ArrayList;

public class Students extends Person {
	
	private ArrayList<Course> course;
	private int studentNumber;
	
	public Students ( String firstName , String lastName , int age , Address address , ArrayList<Course> course, int studentNumber)
	{
		super(firstName , lastName , age , address);
		this.course = followCourse();
		this.studentNumber = studentNumber;
	}
	
	public void modifyStudent(firstName , lastName , age)
	{
		
	}
	
	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void followCourse()
	{
		this.course = new ArrayList<Course>();
	}
	@Override
	public String tostString() 
	{
		return super.toString() + "\n" + this.adress + "\n"  + this.course;
	}
	
}
