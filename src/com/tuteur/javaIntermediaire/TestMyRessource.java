package com.tuteur.javaIntermediaire;

public class TestMyRessource {

	public static void main(String[] args) {
		try(MyRessource rs = new MyRessource()){
			
		}catch(TDNException e) {
			e.printStackTrace();
		}
	}

}
