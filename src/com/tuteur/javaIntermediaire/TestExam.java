package com.tuteur.javaIntermediaire;

import java.util.Scanner;

public class TestExam {
 public static void main(String[] args) {
	 Scanner clavier  = new Scanner(System.in);
	 System.out.println("entrez la matiere concernée");
	 String matiere = clavier.nextLine();
	 Examen examen = new Examen();
	 examen.afficher(matiere);
	 clavier.close();
 }
}
