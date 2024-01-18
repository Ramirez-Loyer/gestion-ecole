package fr.fms.entities;

import java.util.Arrays;

public class Gestion_ecole {
public static void main(String[] args) {
	
	Data.addStudent();
	Data.addProfessor();
	Data.addCourse();
	
	System.out.println("***********" + Data.studentList);
	
}
}
