package com.tuteur.javaIntermediaire;

public class Interrupteur {
  public boolean position;
  public Lampe lampe;
  public Interrupteur(Lampe lampe)
  {
	  this.lampe = lampe;
	  this.position = lampe.estAllumee();
  }
  public String getPosition()
  {
	  if(position == true)
	  {
		  return "On";
	  }
	  else
	  {
		  return "Off";
	  }
  }
  public void changePosition()
  {
	  lampe.modifierEtat();
	  position = lampe.estAllumee();
  }
  
}
