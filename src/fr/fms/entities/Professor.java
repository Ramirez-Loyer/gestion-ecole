package fr.fms.entities;
import java.util.*;

public class Professor extends Person {
	
	// récupérer ArrayList de cours
	
	private Date hireDate;
	private ArrayList<Course> course = new ArrayList<>();
	
	public Professor(String firstName, String lastName, int age, Address address, ArrayList<Course> course, Date hireDate) {
		super(lastName, firstName, age, address, course);
		this.hireDate = hireDate;
	}
	
	// getProfInfos
	
	public void modifyPerson(String lastName, String firstName, int age, Date hireDate, Address address, ArrayList<Course> course) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.hireDate = hireDate;
	}
	
	public void removePerson(Prof) {
		if (course.contains(Prof)) {
			course.remove(prof);
		} else return
	}

	public void assignCourse(Professor professor,String course) {
		// trouver cours dans l'arrayList => course.add(professor)
		
	}
	
	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course, Professor professor) {
		// trouver le prof dans l'arrayList => course.add(professor)
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return super.toString() +  "\n" +
				"Date d'embauche : " + hireDate + "\n" +
				address;
				;
	}
	
	
}
