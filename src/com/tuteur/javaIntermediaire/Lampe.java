package com.tuteur.javaIntermediaire;

public class Lampe {
private boolean etat;

public Lampe(boolean etat)
{
	this.etat = etat;
}
public boolean estAllumee()
{
  return this.etat;
}
 public void modifierEtat() {
	 this.etat = !this.etat;
 }
}
