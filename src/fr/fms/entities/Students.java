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
	
	public void modifyStudent( String name , String firstNam , int ages)
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

	public ArrayList<Course> followCourse()
	{
		return this.course = new ArrayList<Course>();
	}
	
	public String tostString() 
	{
		return super.toString() + "\n"  + this.course;
	}

	@Override
	public String modifyPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removePerson() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
