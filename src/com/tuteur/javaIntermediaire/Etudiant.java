package com.tuteur.javaIntermediaire;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Etudiant implements Serializable
{
private static final long serialVersionUID = 1L;

private  final String INE;
  
private String firstName;
  
private String lastName;

private String email;

private String numberPhone;
  
 public Etudiant(String INE, String firstName, String lastName, String email, String numberPhone)
 {
	 this.INE = INE;
	 
	 this.firstName = firstName;
	 
	 this.lastName = lastName;
			 
	 this.email = email;
	 
	 this.numberPhone = numberPhone;
 }
 @Override
 public String toString() {
	 
	 return String.format("l\'étudiant à comme identifiant: %s, et son nom est %s",INE,firstName,lastName,email,numberPhone);
	 
 }
	public static void main(String[] args) {
		
		Etudiant ibrahima = new Etudiant("N04901820191", "Ibrahima", "fall","ibrahimafall095@gmail.com", "773923730");
		
		Etudiant dev = new Etudiant("N23499397892", "Daouda", "Mengue","daouda.mengue@uvs.edu.sn", "773853409");
		
		System.out.println(ibrahima);
		
		System.out.println(dev);
		
		try (FileOutputStream fos = new FileOutputStream("etudiant.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(ibrahima);
			
			oos.writeObject(dev);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
