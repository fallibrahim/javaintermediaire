package com.tuteur.javaIntermediaire;

import java.util.Scanner;

public class ArrChar {

	public static void main(String[] args)
	{
		
		try(Scanner scanner = new Scanner(System.in))
		{
			
			System.out.println("Entrez une lettre svp");
			
			String text = scanner.nextLine();
			
			char[] arr = text.toCharArray();
			
			for(int i = arr.length-1; i >= 0; i--)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			
			System.err.println("Erreur.");
			
		}
	}

}
