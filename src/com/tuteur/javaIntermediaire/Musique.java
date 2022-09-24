package com.tuteur.javaIntermediaire;

public class Musique implements Comparable<Musique>
{	
private String titre;

private String auteur;

private static  ParametreDeTri parametreDeTri = ParametreDeTri.AUTEUR;

public Musique(String titre, String auteur) 
{	
	this.titre = titre;
	 
	this.auteur = auteur;
}
public void setParametreDeTri(ParametreDeTri parametreDeTri) {
	
	Musique.parametreDeTri = parametreDeTri;
}
public String getTitre() 
{
	return titre;
}

public void setTitre(String titre) 
{
	this.titre = titre;
}

public String getAuteur()
{
	return auteur;
}

public void setAuteur(String auteur) 
{
	this.auteur = auteur;
}

    @Override
	public String toString() 
    {
    	if(Musique.parametreDeTri == ParametreDeTri.AUTEUR) 
    	{
    		return auteur;
    	}
    	else
    	{
    		return titre;
    	}
		
    }

	@Override
	public int compareTo(Musique autreMusiques) {
		
	if(Musique.parametreDeTri == ParametreDeTri.AUTEUR) {
	 
		return this.auteur.toLowerCase().compareTo(autreMusiques.getAuteur().toLowerCase());
	}
	   return this.auteur.toLowerCase().compareTo(autreMusiques.getTitre().toLowerCase());
	
	}
}
