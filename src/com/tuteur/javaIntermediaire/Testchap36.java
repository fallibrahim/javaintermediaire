package com.tuteur.javaIntermediaire;

public class Testchap36 {
  public static int a;	
  public int b;
  
  public Testchap36() {
	  b = 3;
	  a = 5;
  }
	public static void main(String[] args) {
		 System.out.println(new Testchap36().b);
		 System.out.println(Testchap36.a);
	}

}
