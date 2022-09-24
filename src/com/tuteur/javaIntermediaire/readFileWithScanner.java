package com.tuteur.javaIntermediaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFileWithScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		String nomFichier = "D:\\licence 2 uvs\\semestre 4\\langage uml\\TD1.txt";
		
	    File file = new File(nomFichier);
		
		Scanner in = new Scanner(file);
		
        while(in.hasNextLine()) {
        	
            String line = in.nextLine();
            
            System.out.println(line);
        }
        
        in.close();
	}

}
