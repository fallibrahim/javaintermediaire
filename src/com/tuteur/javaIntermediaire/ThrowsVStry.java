package com.tuteur.javaIntermediaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsVStry {

	public static void main(String[] args) {
		
		File file = new File("goes.txt");
		try 
		{
			
			FileReader fileReader = new FileReader(file);
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Ce fichier n\'existe pas.");
			
		}

	}

}
