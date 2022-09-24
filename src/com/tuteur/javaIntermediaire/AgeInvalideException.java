package com.tuteur.javaIntermediaire;

public class AgeInvalideException extends Exception{
 
	private static final long serialVersionUID = 1L;

	public AgeInvalideException(String message) {
		super(message);
	}
}
