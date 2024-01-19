package fr.fms.entities;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Gestion_ecole {
	public static void main(String[] args) {

		Data.addStudent();
		Data.addProfessor();
		Data.addCourse();

		System.out.println("Liste d'élève :");
		Data.display(Data.studentList);
		System.out.println();
		
		System.out.println("Liste des professeurs :");
		Data.display(Data.professorList);
		System.out.println();
		
		System.out.println("Liste des cours :");
		Data.displayCourse();
//		Data.displayStudentList("musique");

//		Data.removeProfessor("michel");

		// Recherche d'adresse identique
		Data.isSibling();
		
		System.out.println("\n---------------------------------\n");
		
		ArrayList<Person> dessinStudents = new ArrayList<Person>();
		dessinStudents.add(Data.studentList.get(1));
		dessinStudents.add(Data.studentList.get(3));
		dessinStudents.add(Data.studentList.get(5));
		
		Course dessin = new Course("dessin", LocalDate().now(), LocalDate().now(), dessinStudents, Data.professorList.get(2));
		
		Person hernandez = new Professor("luiz", "hernandez", 42, new Address("63 rue des oliviers", "Strasbourg", 67000, "France"), Data.courseList, new Date());
		
		Data.professorList.add(hernandez);
		
		Person max = new Students("max", "thirioux", 27,
				new Address("48 boulevard des rois", "Paris", 75000, "France"), Data.courseList, 26310);
		Data.studentList.add(max);
		
		dessin.addCourse(dessin);
		
		Data.displayCourse();
		
		System.out.println("\n---------------------------------\n");

		LocalDate startDate = LocalDate.of(2023, Month.DECEMBER, 11);
		LocalDate endDate = LocalDate.of(2023, Month.DECEMBER, 17);
		
			
		dessin.modifyCourse("SVT", startDate, endDate, dessinStudents, (Professor) Data.professorList.get(3));
			
		for(Course course : Data.courseList) {
			System.out.println(course);
		}
		
		
		
		

	}

	private static LocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
