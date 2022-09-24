package com.tuteur.javaIntermediaire;

public class TestInterFace {

	public static void main(String[] args) {
		
	  Animal animal1 = new Chat();
	  animal1.communiquer();
	  Animal animal2 = new Chien();
	  animal2.communiquer();  
	}

}
