package fr.fms.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
	
	private String label;
	private LocalDate startDate;
	private LocalDate endDate;
	private ArrayList<Person> studentList = new ArrayList<Person>();
	private Person professor;
	private ArrayList<Course> courseList = Data.courseList;
	
	public Course(String label, LocalDate startDate, LocalDate endDate, ArrayList<Person> studentList,
			Person professor) {
		super();
		setLabel(label);
		setStartDate(startDate);
		setEndDate(endDate);
		setStudentList(studentList);
		setProfessor(professor);
	}
	
	public Course() {
		
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Person> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Person> studentList) {
		this.studentList = studentList;
	}

	public Person getProfessorList() {
		return professor;
	}

	public void setProfessor(Person professor) {
		this.professor = professor;
	}
	
	public void addCourse(Course course){
		courseList.add(course);
	}
	
	public void modifyCourse(String label, LocalDate startDate, LocalDate endDate, ArrayList<Person> studentList, Person professor){
		setLabel(label);
		setStartDate(startDate);
		setEndDate(endDate);
		setStudentList(studentList);
		setProfessor(professor);
		
	}
	
	public void  removeCourse(Course course){
		courseList.remove(course);
	}

	@Override
	public String toString() {
		return "[denomination : " + label + ", date de début : " + startDate + ", date de fin : " + endDate + ", liste d'élèves : "
				+ studentList + ", ensignant : " + professor + "]";
	}
	
	
	
	

}
