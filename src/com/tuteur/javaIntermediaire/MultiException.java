package com.tuteur.javaIntermediaire;

import java.text.ParseException;

public class MultiException {

	private String prenom;
	private String nom;
	private int age;
	
	public MultiException(String prenom, String nom) {
		setPrenom(prenom);
		setNom(nom);
	}
	
	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) throws AgeInvalideException{
		if(age > 35)
		{
			throw new AgeInvalideException("Trop agée pour y participer");
		}
		this.age = age;
	}

	public void setAge(String value) throws ParseException, AgeInvalideException{
		try {
			 int age = Integer.parseInt(value);
			 setAge(age);
		}catch(NumberFormatException e) {
			throw new ParseException("format fournie est invalide", 15);
		}
		
	

	}
  @Override
  public String toString() {
	
	  StringBuilder sb = new StringBuilder();
	  sb.append("prénom "+getPrenom()+"\n");
	  sb.append("nom "+getNom()+"\n");
	  sb.append("Age "+getAge()+"\n");
	
	  return sb.toString(); 
    }

}
