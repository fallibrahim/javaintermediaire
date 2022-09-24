package com.tuteur.javaIntermediaire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoiteMusique 
{
	
	private List<Musique> musiques = new ArrayList<>();
	
	public List<Musique> getMusiques() 
	{
		return musiques;
	}
	
	public void initialiser()  throws FileNotFoundException, IOException 
	{
	    ChargerMusique();           
	}


	private void ChargerMusique() throws IOException, FileNotFoundException 
	{
		
		    File file = new File("musique.txt");
		     
		     try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
		     {
		          String ligne;
		    	
		    	  while((ligne = bufferedReader.readLine()) != null) 
		    	  {
		    		    AjouterMusique(ligne);
		    	  }
		     }
	}
	
	private void AjouterMusique(String ligne) 
	{
		String[] parties = ligne.split("/");
		
		musiques.add(new Musique(parties[0], parties[1]));
	}
}
