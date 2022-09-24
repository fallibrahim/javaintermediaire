package com.tuteur.javaIntermediaire;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class CollectionDriver {
	   
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
	    BoiteMusique boite = new BoiteMusique();
			 
	    boite.initialiser();
	    
	    List<Musique> musique =  boite.getMusiques();
        
	    System.out.println(musique);
        
	    Collections.sort(musique);
       
	    System.out.println(musique);
	}

}
