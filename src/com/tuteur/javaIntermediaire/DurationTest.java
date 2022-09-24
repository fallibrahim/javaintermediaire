package com.tuteur.javaIntermediaire;

import java.util.Scanner;

public class DurationTest {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez quelque chose?");
		long startTime = System.currentTimeMillis();
		
		clavier.nextLine();
		
		long endTime = System.currentTimeMillis();
		
		long timeElapsed = (endTime - startTime) / 1000;
		
		System.out.printf("temps écoulé : %s seconds\n",timeElapsed);
		System.out.println("\nAppuyer sur la touche Entrer pour quitter!\n");
		clavier.nextLine();
		clavier.close();
	}

}
