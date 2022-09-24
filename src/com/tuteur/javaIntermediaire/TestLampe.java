package com.tuteur.javaIntermediaire;

public class TestLampe {

	public static void main(String[] args) {
		Lampe lampe = new Lampe(true);
		
		Interrupteur interrupteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllumee());
		
		System.out.println(interrupteur.getPosition());
		interrupteur.changePosition();
	    System.out.println(lampe.estAllumee());
		
		System.out.println(interrupteur.getPosition());

}
	
}