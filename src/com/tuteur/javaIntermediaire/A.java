package com.tuteur.javaIntermediaire;

public class A {
   private int att1;
   private String att2;
   
   public A(int att1, String att2)
   {
	   this.att1 = att1;
	   this.att2 = att2;
	   
	  new B().communiquer(); 
   }
   class B extends C implements Animal
   {
	   public B(){
		   super();
		   System.out.printf("je suis le constructeur de la classe B qui contient les attributs %d et %s \n",att1,att2);
	   }

	@Override
	public void communiquer() {
		System.out.println("je communique");
	}
	
   }
   class C
   {
	  public C() {
		  System.out.println("je suis le constructeur de la class C");
	  } 
   }
}
