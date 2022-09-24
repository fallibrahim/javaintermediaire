package com.tuteur.javaIntermediaire;

public class Task {
  public String titre;
  public String description;
  public int annee;
  public boolean completed;
  
  public Task(String titre, String desc)
  {
	  this.titre = titre;
	  this.description = desc;
  }
  public void complete()
  {
	  completed = true;
  }
  public void setAnnee(int annee) {
	  if (annee < 2022)
	  {
		  System.out.println("obsolete");
	  }else
	  {
		 this.annee = annee;
	  }
		  
  }
}
