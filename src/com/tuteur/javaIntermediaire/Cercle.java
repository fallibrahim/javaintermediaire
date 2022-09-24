package com.tuteur.javaIntermediaire;

public class Cercle extends Formes{
	protected int rayon = 2;
	
	@Override
	public double aire() {
		return Math.PI * rayon * rayon;
	}

	
}
