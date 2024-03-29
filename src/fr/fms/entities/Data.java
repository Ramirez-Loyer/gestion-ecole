package fr.fms.entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Data {

	public static ArrayList<Person> studentList = new ArrayList<>();
	public static ArrayList<Person> professorList = new ArrayList<>();
	public static ArrayList<Course> courseList = new ArrayList<>();

	public static void addStudent() {
		Students alejandra = new Students("alejandra", "ramirez", 22,
				new Address("48 rue des roses", "Toulouse", 31300, "France"), courseList, 25960);
		Students frederic = new Students("frederic", "bec", 32,
				new Address("48 impasse des tulipes", "Marseille", 13300, "France"), courseList, 45100);
		Students gilles = new Students("gilles", "quodbach", 18,
				new Address("48 rue des paquerettes", "Paris", 75300, "France"), courseList, 25650);
		Students yves = new Students("yves", "dupont", 60,
				new Address("48 route des buissons", "Lyon", 69000, "France"), courseList, 95100);
		Students donovan = new Students("donovan", "seulin", 30,
				new Address("48 chemin des dames", "Lille", 59300, "France"), courseList, 75100);
		Students robert = new Students("robert", "luiz", 42,
				new Address("48 rue des roses", "Toulouse", 64300, "France"), courseList, 12500);
		Students kevin = new Students("kevin", "seulin", 33,
				new Address("48 chemin des dames", "Lille", 59300, "France"), courseList, 19500);

		studentList.add(alejandra);
		studentList.add(frederic);
		studentList.add(gilles);
		studentList.add(yves);
		studentList.add(donovan);
		studentList.add(robert);

	}

	public static void addProfessor() {
		Professor gerard = new Professor("gerard", "michel", 50,
				new Address("1 rue des chataigne", "Toulouse", 31300, "France"), courseList, new Date());
		Professor norbert = new Professor("norbert", "dupond", 45,
				new Address("481 impasse des pins", "Marseille", 13300, "France"), courseList, new Date());
		Professor hubert = new Professor("hubert", "martin", 62,
				new Address("20 rue des coquelicots", "Paris", 75300, "France"), courseList, new Date());
		Professor jeanyves = new Professor("jeanyves", "dubois", 52,
				new Address("120 route des joncquilles", "Lyon", 69000, "France"), courseList, new Date());
		Professor henri = new Professor("henri", "durand", 48,
				new Address("123 chemin des pommiers", "Lille", 59300, "France"), courseList, new Date());
		Professor jacques = new Professor("jacques", "dubuisson", 20,
				new Address("63 boulevard des pruniers", "Bayonne", 64300, "France"), courseList, new Date());

		professorList.add(gerard);
		professorList.add(norbert);
		professorList.add(hubert);
		professorList.add(jeanyves);
		professorList.add(henri);
		professorList.add(jacques);

	}

	public static void addCourse() {
		Course math = new Course("mathematique", LocalDate.now(), LocalDate.now(), studentList, professorList.get(0));
		Course musique = new Course("musique", LocalDate.now(), LocalDate.now(), studentList, professorList.get(1));
		Course francais = new Course("francais", LocalDate.now(), LocalDate.now(), studentList, professorList.get(2));
		Course histoire = new Course("histoire", LocalDate.now(), LocalDate.now(), studentList, professorList.get(3));
		Course geographie = new Course("geographie", LocalDate.now(), LocalDate.now(), studentList,
				professorList.get(4));
		Course anglais = new Course("anglais", LocalDate.now(), LocalDate.now(), studentList, professorList.get(5));

		courseList.add(math);
		courseList.add(musique);
		courseList.add(francais);
		courseList.add(histoire);
		courseList.add(geographie);
		courseList.add(anglais);

	}
	
	public static void display(ArrayList<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
	public static void displayCourse() {
		for (Course course : courseList) {
			System.out.println(course);
		}
	}

	// Affiche la liste des �tudiants inscrit � un cours donn�.
	public static void displayStudentList(String course) {
		int courseNumber = -1;
		switch (course) {
		case "math":
			courseNumber = 0;
		case "musique":
			courseNumber = 1;
		case "francais":
			courseNumber = 2;
		case "histoire":
			courseNumber = 3;
		case "geographie":
			courseNumber = 4;
		case "anglais":
			courseNumber = 5;
		}
		Course courseList = Data.courseList.get(courseNumber);
		ArrayList<Person> studentsList = courseList.getStudentList();
		System.out.println(course + " Student List" + studentsList);

		// Trouver si address identique entre �l�ves
	}

//	public static void removeProfessor(String professorName) {
//		// Recherche du professeur
//		int profIndex = -1;
//		for (Person prof : Data.professorList) {
//			if (prof.getLastName().equals(professorName)) {
//				profIndex = professorList.indexOf(prof);
//			} else {
//				System.out.println("Aucun professeur ne correspond !");
//			}
//		}
//		professorList.remove(profIndex);
//	}

	// Recherche adresse identiqueS
	public static void isSibling() {

		String student1Index = "";
		String student2Index = "";

		for (int i = 0; i < Data.studentList.size(); i++) {
			for (int j = i + 1; j < Data.studentList.size(); j++) {
				if (Data.studentList.get(i).getAddress().getStreet().equals(Data.studentList.get(j).getAddress().getStreet()) 
						&& (Data.studentList.get(i).getAddress().getCity().equals(Data.studentList.get(j).getAddress().getCity()) )) {
					student1Index = Data.studentList.get(i).getFirstName();
					student2Index = Data.studentList.get(j).getFirstName();
				}
			}
		}
		System.out.println((!student1Index.isEmpty()) ?(student1Index + " and " + student2Index + " are sibling !") : ("No sibling student founded"));

	}
}
