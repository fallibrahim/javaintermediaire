package com.tuteur.javaIntermediaire;

import javax.swing.JOptionPane;

public class BoiteDeDialogue {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("quel est ton nom");
		 JOptionPane.showMessageDialog(null,"bonjour "+nom);

	}

}
		