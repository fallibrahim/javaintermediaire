package com.tuteur.javaIntermediaire;

public class CompteBanquaire {
private String numeroCompte;
private String nomProprietaire;
private int solde;
	public CompteBanquaire(String nomProprietaire, int solde) {
	this.nomProprietaire = nomProprietaire;
	this.solde = solde;
	
}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public String getNomProprietaire() {
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public String toString() {
		return String.format("le propretaire de ce compte est %s. le solde est : %d FCFA",nomProprietaire,solde);
	}
	public static void main(String[] args) {
		CompteBanquaire cb = new CompteBanquaire("Ibrahima fall",50000);
		System.out.println(cb);

	}

}
