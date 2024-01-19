package fr.fms.entities;

import java.util.*;

public class Gestion_ecole {
	public static void main(String[] args) {

		Data.addStudent();
		Data.addProfessor();
		Data.addCourse();

//		Data.displayStudentList("musique");

//		Data.removeProfessor("michel");

		// Recherche d'adresse identique
		Data.isSibling();

	}

}
