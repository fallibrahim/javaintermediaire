package com.tuteur.javaIntermediaire;

public class TestFormes {

	public static void main(String[] args) {
	//System.out.println(new Triangle().aire());
     Formes[] tab = new Formes[3];
     Formes forme1 = new Cercle();
     Formes forme2 = new Triangle();
     Formes forme3 = new Carree();
     tab[0] = forme1;
     tab[1] = forme2;
     tab[2] = forme3;
     for (Formes formes : tab) {
    	 System.out.println(formes.aire());
     }
     
	}

}
