package fr.fms.entities;

import java.util.ArrayList;
import java.util.Date;

public class Course {
	
	private String label;
	private Date startDate;
	private Date endDate;
	private ArrayList<Person> studentList = new ArrayList<Person>();
	private Person professor;
	private ArrayList<Course> courseList = Data.courseList;
	
	public Course(String label, Date startDate, Date endDate, ArrayList<Person> studentList,
			Person professor) {
		super();
		setLabel(label);
		setStartDate(startDate);
		setEndDate(endDate);
		this.studentList = studentList;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
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
	
	public void  modifyCourse(){
		
		
	}
	
	public void  removeCourse(Course course){
		courseList.remove(course);
	}

	@Override
	public String toString() {
		return "Course [label=" + label + ", startDate=" + startDate + ", endDate=" + endDate + ", studentList="
				+ studentList + ", professorList=" + professor + "]";
	}
	
	
	
	

}
