package fr.fms.entities;

import java.util.ArrayList;

public class Students extends Person 
{
	private ArrayList<Course> course;
	private int studentNumber;

	public Students(String firstName, String lastName, int age, Address address, ArrayList<Course> course,
			int studentNumber) 
	{
		super(firstName, lastName, age, address);
		this.course = followCourse();
		this.studentNumber = studentNumber;
	}
	
//	public void modifyStudent( String firstName , String lastName , int ages)
//	{
//		setFirstName(firstName);
//		setLastName(lastName);
//		setAge(ages);
//	}

	public ArrayList<Course> getCourse() 
	{
		return course;
	}

	public void setCourse(ArrayList<Course> course) 
	{
		this.course = course;
	}

	public int getStudentNumber() 
	{
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) 
	{
		this.studentNumber = studentNumber;
	}

	public ArrayList<Course> followCourse() 
	{
		return this.course = new ArrayList<Course>();
	}

	@Override
	public String toString() 
	{
		return super.toString() + studentNumber;
	}

	@Override
	public void modifyPerson(String firstName , String lastName , int ages) 
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAge(ages);
	}

//	public static void removeStudent(String student/*Students student*/) 
//	{
//		//Data.studentList.remove(student);
//		for ( Person studen : Data.studentList)
//		{
//			if( studen.getFirstName().equals(student))
//			{
//				Data.studentList.remove(studen);
//			}
//		}
//	}

	@Override
	public void removePerson(String student) 
	{
		for ( Person studen : Data.studentList)
		{
			if( studen.getFirstName().equals(student))
			{
				Data.studentList.remove(studen);
			}
		}
	}
}
