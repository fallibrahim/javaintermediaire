package com.tuteur.javaIntermediaire;

import javax.swing.JOptionPane;

public class MyRessource implements TDNCloseable
{

	@Override
	public void close() throws TDNException {
		JOptionPane.showMessageDialog(null, "Fermeture de super ressource...");
	}
 	
}
