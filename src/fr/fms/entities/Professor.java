package fr.fms.entities;

import java.text.*;
import java.util.*;

public class Professor extends Person {	 
	// r�cup�rer ArrayList de cours
	private Date hireDate;
	private ArrayList<Course> course = new ArrayList<>();

	public Professor(String firstName, String lastName, int age, Address address, ArrayList<Course> course,
			Date hireDate) {
		super(lastName, firstName, age, address);
		this.hireDate = hireDate;
	}

	public void assignCourse(Professor professor, String course) {
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
		//Formatage de la date au format (dd/MM/yy)
		 SimpleDateFormat formater = null ;
		 formater = new SimpleDateFormat("dd/MM/yy");
		 
		return super.toString() + "\n" + "Date d'embauche : " + formater.format(hireDate) + "\n";
	}

	@Override
	public void modifyPerson(String firstName, String lastName, int ages) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(ages);
	}

	@Override
	public void removePerson(String prof) {
		for (Person professor : Data.professorList) {
			if (professor.getFirstName().equals(prof)) {
				Data.professorList.remove(professor);
			}
		}
	}

}
