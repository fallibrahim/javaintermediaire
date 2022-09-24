package com.tuteur.javaIntermediaire;

public class Personnel implements Comparable<Personnel>
{
private String nom;
private String prenom;

public Personnel(String nom, String prenom)
{
   this.nom = nom;
   this.prenom = prenom;
}

public String getNom() 
{
	return nom;
}

public String getPrenom() 
{
	return prenom;
}

@Override
public String toString() {
	
   return nom + " " + prenom;
 
 }

@Override
public int compareTo(Personnel autreMusiques) {
   
	 int test = nom.toLowerCase().compareTo(autreMusiques.getNom().toLowerCase());
	
	if(test == 0) {
		return prenom.toLowerCase().compareTo(autreMusiques.getPrenom().toLowerCase());
	}
	
	return test;
}
}
