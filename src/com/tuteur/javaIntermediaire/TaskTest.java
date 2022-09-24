package com.tuteur.javaIntermediaire;

import java.util.Scanner;

public class TaskTest {

	public static void main(String[] args) {
	

		Task tache1 = new Task("titre numero 1","Voici la description de l'objet 1");
		Task tache2 = new Task("titre numero 2","Voici la description de l'objet 2");
		Task tache3 = new Task("titre numero 3","Voici la description de l'objet 3");
        
		tache2.complete();
		System.out.println(tache2.completed);
		System.out.println(tache2.titre);
		Scanner sc = new Scanner(System.in);
		System.out.println("donnez l\'année svp");
		int an = sc.nextInt();
		tache3.setAnnee(an);
		System.out.println(tache3.annee);
		sc.close();
	}

}
