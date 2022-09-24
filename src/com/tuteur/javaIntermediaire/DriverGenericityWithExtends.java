package com.tuteur.javaIntermediaire;

import java.util.ArrayList;
import java.util.List;

public class DriverGenericityWithExtends {

	public static void main(String[] args) {
		
//		List<Prédateur> predateur = new ArrayList<>();
		
		List<Lion> lion = new ArrayList<>();
		
		List<Leopard> leopard = new ArrayList<>();
		
//		predateur.add(new Prédateur());
//		predateur.add(new Prédateur());
//		predateur.add(new Prédateur());
//		predateur.add(new Prédateur());
		
		lion.add(new Lion());
		lion.add(new Lion());
		lion.add(new Lion());
		lion.add(new Lion());
		
		leopard.add(new Leopard());
		leopard.add(new Leopard());
		leopard.add(new Leopard());
		leopard.add(new Leopard());
		
//		lister(predateur);
		lister(lion);
		lister(leopard);
	}
  public static void lister(List<? extends Prédateur> predateur) {
	  
	  for(Prédateur p  : predateur) {
		  System.out.println(p);
	  }
  }
}
