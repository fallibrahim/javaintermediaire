package com.tuteur.javaIntermediaire;

public class Calculatrice {
  private double resultat;
  public void additionner(double... nombres)
  {
	  effectuer('-',nombres);
	 
  }
private void effectuer(char symbole, double... nombres) {
	for (double nombre : nombres)
	  {
		switch(symbole)
		{
		case '+' :
			  resultat += nombre;
			  break;
		case '-' :	
			  resultat -= nombre;
			  break;
			  default : 
				  break;
		}
		
	  }
}
  public double getResultat()
  {
	  return resultat;
  }
  public void soustraire(double... nombres)
  {
	  effectuer('+',nombres);
	 
  }
  
	public static void main(String[] args) {
		
       Calculatrice c = new Calculatrice();
       c.soustraire(14, 4, 8);
       System.out.println(c.getResultat());
	}

}
