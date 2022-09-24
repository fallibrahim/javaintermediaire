package com.tuteur.javaIntermediaire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseBufferedReader {

	public static void main(String[] args) {
		File file = new File("goMyCode.txt");
		BufferedReader bf = null;
		try {
			FileReader fr = new FileReader(file);
			
			 bf = new BufferedReader(fr);
			String line;
			while((line = bf.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			
			System.err.printf("le contenu du fichier %s n\'existe pas ",file.toString());
		}
		catch(Exception e) 
		{
			
			System.err.println("Impossible de lire le fichier "+file.toString());
		}
		finally
	   {
       try 
       {
		bf.close();
	   } 
       catch (IOException e) 
       {
		System.out.println("Impossible de fermer le fichier "+file.toString());
		
       }
       catch(NullPointerException e)
       {
		System.err.println("Impossible d\'ouvrir le fichier "+file.toString());
	   }
	 } 
	}

}
