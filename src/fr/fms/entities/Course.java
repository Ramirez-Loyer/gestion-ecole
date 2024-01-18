package fr.fms.entities;

import java.util.ArrayList;
import java.util.Date;

public class Course<T> {
	
	private String label;
	private Date startDate;
	private Date endDate;
	private ArrayList<Student> studentList;
	private Professor professor;
	private ArrayList<T> courseList = new ArrayList<T>();
	
	public Course(String label, Date startDate, Date endDate, ArrayList<Student> studentList,
			Professor professor) {
		super();
		setLabel(label);
		setStartDate(startDate);
		setEndDate(endDate);
		this.studentList = new ArrayList<Student>();
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

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public Professor getProfessorList() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void addCourse(T course){
		courseList.add(course);
	}
	
	public void  modifyCourse(){
		
	}
	
	public void  removeCourse(T course){
		courseList.remove(course);
	}

	@Override
	public String toString() {
		return "Course [label=" + label + ", startDate=" + startDate + ", endDate=" + endDate + ", studentList="
				+ studentList + ", professorList=" + professor + "]";
	}
	
	
	
	

}
