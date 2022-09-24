package com.tuteur.javaIntermediaire;

public class Special <T>{

private T attribut;

public Special() {
	attribut = null;
}

public Special(T attr) {
	attribut = attr;
}

public T getAttribut() {
	return attribut;
}

public void setAttribut(T attr) {
	attribut = attr;
}

public static void main(String[] args) {
		
  Special <String> sp1 = new Special<>("toto");
 
  System.out.println(sp1.getAttribut());
  
  Special <Integer> sp2 = new Special<>();
  sp2.setAttribut(11557);
  
  System.out.println(sp2.getAttribut());
}

}
