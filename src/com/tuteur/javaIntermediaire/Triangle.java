package com.tuteur.javaIntermediaire;

public class Triangle extends Formes{
  protected int base = 4;
  protected int hauteur = 2;
  
@Override
public double aire() {

	return base * hauteur / 2;
}


  
}
